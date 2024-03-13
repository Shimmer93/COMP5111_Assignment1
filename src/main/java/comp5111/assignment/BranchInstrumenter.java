package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JGotoStmt;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JIfStmt;
import soot.jimple.internal.JReturnStmt;
import soot.jimple.internal.JReturnVoidStmt;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;
// import java.util.List;

public class BranchInstrumenter extends BodyTransformer{
	
	/* some internal fields */
    static SootClass counterClass;
    static SootMethod addInvocationBranchMethod;
    static SootMethod addInvocationTargetMethod;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.BranchCounter");
        // List<SootMethod> methods = counterClass.getMethods();
        // for (SootMethod method : methods) {
        //     System.out.println("method: " + method.getSubSignature());
        // }
        addInvocationBranchMethod = counterClass.getMethod("void addBranchInvocation(java.lang.String,java.lang.String,java.lang.String)");
        addInvocationTargetMethod = counterClass.getMethod("void addTargetInvocation(java.lang.String,java.lang.String,java.lang.String)");
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
            
            // skip identity statements
            if (!(stmt instanceof JIfStmt)) {
                continue;
            }
            Stmt target = ((JIfStmt) stmt).getTarget();
            
            String branchIdentifier = method.getSignature() + index;
            BranchCounter.addBranch(branchIdentifier, className, stmt.toString(), target.toString());

            InvokeExpr incExpr = null;
            incExpr = Jimple.v().newStaticInvokeExpr(addInvocationBranchMethod.makeRef(), StringConstant.v(branchIdentifier), StringConstant.v(className), StringConstant.v(stmt.toString()));
            Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
            units.insertAfter(incStmt, stmt);

            InvokeExpr incExpr2 = null;
            incExpr2 = Jimple.v().newStaticInvokeExpr(addInvocationTargetMethod.makeRef(), StringConstant.v(branchIdentifier), StringConstant.v(className), StringConstant.v(target.toString()));
            Stmt incStmt2 = Jimple.v().newInvokeStmt(incExpr2);
            units.insertBefore(incStmt2, stmt);

            index++;
        }    	
    }
}
