package comp5111.assignment;

import java.util.*;
import java.io.*;

public class Counter {
    private static class StmtData {
        public String stmtString;
        public String methodSignature;
        public int lineNumber;
        public int numFailExec;
        public int numPassExec;
        public boolean invocated;
        public double score;
        public int rank;

        public StmtData(String stmtString, String methodSignature, int lineNumber) {
            this.stmtString = stmtString;
            this.methodSignature = methodSignature;
            this.lineNumber = lineNumber;
            this.numFailExec = 0;
            this.numPassExec = 0;
            this.score =0.0f;
        }

        public void invocate() {
            this.invocated = true;
        }

        public void resetInvocated() {
            this.invocated = false;
        }

        public void updateNumExec(boolean pass) {
            if (invocated) {
                if (pass) {
                    this.numPassExec++;
                } else {
                    this.numFailExec++;
                }
            }
        }
    }

    private static Map<String, StmtData> stmtDataMap = new HashMap<>();
    private static int numFailTests = 0;
    private static int numPassTests = 0;

    public static synchronized void addStmt(String stmtIdentifier, String stmtString, String methodSignature, int lineNumber) {
        stmtDataMap.put(stmtIdentifier, new StmtData(stmtString, methodSignature, lineNumber));
	}

    public static synchronized void invocateStmt(String stmtIdentifier) {
        stmtDataMap.get(stmtIdentifier).invocate();
    }

    public static synchronized void updateCurrentTest(boolean pass) {
        if (pass) {
            numPassTests++;
        } else {
            numFailTests++;
        }
        for (StmtData stmtData : stmtDataMap.values()) {
            stmtData.updateNumExec(pass);
            stmtData.resetInvocated();
        }
    }

    public static double ochiai(int numPassExec, int numFailExec, int numPass, int numFail) {
        if (numPassExec == 0 && numFailExec == 0) {
            return 0.0;
        }
        return ((double) numFailExec) / Math.sqrt(numFail * (numFailExec + numPassExec));
    }

    public static void report(String testClassName) {
        // TODO
    	try {
			OutputStream os = new FileOutputStream("report/" + testClassName + "_ranking.tsv");

			for (StmtData stmtData : stmtDataMap.values()) {
                stmtData.score = ochiai(stmtData.numPassExec, stmtData.numFailExec, numPassTests, numFailTests);
                // System.out.println(stmtData.score);
				// os.write(String.format("%s\t%s\t%d\t%d\n", stmtData.methodSignature, 
				// 		stmtData.stmtString, stmtData.numFailExec, stmtData.numPassExec).getBytes());
			}

            List<StmtData> stmtDataList = new ArrayList<>(stmtDataMap.values());
            stmtDataList.sort(Comparator.comparingDouble((StmtData stmtData) -> -stmtData.score).thenComparing((StmtData stmtData) -> stmtData.methodSignature + stmtData.stmtString));

            double currScore = 1000;
            int numLarger = 0;
            int numEqual = 0;
            for (int i = 0; i < stmtDataList.size(); i++) {
                StmtData stmtData = stmtDataList.get(i);
                if (stmtData.score < currScore) {
                    if (i > 0) {
                        for (int j = i - 1; j >= i - numEqual; j--) {
                            stmtDataList.get(j).rank = (numLarger * 2 + numEqual + 1) / 2;
                        }
                    }
                    numLarger += numEqual;
                    numEqual = 1;
                    currScore = stmtData.score;
                } else {
                    numEqual++;
                }
                if (i == stmtDataList.size() - 1) {
                    for (int j = i; j >= i - numEqual; j--) {
                        stmtDataList.get(j).rank = (numLarger * 2 + numEqual + 1) / 2;
                    }
                }
            }

            for (StmtData stmtData : stmtDataList) {
                os.write(String.format("%s\t%s\t%f\t%d\n", stmtData.methodSignature, 
                        stmtData.stmtString, stmtData.score, stmtData.rank).getBytes());
            }

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void reportSuspiciousLocations(String testClassName) {
        try {
			OutputStream os = new FileOutputStream("report/" + testClassName + "_suspects.txt");

            for (StmtData stmtData : stmtDataMap.values()) {
                if (stmtData.score > 0.5) {
                    os.write(String.format("%s\t%s\t%d\n", stmtData.methodSignature, 
                            stmtData.stmtString, stmtData.lineNumber).getBytes());
                }
            }

            os.close();
        } catch (IOException e) {
			e.printStackTrace();
		}
    }

}
