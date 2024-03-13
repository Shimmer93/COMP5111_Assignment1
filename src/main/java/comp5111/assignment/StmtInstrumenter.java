package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;
// import java.util.List;

public class StmtInstrumenter extends BodyTransformer{
	
	/* some internal fields */
    static SootClass counterClass;
    static SootMethod addInvocationMethod;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.StmtCounter");
        // List<SootMethod> methods = counterClass.getMethods();
        // for (SootMethod method : methods) {
        //     System.out.println("method: " + method.getSubSignature());
        // }
        addInvocationMethod = counterClass.getMethod("void addStmtInvocation(java.lang.String,java.lang.String)");
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
        System.out.println("instrumenting method: " + method.getSignature());
        
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

            String stmtIdentifier = method.getSignature() + index;
            int lineNumber = stmt.getJavaSourceStartLineNumber();
            StmtCounter.addStmt(stmtIdentifier, className, stmt.toString(), lineNumber);

            InvokeExpr incExpr = null;
            incExpr = Jimple.v().newStaticInvokeExpr(addInvocationMethod.makeRef(), 
                StringConstant.v(stmtIdentifier), StringConstant.v(className));
            Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
            units.insertBefore(incStmt, stmt);

            index++;
        }
    }
}
