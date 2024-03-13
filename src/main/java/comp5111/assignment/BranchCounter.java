package comp5111.assignment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class BranchCounter {

	private static class BranchData {
		public String branchString;
		public int invocated;
		
		public BranchData(String branchString) {
			this.branchString = branchString;
			this.invocated = 0;
		}

		public void invocate() {
			this.invocated++;
		}
	}

	private static Map<String, Map<String, BranchData>> branchDataMap = new HashMap<>();
	private static Map<String, Map<String, BranchData>> targetDataMap = new HashMap<>();
	// private static Map<String, Integer> branchNumInvocationMap = new HashMap<>();
	// private static Map<String, Integer> branchNumMap = new HashMap<>();
	
	public static synchronized void addBranch(String branchIdentifier, String className, String branchString, String targetString) {
		if (!branchDataMap.containsKey(className)) {
			branchDataMap.put(className, new HashMap<String, BranchData>());
		}
		if (!branchDataMap.get(className).containsKey(branchIdentifier)) {
			branchDataMap.get(className).put(branchIdentifier, new BranchData(branchString));
		}

		if (!targetDataMap.containsKey(className)) {
			targetDataMap.put(className, new HashMap<String, BranchData>());
		}
		if (!targetDataMap.get(className).containsKey(branchIdentifier)) {
			targetDataMap.get(className).put(branchIdentifier, new BranchData(targetString));
		}
	}

	public static synchronized void addBranchInvocation(String branchIdentifier, String className, String branchString) {
		assert branchDataMap.containsKey(className);
		branchDataMap.get(className).get(branchIdentifier).invocate();
	}

	public static synchronized void addTargetInvocation(String branchIdentifier, String className, String targetString) {
		assert targetDataMap.containsKey(className);
		targetDataMap.get(className).get(branchIdentifier).invocate();
	}

	public static String[] getClassNames() {
		return branchDataMap.keySet().toArray(new String[0]);
	}

	public static int getNumBranchsInClass(String className) {
		return branchDataMap.get(className).values().size() + targetDataMap.get(className).values().size();
	}

	public static int getNumInvocationsInClass(String className) {
		int numInvocations = 0;
		for (String identifier : branchDataMap.get(className).keySet()) {
			int branch_invocated = branchDataMap.get(className).get(identifier).invocated;
			int target_invocated = targetDataMap.get(className).get(identifier).invocated;
			if (branch_invocated > 0) {
				numInvocations++;
			}
			if (target_invocated > 0 && target_invocated > branch_invocated) {
				numInvocations++;
			}
		}
		return numInvocations;
	}
    
    public static void report() {
    	int numBranchsTotal = 0;
		int numInvocationsTotal = 0;

		for (String className : branchDataMap.keySet()) {
			int numBranchsInClass = getNumBranchsInClass(className);
			int numInvocationsInClass = getNumInvocationsInClass(className);
			float ratio = (float)numInvocationsInClass / numBranchsInClass;
			System.out.println(className + ": " + numInvocationsInClass + " / " + numBranchsInClass + " = " + ratio);
			numBranchsTotal += numBranchsInClass;
			numInvocationsTotal += numInvocationsInClass;

			// try {
			// 	OutputStream os = new FileOutputStream(className + "_branch.txt");
			// 	for (BranchData stmtData : branchDataMap.get(className).values()) {
			// 		String invocated = (stmtData.invocated > 0) ? "T" : "F";
			// 		String line = stmtData.branchString + " " + invocated + "\n";
			// 		os.write(line.getBytes());
			// 	}
			// 	os.close();
			// } catch (IOException e) {
			// 	e.printStackTrace();
			// }
		}

		float ratioTotal = (float)numInvocationsTotal / numBranchsTotal;
		System.out.println("Total: " + numInvocationsTotal + " / " + numBranchsTotal + " = " + ratioTotal);
    }
    
}
