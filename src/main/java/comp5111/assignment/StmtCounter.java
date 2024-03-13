package comp5111.assignment;

import java.util.*;
import java.io.*;

public class StmtCounter {

	private static class StmtData {
		public String stmtString;
		public int lineNumber;
		public boolean invocated;
		
		public StmtData(String stmtString, int lineNumber) {
			this.stmtString = stmtString;
			this.lineNumber = lineNumber;
			this.invocated = false;
		}

		public void invocate() {
			this.invocated = true;
		}
	}

	private static Map<String, Map<String, StmtData>> stmtDataMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumInvocationMap = new HashMap<>();
	// private static Map<String, Integer> stmtNumMap = new HashMap<>();
	
	public static synchronized void addStmt(String stmtIdentifier, String className, String stmtString, int lineNumber) {
		if (!stmtDataMap.containsKey(className)) {
			stmtDataMap.put(className, new HashMap<String, StmtData>());
		}
		stmtDataMap.get(className).put(stmtIdentifier, new StmtData(stmtString, lineNumber));
	}

	public static synchronized void addStmtInvocation(String stmtIdentifier, String className) {
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
    
    public static void report(String testClassName) {
    	int numStmtsTotal = 0;
		int numInvocationsTotal = 0;
		Map<String, Float> coverageStatistics = new HashMap<>();

		try {
			OutputStream os = new FileOutputStream("report/" + testClassName + "_stmt.txt");

			for (String className : stmtDataMap.keySet()) {
				int numStmtsInClass = getNumStmtsInClass(className);
				int numInvocationsInClass = getNumInvocationsInClass(className);
				numStmtsTotal += numStmtsInClass;
				numInvocationsTotal += numInvocationsInClass;
				
				float coverage = (float)numInvocationsInClass / numStmtsInClass;
				coverageStatistics.put(className, coverage);
				System.out.println(className + ": " + numInvocationsInClass + " / " + numStmtsInClass + " = " + coverage);

				os.write(className.getBytes());
				os.write("\n========================================\n".getBytes());
				for (StmtData stmtData : stmtDataMap.get(className).values()) {
					String invocated = stmtData.invocated ? "Yes" : "No";
					String line = Integer.toString(stmtData.lineNumber) + ": " + stmtData.stmtString + " " + invocated + "\n";
					os.write(line.getBytes());
				}
				os.write("\n".getBytes());
			}
			
			os.write("\nSummary\n========================================\n".getBytes());
			
			for (String className : coverageStatistics.keySet()) {
				os.write(className.getBytes());
				os.write("\npercentage: ".getBytes());
				os.write(Float.toString(coverageStatistics.get(className)).getBytes());
				os.write("\n\n".getBytes());
			}
			float coverageTotal = (float)numInvocationsTotal / numStmtsTotal;
			System.out.println("Total: " + numInvocationsTotal + " / " + numStmtsTotal + " = " + coverageTotal);
			os.write("Overall: \n".getBytes());
			os.write(Float.toString(coverageTotal).getBytes());

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
