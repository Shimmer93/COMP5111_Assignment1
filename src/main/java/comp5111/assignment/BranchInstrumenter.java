package comp5111.assignment;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JIfStmt;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;
// import java.util.List;

public class BranchInstrumenter extends BodyTransformer{
	
	/* some internal fields */
    static SootClass counterClass;
    static SootMethod addConditionInvocationMethod;
    static SootMethod addDefaultInvocationMethod;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.BranchCounter");
        // List<SootMethod> methods = counterClass.getMethods();
        // for (SootMethod method : methods) {
        //     System.out.println("method: " + method.getSubSignature());
        // }
        addConditionInvocationMethod = counterClass.getMethod("void addConditionInvocation(java.lang.String,java.lang.String)");
        addDefaultInvocationMethod = counterClass.getMethod("void addDefaultInvocation(java.lang.String,java.lang.String)");
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
            String conditionString = ((JIfStmt) stmt).getCondition().toString();
            String targetString = ((JIfStmt) stmt).getTarget().toString();
            String defaultString = units.getSuccOf(stmt).toString();
            String branchIdentifier = method.getSignature() + index;
            int lineNumber = stmt.getJavaSourceStartLineNumber();
            BranchCounter.addBranch(branchIdentifier, className, conditionString, defaultString, targetString, lineNumber);

            InvokeExpr incExprCondition = null;
            incExprCondition = Jimple.v().newStaticInvokeExpr(addConditionInvocationMethod.makeRef(), 
                StringConstant.v(branchIdentifier), StringConstant.v(className));
            Stmt incStmtCondition = Jimple.v().newInvokeStmt(incExprCondition);
            units.insertBefore(incStmtCondition, stmt);

            InvokeExpr incExprDefault = null;
            incExprDefault = Jimple.v().newStaticInvokeExpr(addDefaultInvocationMethod.makeRef(), 
                StringConstant.v(branchIdentifier), StringConstant.v(className));
            Stmt incStmtDefault = Jimple.v().newInvokeStmt(incExprDefault);
            units.insertAfter(incStmtDefault, stmt);

            index++;
        }    	
    }
}
