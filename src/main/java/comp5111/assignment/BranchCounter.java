package comp5111.assignment;

import java.util.*;
import java.io.*;

public class BranchCounter {

	private static class BranchData {
		public String conditionString;
		public String branchDefaultString;
		public String branchTargetString;
		public int lineNumber;
		public int numDefaultInvocated;
		public int numConditionInvocated;
		
		public BranchData(String conditionString, String branchDefaultString, String branchTargetString, int lineNumber) {
			this.conditionString = conditionString;
			this.branchDefaultString = branchDefaultString;
			this.branchTargetString = branchTargetString;
			this.lineNumber = lineNumber;
			this.numDefaultInvocated = 0;
			this.numConditionInvocated = 0;
		}

		public void invocateDefault() {
			this.numDefaultInvocated++;
		}

		public void invocateCondition() {
			this.numConditionInvocated++;
		}

		public boolean isDefaultInvocated() {
			return this.numDefaultInvocated > 0;
		}
		
		public boolean isTargetInvocated() {
			return this.numConditionInvocated > this.numDefaultInvocated;
		}
	}

	private static Map<String, Map<String, BranchData>> branchDataMap = new HashMap<>();
	
	public static synchronized void addBranch(String branchIdentifier, String className, 
			String conditionString, String branchDefaultString, String branchTargetString, int lineNumber) {
		if (!branchDataMap.containsKey(className)) {
			branchDataMap.put(className, new HashMap<String, BranchData>());
		}
		if (!branchDataMap.get(className).containsKey(branchIdentifier)) {
			branchDataMap.get(className).put(branchIdentifier, 
				new BranchData(conditionString, branchDefaultString, branchTargetString, lineNumber));
		}
	}

	public static synchronized void addConditionInvocation(String branchIdentifier, String className) {
		assert branchDataMap.containsKey(className);
		branchDataMap.get(className).get(branchIdentifier).invocateCondition();
	}

	public static synchronized void addDefaultInvocation(String branchIdentifier, String className) {
		assert branchDataMap.containsKey(className);
		branchDataMap.get(className).get(branchIdentifier).invocateDefault();
	}

	public static String[] getClassNames() {
		return branchDataMap.keySet().toArray(new String[0]);
	}

	public static int getNumBranchsInClass(String className) {
		return branchDataMap.get(className).values().size() * 2;
	}

	public static int getNumInvocationsInClass(String className) {
		int numInvocations = 0;
		for (String identifier : branchDataMap.get(className).keySet()) {
			if (branchDataMap.get(className).get(identifier).isDefaultInvocated()) {
				numInvocations++;
			}
			if (branchDataMap.get(className).get(identifier).isTargetInvocated()) {
				numInvocations++;
			}
		}
		return numInvocations;
	}
    
    public static void report(String testClassName) {
    	int numBranchsTotal = 0;
		int numInvocationsTotal = 0;

		Map<String, Float> coverageStatistics = new HashMap<>();

		try {
			OutputStream os = new FileOutputStream("report/" + testClassName + "_branch.txt");

			for (String className : branchDataMap.keySet()) {
				int numBranchsInClass = getNumBranchsInClass(className);
				int numInvocationsInClass = getNumInvocationsInClass(className);
				numBranchsTotal += numBranchsInClass;
				numInvocationsTotal += numInvocationsInClass;
				
				float coverage = (float)numInvocationsInClass / numBranchsInClass;
				coverageStatistics.put(className, coverage);
				System.out.println(className + ": " + numInvocationsInClass + " / " + numBranchsInClass + " = " + coverage);

				os.write(className.getBytes());
				os.write("\n========================================\n".getBytes());
				for (BranchData branchData : branchDataMap.get(className).values()) {
					String defaultInvocated = branchData.isDefaultInvocated() ? "Yes" : "No";
					String targetInvocated = branchData.isTargetInvocated() ? "Yes" : "No";
					String firstLine = branchData.lineNumber + ": " + branchData.conditionString + "\n";
					String secondLine = "\t" + branchData.branchDefaultString + " " + defaultInvocated + "\n";
					String thirdLine = "\t" + branchData.branchTargetString + " " + targetInvocated + "\n";
					os.write(firstLine.getBytes());
					os.write(secondLine.getBytes());
					os.write(thirdLine.getBytes());
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
			float coverageTotal = (float)numInvocationsTotal / numBranchsTotal;
			System.out.println("Total: " + numInvocationsTotal + " / " + numBranchsTotal + " = " + coverageTotal);
			os.write("Overall: \n".getBytes());
			os.write(Float.toString(coverageTotal).getBytes());

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
