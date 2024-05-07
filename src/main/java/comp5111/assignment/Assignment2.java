package comp5111.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.runner.JUnitCore;
import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class Assignment2 {
    public static void main(String[] args) {
        // TODO we decide to not restrict how you implement main class. So do as you wish to complete assignment 2.
        String testClassName = args[0];
        String[] classArgs = Arrays.copyOfRange(args, 1, args.length);

        instrumentWithSoot(classArgs);

        runJunitTests(testClassName);

        Counter.report(testClassName);
        // Counter.reportSuspiciousLocations(testClassName);
    }

    private static void instrumentWithSoot(String [] classArgs){
    	String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";
        // String libPath = "./lib/*";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }
        
        /*Set the soot-classpath to include the helper class and class to analyze*/
        // System.out.println(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + classUnderTestPath + classPathSeparator + targetPath);
        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(classUnderTestPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        Instrumenter instrumenter = new Instrumenter();
        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // String classUnderTest = "comp5111.example.cut.Subject";
        // pass arguments to soot
        soot.Main.main(classArgs);  // added phases will be executed in this method
    }

    private static void runJunitTests(String testClassName) {
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            testClass = Class.forName(testClassName);
            JUnitCore junit = new JUnitCore();
            System.out.println("Running junit test: " + testClass.getName());
            junit.addListener(new RunListener() {
                public void testFailure(Failure failure) {
                	Counter.updateCurrentTest(false);
                    // System.out.println("Failed: " + failure.getDescription().getMethodName());
                }
                public void testFinished(Description description) throws Exception {
                	Counter.updateCurrentTest(true);
                    // System.out.println("Finished: " + description.getMethodName());
                }
                public void testRunFinished(Result result) throws Exception {
                    System.out.println("Finished: " + result.getRunCount() + " tests");
                }
            });
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}