package comp5111.assignment;

import java.util.*;
import java.io.*;

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

	private static Map<String, Map<String, StmtData>> stmtDataMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumInvocationMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumMap = new HashMap<>();
	
	public static void addStmt(String stmtIdentifier, String className, String stmtString) {
		if (!stmtDataMap.containsKey(className)) {
			stmtDataMap.put(className, new HashMap<String, StmtData>());
		}
		stmtDataMap.get(className).put(stmtIdentifier, new StmtData(stmtString));
	}

	public static void addStmtInvocation(String stmtIdentifier, String className, String stmtString) {
		assert stmtDataMap.containsKey(className);
		stmtDataMap.get(className).get(stmtIdentifier).invocate();
	}

	public static String[] getClassNames() {
		return stmtDataMap.keySet().toArray(new String[0]);
	}

	public static int getNumStmtsInClass(String className) {
		return stmtDataMap.get(className).values().size();
	}

	public static int getNumInvocationsInClass(String className) {
		int numInvocations = 0;
		for (StmtData stmtData : stmtDataMap.get(className).values()) {
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

			try {
				OutputStream os = new FileOutputStream(className + ".txt");
				for (StmtData stmtData : stmtDataMap.get(className).values()) {
					String invocated = stmtData.invocated ? "T" : "F";
					String line = stmtData.stmtString + " " + invocated + "\n";
					os.write(line.getBytes());
				}
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		float ratioTotal = (float)numInvocationsTotal / numStmtsTotal;
		System.out.println("Total: " + numInvocationsTotal + " / " + numStmtsTotal + " = " + ratioTotal);
    }
    
}
