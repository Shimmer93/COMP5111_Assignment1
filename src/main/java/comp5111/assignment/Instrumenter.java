package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;
// import java.util.List;

public class Instrumenter extends BodyTransformer{
	
	/* some internal fields */
    static SootClass counterClass;
    static SootMethod invocateMethod;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.Counter");
        // List<SootMethod> methods = counterClass.getMethods();
        // for (SootMethod method : methods) {
        //     System.out.println("method: " + method.getSubSignature());
        // }
        invocateMethod = counterClass.getMethod("void invocateStmt(java.lang.String)");
    }

	/*
     * internalTransform goes through a method body and inserts counter
     * instructions before method returns
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options){
    	// body's method
        SootMethod method = body.getMethod();

        // get class name
        String className = method.getDeclaringClass().getName();
        
        // debugging
        // System.out.println("instrumenting method: " + method.getSignature());
        
        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();
        
        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        //
        Iterator<?> stmtIt = units.snapshotIterator();
        
        // typical while loop for iterating over each statement
        int index = 0;
        while (stmtIt.hasNext()) {

            // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();

            // there are many kinds of statements, here we are only
            // interested in return statements
            // NOTE: there are two kinds of return statements, with or without return value
            if (stmt instanceof JIdentityStmt) {
            	continue;
            }

            String methodSignature = (String) method.getSignature();
            String stmtIdentifier = methodSignature + index;
            int lineNumber = stmt.getJavaSourceStartLineNumber();
            Counter.addStmt(stmtIdentifier, stmt.toString(), methodSignature, lineNumber);

            InvokeExpr incExpr = null;
            incExpr = Jimple.v().newStaticInvokeExpr(invocateMethod.makeRef(), 
                StringConstant.v(stmtIdentifier));
            Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
            units.insertBefore(incStmt, stmt);

            index++;
        }
    }
}
