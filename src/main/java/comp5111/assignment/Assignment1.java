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

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] " +
                "classname");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classArgs = Arrays.copyOfRange(args, 2, args.length);

        if (args[0].compareTo("0") == 0) {
            // TODO invoke your statement coverage instrument function
        	stmtInstrumentWithSoot(classArgs);

            // TODO run tests on instrumented classes to generate coverage report
            String testClassName = args[1];
        	runJunitTests(testClassName);

        	StmtCounter.report();

        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function
            branchInstrumentWithSoot(classArgs);

            // TODO run tests on instrumented classes to generate coverage report
            String testClassName = args[1];
            runJunitTests(testClassName);

            BranchCounter.report();

        }
    }
    
    private static void stmtInstrumentWithSoot(String [] classArgs){
    	String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }
        
        /*Set the soot-classpath to include the helper class and class to analyze*/
        System.out.println(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        StmtInstrumenter instrumenter = new StmtInstrumenter();
        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // String classUnderTest = "comp5111.example.cut.Subject";
        // pass arguments to soot
        soot.Main.main(classArgs);  // added phases will be executed in this method
    }

    private static void branchInstrumentWithSoot(String [] classArgs){
    	String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }
        
        /*Set the soot-classpath to include the helper class and class to analyze*/
        System.out.println(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        BranchInstrumenter instrumenter = new BranchInstrumenter();
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
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}