package comp5111.assignment;

import java.util.*;

public class StmtCounter {

	private static class StmtData {
		public String stmtString;
		public boolean invocated;
		
		public StmtData(String stmtString) {
			this.stmtString = stmtString;
			this.invocated = false;
		}

		public void invocate() {
			this.invocated = true;
		}
	}

	private static Map<String, List<StmtData>> stmtDataMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumInvocationMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumMap = new HashMap<>();
	
	public static void addStmt(String className, String stmtString) {
		if (!stmtDataMap.containsKey(className)) {
			stmtDataMap.put(className, new ArrayList<StmtData>());
		}
		stmtDataMap.get(className).add(new StmtData(stmtString));
	}

	public static void addStmtInvocation(String className, String stmtString) {
		assert stmtDataMap.containsKey(className);
		for (StmtData stmtData : stmtDataMap.get(className)) {
			if (stmtData.stmtString.equals(stmtString)) {
				stmtData.invocate();
				return;
			}
		}
	}

	public static String[] getClassNames() {
		return stmtDataMap.keySet().toArray(new String[0]);
	}

	public static int getNumStmtsInClass(String className) {
		return stmtDataMap.get(className).size();
	}

	public static int getNumInvocationsInClass(String className) {
		int numInvocations = 0;
		for (StmtData stmtData : stmtDataMap.get(className)) {
			if (stmtData.invocated) {
				numInvocations++;
			}
		}
		return numInvocations;
	}
    
    public static void report() {
    	int numStmtsTotal = 0;
		int numInvocationsTotal = 0;

		for (String className : stmtDataMap.keySet()) {
			int numStmtsInClass = getNumStmtsInClass(className);
			int numInvocationsInClass = getNumInvocationsInClass(className);
			float ratio = (float)numInvocationsInClass / numStmtsInClass;
			System.out.println(className + ": " + numInvocationsInClass + " / " + numStmtsInClass + " = " + ratio);
			numStmtsTotal += numStmtsInClass;
			numInvocationsTotal += numInvocationsInClass;
		}

		float ratioTotal = (float)numInvocationsTotal / numStmtsTotal;
		System.out.println("Total: " + numInvocationsTotal + " / " + numStmtsTotal + " = " + ratioTotal);
    }
    
}
