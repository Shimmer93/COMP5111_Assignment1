package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop10_refined_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test001");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$ParameterHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test002");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$SortTools with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test003");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$TextHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test004");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$NumberHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test006");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$TaskHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test007");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((int) ' ', (-1), (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Class<?> wildcardClass4 = parameterHandler3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap10 = parameterHandler3.parse(charArray6, (int) (byte) -1, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((int) (short) 10, 0, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject(0, (int) ' ', (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test012");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = parameterHandler1.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test013");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("", '#');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test014");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        java.lang.String str8 = taskHandler4.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test015");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        long long9 = numberHandler5.maximum((long) (short) 1, (long) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test016");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        java.lang.Class<?> wildcardClass8 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = parameterHandler1.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        long long12 = numberHandler8.maximum(10L, (long) (byte) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.Class<?> wildcardClass6 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test021");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) ' ', 10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test022");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test023");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("hi!");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test024");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) '4', 100, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test025");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) 10, 1);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject17.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler19 = subject17.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject17.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject17.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler22 = subject17.new TextHandler();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject23.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler26 = subject23.new ParameterHandler();
        char[] charArray30 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler26.parse(charArray30, ' ');
        char[] charArray35 = textHandler22.toUpperCase(charArray30, (int) (byte) 10, 0);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray46 = textHandler22.toLowerCase(charArray43, (int) 'a', (int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap50 = parameterHandler1.parse(charArray46, (int) '#', (-1), '4');
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test026");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Class<?> wildcardClass12 = parameterHandler1.getClass();
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test027");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        java.lang.String str10 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test028");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test029");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((int) (byte) 1, (int) (short) 100, (int) (byte) 10, (-10086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test030");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler38 = subject37.new ParameterHandler();
        char[] charArray45 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap46 = parameterHandler38.parse("hi!", charArray45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler7.parse("hi!", charArray45);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.hasNested("");
        boolean boolean12 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test032");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject(100, (int) (byte) 1, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test033");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        long long16 = numberHandler5.minimum((long) 32, (long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test034");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        boolean boolean8 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test035");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.isMapped("");
        boolean boolean10 = taskHandler4.hasNested("");
        boolean boolean12 = taskHandler4.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test036");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler6.toBooleanObject("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = parameterHandler6.toBooleanObject((int) (short) 1, (int) (short) 100, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test037");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler5 = subject4.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject4.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject4.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject4.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler9 = subject4.new TextHandler();
        char[] charArray11 = textHandler9.newTextBuffer((int) '4');
        char[] charArray13 = textHandler9.newTextBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap17 = parameterHandler3.parse(charArray13, (int) (short) -1, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test038");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        int int22 = numberHandler5.minimum((int) (byte) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test039");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean16 = parameterHandler6.toBooleanObject((int) (short) 100, 32, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test040");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean40 = parameterHandler7.toBooleanObject("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean21 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test042");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.maximum(1, (int) (short) 100, (-10086));
        java.lang.Class<?> wildcardClass25 = numberHandler5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test043");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject19.new TextHandler();
        char[] charArray26 = textHandler24.newTextBuffer((int) '4');
        char[] charArray29 = textHandler5.toLowerCase(charArray26, (int) 'a', (int) '#');
        java.lang.String str33 = textHandler5.escapeJavaStyleString("", true, false);
        java.lang.String str35 = textHandler5.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.getProperty("");
        java.lang.String str10 = taskHandler4.findNext("");
        java.lang.String str12 = taskHandler4.getProperty("");
        boolean boolean14 = taskHandler4.hasNested("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test045");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        char[] charArray49 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler45.parse(charArray49, ' ');
        char[] charArray54 = textHandler41.toUpperCase(charArray49, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler7.parse(charArray54, (int) (byte) 1, 1, '4');
        java.lang.Boolean boolean63 = parameterHandler7.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + boolean63 + "' != '" + true + "'", boolean63, true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test046");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test047");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean23 = parameterHandler6.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test048");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        java.lang.String str8 = taskHandler6.getKey("hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test049");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray6 = null;
        char[] charArray9 = textHandler5.toLowerCase(charArray6, 1, (int) (byte) 1);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test050");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        char[] charArray49 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler45.parse(charArray49, ' ');
        char[] charArray54 = textHandler41.toUpperCase(charArray49, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler7.parse(charArray54, (int) (byte) 1, 1, '4');
        java.lang.Boolean boolean60 = parameterHandler7.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNull(boolean60);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int17 = numberHandler5.compare(100.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test052");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.String str9 = textHandler5.escapeJavaStyleString("hi!", true, false);
        java.lang.String str13 = textHandler5.escapeJavaStyleString("hi!", false, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test054");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-10086), (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test055");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        boolean boolean16 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test056");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("");
        boolean boolean14 = numberHandler5.isNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test057");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        boolean boolean14 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test058");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test059");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.getProperty("hi!");
        java.lang.String str10 = taskHandler4.findNext("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test060");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject19.new TextHandler();
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler26 = subject25.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler27 = subject25.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject25.new ParameterHandler();
        char[] charArray32 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler28.parse(charArray32, ' ');
        char[] charArray37 = textHandler24.toUpperCase(charArray32, (int) (byte) 10, 0);
        char[] charArray39 = textHandler24.newTextBuffer((int) (byte) -1);
        char[] charArray41 = textHandler24.string2char("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap45 = parameterHandler6.parse(charArray41, (int) (short) -1, 32, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(charArray37);
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test061");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        int int20 = numberHandler5.maximum((int) '4', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test063");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        java.lang.Number number20 = numberHandler5.parseNumber("");
        long long24 = numberHandler5.minimum((long) (byte) 100, (long) (short) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test064");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject((int) (byte) 0, (int) (byte) -1, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test065");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        int int26 = numberHandler5.minimum((int) (byte) 100, (int) (short) 100, (int) (short) 0);
        boolean boolean28 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test066");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        boolean[] booleanArray8 = null;
        boolean boolean9 = parameterHandler7.hasOneTrue(booleanArray8);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler13 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject10.new TextHandler();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject16.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject16.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject16.new ParameterHandler();
        char[] charArray23 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler19.parse(charArray23, ' ');
        char[] charArray28 = textHandler15.toUpperCase(charArray23, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler7.parse(charArray28, ' ');
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler32 = subject31.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler33 = subject31.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler34 = subject31.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler35 = subject31.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler36 = subject31.new TextHandler();
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler38 = subject37.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler39 = subject37.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler40 = subject37.new ParameterHandler();
        char[] charArray44 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap46 = parameterHandler40.parse(charArray44, ' ');
        char[] charArray49 = textHandler36.toUpperCase(charArray44, (int) (byte) 10, 0);
        char[] charArray51 = textHandler36.newTextBuffer((int) (byte) -1);
        char[] charArray53 = textHandler36.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap55 = parameterHandler7.parse(charArray53, 'a');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(charArray49);
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[]");
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test067");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler19 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject21.new ParameterHandler();
        char[] charArray28 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler24.parse(charArray28, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler20.parse(charArray28, ' ');
        boolean[] booleanArray39 = new boolean[] { true, true, true, false, false, true };
        boolean boolean40 = parameterHandler20.hasOneTrue(booleanArray39);
        boolean boolean41 = parameterHandler3.hasOneTrue(booleanArray39);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler47 = subject42.new TextHandler();
        char[] charArray49 = textHandler47.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler3.parse(charArray49, '#');
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler53 = subject52.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler54 = subject52.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler55 = subject52.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler56 = subject52.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler57 = subject52.new TextHandler();
        char[] charArray59 = textHandler57.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap61 = parameterHandler3.parse(charArray59, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean66 = parameterHandler3.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap61);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test068");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        java.lang.String str14 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test069");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler19 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject21.new ParameterHandler();
        char[] charArray28 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler24.parse(charArray28, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler20.parse(charArray28, ' ');
        boolean[] booleanArray39 = new boolean[] { true, true, true, false, false, true };
        boolean boolean40 = parameterHandler20.hasOneTrue(booleanArray39);
        boolean boolean41 = parameterHandler3.hasOneTrue(booleanArray39);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = parameterHandler3.parse("", 'a');
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        java.lang.Class<?> wildcardClass10 = parameterHandler1.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test071");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        boolean boolean9 = numberHandler5.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test072");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test073");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("hi!");
        boolean boolean12 = taskHandler4.isMapped("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test074");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        java.lang.Boolean boolean14 = parameterHandler1.toBooleanObject("hi!", "", "hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = parameterHandler1.parse("", 'a');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test075");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject19.new TextHandler();
        char[] charArray26 = textHandler24.newTextBuffer((int) '4');
        char[] charArray29 = textHandler5.toLowerCase(charArray26, (int) 'a', (int) '#');
        java.lang.String str33 = textHandler5.escapeJavaStyleString("", true, false);
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler35 = subject34.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler36 = subject34.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject34.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject34.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler39 = subject34.new TextHandler();
        char[] charArray41 = textHandler39.newTextBuffer((int) '4');
        char[] charArray44 = textHandler5.toLowerCase(charArray41, (-10086), (int) (byte) 100);
        java.lang.String str46 = textHandler5.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test076");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler18 = subject13.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject20.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler22 = subject20.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject20.new ParameterHandler();
        char[] charArray27 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler23.parse(charArray27, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler19.parse(charArray27, ' ');
        boolean[] booleanArray38 = new boolean[] { true, true, true, false, false, true };
        boolean boolean39 = parameterHandler19.hasOneTrue(booleanArray38);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler41.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean48 = parameterHandler41.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler53 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler54 = subject49.new TextHandler();
        char[] charArray56 = textHandler54.newTextBuffer((int) '4');
        char[] charArray58 = textHandler54.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler41.parse(charArray58, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler19.parse(charArray58, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler6.parse("hi!", charArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean70 = parameterHandler6.toBooleanObject("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test077");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        int int10 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10086) + "'", int10 == (-10086));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test078");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        java.lang.String str10 = taskHandler4.getProperty("hi!");
        boolean boolean12 = taskHandler4.isIndexed("");
        int int14 = taskHandler4.getIndex("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test079");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = numberHandler8.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test080");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        char[] charArray29 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler22.parse("hi!", charArray29);
        char[] charArray33 = textHandler5.toUpperCase(charArray29, (-10086), 10);
        java.lang.String str35 = textHandler5.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test081");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.maximum(1, (int) (short) 100, (-10086));
        int int27 = numberHandler5.compare((float) 52, (float) (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test083");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        int int17 = numberHandler5.minimum((int) '4', 0, (int) (short) 1);
        long long21 = numberHandler5.minimum((long) (-10086), (long) (short) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-10086L) + "'", long21 == (-10086L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test084");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray7 = textHandler5.newTextBuffer((int) '4');
        char[] charArray9 = textHandler5.newTextBuffer((-10086));
        java.lang.String str13 = textHandler5.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test085");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (short) 1, (float) (short) 100);
        int int17 = numberHandler5.minimum((int) '4', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test086");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("hi!", 'a');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test087");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) 'a', (int) ' ', 0);
        long long13 = numberHandler5.minimum((-1L), (long) 32, (long) '#');
        boolean boolean15 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test088");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject0.new SortTools();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test089");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Class<?> wildcardClass2 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test090");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        java.lang.String str12 = taskHandler4.findNext("");
        boolean boolean14 = taskHandler4.isIndexed("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test091");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        int int12 = taskHandler4.getIndex("");
        java.lang.Class<?> wildcardClass13 = taskHandler4.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test092");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str5 = textHandler3.unescapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test093");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler13 = subject12.new ParameterHandler();
        char[] charArray20 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler13.parse("hi!", charArray20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler6.parse(charArray20, 'a');
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test094");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test095");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = parameterHandler1.toBooleanObject((int) (byte) 0, 10, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test096");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test097");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.String str9 = textHandler5.escapeJavaStyleString("", true, false);
        char[] charArray11 = textHandler5.newTextBuffer(1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test098");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.isIndexed("");
        java.lang.String str14 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        boolean boolean8 = taskHandler2.isIndexed("");
        boolean boolean10 = taskHandler2.hasNested("");
        java.lang.String str12 = taskHandler2.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test100");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "hi!");
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject9.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler11 = subject9.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject9.new ParameterHandler();
        java.lang.Boolean boolean17 = parameterHandler12.toBooleanObject("hi!", "", "hi!", "");
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject18.new ParameterHandler();
        char[] charArray26 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap27 = parameterHandler19.parse("hi!", charArray26);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler29 = subject28.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject28.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean41 = parameterHandler31.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler47 = subject42.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler48 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        char[] charArray56 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler52.parse(charArray56, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler48.parse(charArray56, ' ');
        boolean[] booleanArray67 = new boolean[] { true, true, true, false, false, true };
        boolean boolean68 = parameterHandler48.hasOneTrue(booleanArray67);
        boolean boolean69 = parameterHandler31.hasOneTrue(booleanArray67);
        boolean boolean70 = parameterHandler19.hasOneTrue(booleanArray67);
        boolean boolean71 = parameterHandler12.hasOneTrue(booleanArray67);
        boolean boolean72 = parameterHandler3.hasOneTrue(booleanArray67);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + false + "'", boolean36, false);
        org.junit.Assert.assertEquals("'" + boolean41 + "' != '" + false + "'", boolean41, false);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test101");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.hasNested("hi!");
        int int10 = taskHandler4.getIndex("");
        boolean boolean12 = taskHandler4.hasNested("hi!");
        int int14 = taskHandler4.getIndex("");
        java.lang.String str16 = taskHandler4.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test102");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (short) 1, (float) (short) 100);
        int int17 = numberHandler5.minimum((int) (short) 10, 100, (int) (short) 100);
        boolean boolean19 = numberHandler5.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler18 = subject13.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject20.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler22 = subject20.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject20.new ParameterHandler();
        char[] charArray27 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler23.parse(charArray27, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler19.parse(charArray27, ' ');
        boolean[] booleanArray38 = new boolean[] { true, true, true, false, false, true };
        boolean boolean39 = parameterHandler19.hasOneTrue(booleanArray38);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler41.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean48 = parameterHandler41.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler53 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler54 = subject49.new TextHandler();
        char[] charArray56 = textHandler54.newTextBuffer((int) '4');
        char[] charArray58 = textHandler54.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler41.parse(charArray58, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler19.parse(charArray58, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler6.parse("hi!", charArray58);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler67 = subject66.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler69 = subject66.new ParameterHandler();
        char[] charArray73 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap75 = parameterHandler69.parse(charArray73, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap79 = parameterHandler6.parse(charArray73, (int) ' ', (-10086), '#');
        java.lang.Boolean boolean84 = parameterHandler6.toBooleanObject((-1), (int) ' ', 10, (int) (short) -1);
        java.lang.Boolean boolean86 = parameterHandler6.toBooleanObject("hi!");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(boolean84);
        org.junit.Assert.assertNull(boolean86);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test104");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) 10, 1);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = parameterHandler1.parse("hi!", 'a');
        java.lang.Boolean boolean21 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject("hi!", "", "", "hi!");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler6.toBooleanObject("");
        java.lang.Boolean boolean13 = parameterHandler6.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test106");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        boolean boolean18 = numberHandler5.isDigits("hi!");
        java.lang.Number number20 = numberHandler5.parseNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(number20);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("hi!");
        char[] charArray24 = textHandler5.string2char("");
        java.lang.String str26 = textHandler5.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test108");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test109");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        java.lang.Boolean boolean28 = parameterHandler6.toBooleanObject("");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(boolean28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test110");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test111");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        java.lang.String str14 = taskHandler2.remove("hi!");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) 'a', (int) ' ', 0);
        long long13 = numberHandler5.minimum((-1L), (long) 32, (long) '#');
        boolean boolean15 = numberHandler5.isDigits("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test113");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test114");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test115");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject0.new SortTools();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test116");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        java.lang.String str10 = taskHandler4.getProperty("hi!");
        boolean boolean12 = taskHandler4.isIndexed("");
        java.lang.String str14 = taskHandler4.remove("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test117");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        char[] charArray49 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler45.parse(charArray49, ' ');
        char[] charArray54 = textHandler41.toUpperCase(charArray49, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler7.parse(charArray54, (int) (byte) 1, 1, '4');
        java.util.Map<java.lang.String, java.lang.String> strMap61 = parameterHandler7.parse("hi!", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean66 = parameterHandler7.toBooleanObject((int) (short) -1, 100, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap61);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test118");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        java.lang.Boolean boolean23 = parameterHandler6.toBooleanObject((int) (short) -1, (int) (short) 0, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean28 = parameterHandler6.toBooleanObject(100, (int) (byte) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test120");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.isMapped("");
        int int10 = taskHandler4.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.remove("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test122");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject9.new ParameterHandler();
        char[] charArray17 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler10.parse("hi!", charArray17);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        java.lang.Boolean boolean27 = parameterHandler22.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean32 = parameterHandler22.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler34 = subject33.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler35 = subject33.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler36 = subject33.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject33.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler38 = subject33.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject33.new ParameterHandler();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject40.new ParameterHandler();
        char[] charArray47 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap49 = parameterHandler43.parse(charArray47, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler39.parse(charArray47, ' ');
        boolean[] booleanArray58 = new boolean[] { true, true, true, false, false, true };
        boolean boolean59 = parameterHandler39.hasOneTrue(booleanArray58);
        boolean boolean60 = parameterHandler22.hasOneTrue(booleanArray58);
        boolean boolean61 = parameterHandler10.hasOneTrue(booleanArray58);
        boolean boolean62 = parameterHandler3.hasOneTrue(booleanArray58);
        char[] charArray63 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap67 = parameterHandler3.parse(charArray63, (int) (short) 10, (int) '4', '#');
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + false + "'", boolean27, false);
        org.junit.Assert.assertEquals("'" + boolean32 + "' != '" + false + "'", boolean32, false);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject27.new ParameterHandler();
        java.lang.Boolean boolean33 = parameterHandler28.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean35 = parameterHandler28.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler28.parse(charArray45, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler6.parse(charArray45, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap54 = parameterHandler6.parse("hi!", '4');
        java.lang.Boolean boolean56 = parameterHandler6.toBooleanObject("hi!");
        java.lang.Class<?> wildcardClass57 = parameterHandler6.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + true + "'", boolean33, true);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test124");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        int int19 = numberHandler5.compare(10.0f, (float) (byte) 10);
        int int22 = numberHandler5.compare((float) (byte) 1, (float) (byte) 100);
        int int25 = numberHandler5.compare((double) (short) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test125");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("hi!");
        char[] charArray24 = textHandler5.string2char("");
        java.lang.String str28 = textHandler5.escapeJavaStyleString("hi!", true, false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test126");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        int int20 = numberHandler5.maximum(97, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test127");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = parameterHandler1.parse("hi!", '4');
        java.lang.Boolean boolean13 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean18 = parameterHandler1.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test128");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("hi!");
        java.lang.String str26 = textHandler5.escapeJavaStyleString("hi!", true, false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[h, i, !]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test129");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        int int21 = numberHandler5.compare((double) (byte) 0, (double) 10);
        boolean boolean23 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test130");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.minimum(100, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test131");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        int int20 = numberHandler5.maximum((-10086), (int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        int int19 = numberHandler5.compare(10.0f, (float) (byte) 10);
        int int22 = numberHandler5.compare((float) (byte) 1, (float) (byte) 100);
        java.lang.Number number24 = numberHandler5.parseNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test133");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        java.lang.String str10 = taskHandler4.getProperty("hi!");
        java.lang.String str12 = taskHandler4.remove("");
        java.lang.String str14 = taskHandler4.getKey("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test134");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        java.lang.Boolean boolean40 = parameterHandler7.toBooleanObject("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(boolean40);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        long long9 = numberHandler5.minimum(10L, (long) (byte) 10, (long) (short) 1);
        int int12 = numberHandler5.compare((float) (short) 100, (float) 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test136");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        int int16 = numberHandler5.compare((float) (byte) 100, (float) ' ');
        int int20 = numberHandler5.maximum(52, (-1), (-10086));
        int int23 = numberHandler5.compare(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("hi!");
        java.lang.Number number12 = numberHandler5.parseNumber("");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        int int19 = numberHandler5.compare(10.0f, (float) (byte) 10);
        int int22 = numberHandler5.compare((double) (short) -1, (double) 'a');
        int int26 = numberHandler5.minimum(100, (int) ' ', 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test139");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum(32, 97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test140");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        boolean boolean18 = numberHandler5.isDigits("hi!");
        boolean boolean20 = numberHandler5.isNumber("");
        int int24 = numberHandler5.maximum((int) (byte) 1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test141");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test142");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        int int11 = numberHandler5.minimum((int) 'a', (-10086), (int) (byte) 10);
        boolean boolean13 = numberHandler5.isNumber("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test143");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.maximum(1, (int) (short) 100, (-10086));
        int int28 = numberHandler5.minimum((int) (short) 10, (int) '4', (int) (short) 100);
        int int31 = numberHandler5.compare((double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test144");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        java.lang.String str14 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        java.lang.String str14 = taskHandler2.remove("hi!");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        boolean boolean18 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler6 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject0.new TextHandler();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler18 = subject13.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject20.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler22 = subject20.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject20.new ParameterHandler();
        char[] charArray27 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler23.parse(charArray27, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler19.parse(charArray27, ' ');
        boolean[] booleanArray38 = new boolean[] { true, true, true, false, false, true };
        boolean boolean39 = parameterHandler19.hasOneTrue(booleanArray38);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler41.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean48 = parameterHandler41.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler53 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler54 = subject49.new TextHandler();
        char[] charArray56 = textHandler54.newTextBuffer((int) '4');
        char[] charArray58 = textHandler54.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler41.parse(charArray58, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler19.parse(charArray58, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler6.parse("hi!", charArray58);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler67 = subject66.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler69 = subject66.new ParameterHandler();
        char[] charArray73 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap75 = parameterHandler69.parse(charArray73, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap79 = parameterHandler6.parse(charArray73, (int) ' ', (-10086), '#');
        java.lang.Boolean boolean84 = parameterHandler6.toBooleanObject((-1), (int) ' ', 10, (int) (short) -1);
        java.lang.Boolean boolean89 = parameterHandler6.toBooleanObject("hi!", "", "hi!", "");
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(boolean84);
        org.junit.Assert.assertEquals("'" + boolean89 + "' != '" + false + "'", boolean89, false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test148");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test149");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        java.lang.String str14 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test150");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        boolean boolean14 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        boolean boolean8 = numberHandler6.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test152");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum(32, 10, (int) (short) 10);
        boolean boolean8 = numberHandler2.isNumber("");
        int int11 = numberHandler2.compare((float) 100L, (float) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("");
        char[] charArray24 = textHandler5.string2char("hi!");
        java.lang.Class<?> wildcardClass25 = textHandler5.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test154");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("");
        char[] charArray24 = textHandler5.string2char("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler26 = subject25.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler27 = subject25.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject25.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler29 = subject25.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler30 = subject25.new TextHandler();
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler32 = subject31.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler33 = subject31.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler34 = subject31.new ParameterHandler();
        char[] charArray38 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap40 = parameterHandler34.parse(charArray38, ' ');
        char[] charArray43 = textHandler30.toUpperCase(charArray38, (int) (byte) 10, 0);
        char[] charArray45 = textHandler30.newTextBuffer((int) (byte) -1);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler47 = subject46.new ParameterHandler();
        char[] charArray54 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap55 = parameterHandler47.parse("hi!", charArray54);
        char[] charArray58 = textHandler30.toUpperCase(charArray54, (-10086), 10);
        char[] charArray61 = textHandler5.toUpperCase(charArray54, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNull(charArray45);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(charArray58);
        org.junit.Assert.assertNull(charArray61);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test155");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.string2char("hi!");
        char[] charArray24 = textHandler5.string2char("");
        char[] charArray26 = textHandler5.string2char("hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[h, i, !]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test156");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        int int22 = numberHandler5.maximum((int) '4', 32, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test157");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.hasNested("hi!");
        java.lang.String str10 = taskHandler4.findNext("");
        boolean boolean12 = taskHandler4.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test158");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test159");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        java.lang.String str8 = taskHandler2.findNext("");
        boolean boolean10 = taskHandler2.hasNested("");
        java.lang.String str12 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        java.lang.String str14 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test161");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test162");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("hi!");
        java.lang.Number number12 = numberHandler5.parseNumber("");
        int int16 = numberHandler5.maximum((int) '4', 97, (int) (byte) 1);
        long long20 = numberHandler5.minimum((long) '4', (long) (short) 10, 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test163");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler19 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject21.new ParameterHandler();
        char[] charArray28 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler24.parse(charArray28, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler20.parse(charArray28, ' ');
        boolean[] booleanArray39 = new boolean[] { true, true, true, false, false, true };
        boolean boolean40 = parameterHandler20.hasOneTrue(booleanArray39);
        boolean boolean41 = parameterHandler3.hasOneTrue(booleanArray39);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler47 = subject42.new TextHandler();
        char[] charArray49 = textHandler47.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler3.parse(charArray49, '#');
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler53 = subject52.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler54 = subject52.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler55 = subject52.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler56 = subject52.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler57 = subject52.new TextHandler();
        char[] charArray59 = textHandler57.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap61 = parameterHandler3.parse(charArray59, '4');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler3.parse("", '#');
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap64);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test164");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler18 = subject13.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject20.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler22 = subject20.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject20.new ParameterHandler();
        char[] charArray27 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler23.parse(charArray27, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler19.parse(charArray27, ' ');
        boolean[] booleanArray38 = new boolean[] { true, true, true, false, false, true };
        boolean boolean39 = parameterHandler19.hasOneTrue(booleanArray38);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler41.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean48 = parameterHandler41.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler53 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler54 = subject49.new TextHandler();
        char[] charArray56 = textHandler54.newTextBuffer((int) '4');
        char[] charArray58 = textHandler54.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler41.parse(charArray58, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler19.parse(charArray58, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler6.parse("hi!", charArray58);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler67 = subject66.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler69 = subject66.new ParameterHandler();
        char[] charArray73 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap75 = parameterHandler69.parse(charArray73, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap79 = parameterHandler6.parse(charArray73, (int) ' ', (-10086), '#');
        java.util.Map<java.lang.String, java.lang.String> strMap82 = parameterHandler6.parse("hi!", 'a');
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNotNull(strMap82);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test165");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject("hi!", "hi!", "", "hi!");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject17.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler19 = subject17.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject17.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject17.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler22 = subject17.new TextHandler();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject23.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler26 = subject23.new ParameterHandler();
        char[] charArray30 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler26.parse(charArray30, ' ');
        char[] charArray35 = textHandler22.toUpperCase(charArray30, (int) (byte) 10, 0);
        char[] charArray37 = textHandler22.newTextBuffer((int) (byte) -1);
        char[] charArray39 = textHandler22.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = parameterHandler1.parse(charArray39, ' ');
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNull(charArray37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray8 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap9 = parameterHandler1.parse("hi!", charArray8);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler13 = subject10.new ParameterHandler();
        java.lang.Boolean boolean18 = parameterHandler13.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean23 = parameterHandler13.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler25 = subject24.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler26 = subject24.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject24.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler28 = subject24.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler29 = subject24.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler30 = subject24.new ParameterHandler();
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler32 = subject31.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler33 = subject31.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler34 = subject31.new ParameterHandler();
        char[] charArray38 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap40 = parameterHandler34.parse(charArray38, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler30.parse(charArray38, ' ');
        boolean[] booleanArray49 = new boolean[] { true, true, true, false, false, true };
        boolean boolean50 = parameterHandler30.hasOneTrue(booleanArray49);
        boolean boolean51 = parameterHandler13.hasOneTrue(booleanArray49);
        boolean boolean52 = parameterHandler1.hasOneTrue(booleanArray49);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = parameterHandler1.parse("", '#');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + boolean18 + "' != '" + false + "'", boolean18, false);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test167");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray7 = textHandler5.newTextBuffer((int) '4');
        char[] charArray9 = textHandler5.newTextBuffer((int) (byte) 100);
        java.lang.String str13 = textHandler5.escapeJavaStyleString("hi!", true, false);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test168");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler19 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject21.new ParameterHandler();
        char[] charArray28 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler24.parse(charArray28, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler20.parse(charArray28, ' ');
        boolean[] booleanArray39 = new boolean[] { true, true, true, false, false, true };
        boolean boolean40 = parameterHandler20.hasOneTrue(booleanArray39);
        boolean boolean41 = parameterHandler3.hasOneTrue(booleanArray39);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler47 = subject42.new TextHandler();
        char[] charArray49 = textHandler47.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler3.parse(charArray49, '#');
        java.lang.Boolean boolean56 = parameterHandler3.toBooleanObject((int) (short) 100, (-10086), (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean56);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test169");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler18 = subject13.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject13.new ParameterHandler();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject20.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler22 = subject20.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject20.new ParameterHandler();
        char[] charArray27 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler23.parse(charArray27, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler19.parse(charArray27, ' ');
        boolean[] booleanArray38 = new boolean[] { true, true, true, false, false, true };
        boolean boolean39 = parameterHandler19.hasOneTrue(booleanArray38);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler41 = subject40.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler41.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean48 = parameterHandler41.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler52 = subject49.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler53 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler54 = subject49.new TextHandler();
        char[] charArray56 = textHandler54.newTextBuffer((int) '4');
        char[] charArray58 = textHandler54.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler41.parse(charArray58, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap64 = parameterHandler19.parse(charArray58, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler6.parse("hi!", charArray58);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler67 = subject66.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler69 = subject66.new ParameterHandler();
        char[] charArray73 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap75 = parameterHandler69.parse(charArray73, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap79 = parameterHandler6.parse(charArray73, (int) ' ', (-10086), '#');
        char[] charArray85 = new char[] { ' ', '#', 'a', ' ', 'a' };
        java.util.Map<java.lang.String, java.lang.String> strMap87 = parameterHandler6.parse(charArray85, 'a');
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + boolean46 + "' != '" + true + "'", boolean46, true);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), " #a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), " #a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[ , #, a,  , a]");
        org.junit.Assert.assertNotNull(strMap87);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test170");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        int[] intArray5 = new int[] { (short) 100 };
        int[] intArray8 = sortTools3.reverse(intArray5, (int) '4', 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test172");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject19.new TextHandler();
        char[] charArray26 = textHandler24.newTextBuffer((int) '4');
        char[] charArray29 = textHandler5.toLowerCase(charArray26, (int) 'a', (int) '#');
        java.lang.String str31 = textHandler5.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        int int14 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        int int11 = numberHandler5.maximum((-10086), (int) '#', (int) (short) 100);
        long long15 = numberHandler5.minimum((long) '4', (long) 97, 35L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        java.lang.Number number20 = numberHandler5.parseNumber("");
        int int23 = numberHandler5.compare((double) 97L, (double) 10.0f);
        int int27 = numberHandler5.maximum((-10086), (int) '4', (int) (short) 0);
        java.lang.Number number29 = numberHandler5.parseNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNull(number29);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test176");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject0.new TextHandler();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler19 = subject14.new TextHandler();
        char[] charArray21 = textHandler19.newTextBuffer((int) '4');
        char[] charArray23 = textHandler19.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = parameterHandler3.parse(charArray23, (int) (short) 0, (int) (short) 0, ' ');
        java.lang.Boolean boolean29 = parameterHandler3.toBooleanObject("hi!");
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(boolean29);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test178");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test179");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        char[] charArray27 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler6.parse(charArray27, 'a');
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test180");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        int int11 = numberHandler5.minimum((int) 'a', (-10086), (int) (byte) 10);
        boolean boolean13 = numberHandler5.isNumber("");
        long long17 = numberHandler5.maximum((long) 1, (long) (short) 0, (long) 'a');
        long long21 = numberHandler5.minimum(100L, (long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10086) + "'", int11 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test181");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        int int14 = taskHandler2.getIndex("");
        boolean boolean16 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test182");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.String str7 = textHandler5.unescapeJava("hi!");
        java.lang.String str11 = textHandler5.escapeJavaStyleString("", false, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test183");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        java.lang.String str10 = taskHandler4.getProperty("hi!");
        java.lang.String str12 = taskHandler4.remove("");
        java.lang.String str14 = taskHandler4.getProperty("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test184");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject27.new ParameterHandler();
        java.lang.Boolean boolean33 = parameterHandler28.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean35 = parameterHandler28.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler28.parse(charArray45, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler6.parse(charArray45, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap54 = parameterHandler6.parse("hi!", '4');
        java.lang.Boolean boolean56 = parameterHandler6.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean61 = parameterHandler6.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + true + "'", boolean33, true);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(boolean56);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test185");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.Class<?> wildcardClass7 = taskHandler4.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test186");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        java.lang.Boolean boolean31 = parameterHandler6.toBooleanObject(10, (int) '4', 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + boolean31 + "' != '" + false + "'", boolean31, false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test187");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        int int21 = numberHandler5.compare((double) (byte) 0, (double) 10);
        int int25 = numberHandler5.minimum((int) '#', 10, 100);
        int int28 = numberHandler5.compare((double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test188");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 100.0f, (double) (-1));
        int int11 = numberHandler5.compare((float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test189");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test190");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        java.lang.Class<?> wildcardClass19 = strMap18.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test191");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test192");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        java.lang.Number number10 = numberHandler8.parseNumber("");
        long long14 = numberHandler8.minimum((long) 0, 0L, (long) 32);
        boolean boolean16 = numberHandler8.isNumber("hi!");
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test193");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        int int16 = numberHandler5.compare((float) (byte) 100, (float) ' ');
        int int20 = numberHandler5.maximum(52, (-1), (-10086));
        boolean boolean22 = numberHandler5.isNumber("hi!");
        long long26 = numberHandler5.maximum((long) '4', (-10086L), (long) (short) 100);
        int int30 = numberHandler5.minimum((int) ' ', 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test194");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        int int8 = taskHandler2.getIndex("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test195");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test196");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray7 = textHandler5.newTextBuffer((int) '4');
        char[] charArray9 = textHandler5.newTextBuffer((int) (byte) 100);
        char[] charArray11 = textHandler5.string2char("");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test197");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.getProperty("");
        java.lang.String str10 = taskHandler4.findNext("");
        java.lang.String str12 = taskHandler4.getKey("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test198");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.isMapped("");
        java.lang.String str10 = taskHandler4.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test199");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test200");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        int int14 = taskHandler2.getIndex("hi!");
        java.lang.String str16 = taskHandler2.getKey("hi!");
        boolean boolean18 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test201");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject0.new ParameterHandler();
        java.lang.Boolean boolean10 = parameterHandler8.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        java.lang.String str18 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test203");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        java.lang.String str14 = taskHandler2.remove("");
        boolean boolean16 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test204");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.hasNested("hi!");
        java.lang.String str10 = taskHandler4.findNext("");
        java.lang.String str12 = taskHandler4.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test205");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.maximum(52, (int) (byte) 100, (int) (short) -1);
        long long28 = numberHandler5.maximum((long) ' ', (long) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test206");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        java.lang.String str18 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test207");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        int int25 = numberHandler5.compare((float) (byte) 0, (float) (short) 1);
        int int29 = numberHandler5.minimum(10, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test208");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        int int12 = taskHandler2.getIndex("");
        java.lang.String str14 = taskHandler2.remove("");
        boolean boolean16 = taskHandler2.hasNested("");
        java.lang.String str18 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test209");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getProperty("");
        java.lang.String str8 = taskHandler2.remove("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test210");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray7 = textHandler5.newTextBuffer((int) '4');
        char[] charArray9 = textHandler5.newTextBuffer((int) (byte) 100);
        char[] charArray11 = textHandler5.newTextBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject0.new TaskHandler();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test212");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        java.lang.Number number20 = numberHandler5.parseNumber("");
        int int23 = numberHandler5.compare((double) 97L, (double) 10.0f);
        int int26 = numberHandler5.compare(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test213");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        long long20 = numberHandler5.minimum((long) '#', (long) (byte) -1, (long) 'a');
        int int24 = numberHandler5.maximum((int) '4', 32, 32);
        int int27 = numberHandler5.compare((float) (-10086), (float) (short) 10);
        boolean boolean29 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test214");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        int int12 = taskHandler2.getIndex("");
        java.lang.String str14 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        java.lang.String str22 = textHandler5.escapeJavaStyleString("", true, true);
        char[] charArray24 = textHandler5.newTextBuffer((int) 'a');
        char[] charArray26 = textHandler5.string2char("hi!");
        char[] charArray28 = textHandler5.newTextBuffer((int) (short) -1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[h, i, !]");
        org.junit.Assert.assertNull(charArray28);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        char[] charArray7 = textHandler5.newTextBuffer((int) '4');
        char[] charArray9 = textHandler5.newTextBuffer(10);
        java.lang.String str11 = textHandler5.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test218");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.getProperty("hi!");
        java.lang.String str18 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test219");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        int int26 = numberHandler5.minimum((int) (short) 10, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test220");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        java.lang.String str16 = taskHandler2.remove("hi!");
        boolean boolean18 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test221");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        char[] charArray49 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler45.parse(charArray49, ' ');
        char[] charArray54 = textHandler41.toUpperCase(charArray49, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler7.parse(charArray54, (int) (byte) 1, 1, '4');
        comp5111.assignment.cut.Subject subject59 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler60 = subject59.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler61 = subject59.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler62 = subject59.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler63 = subject59.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler64 = subject59.new TextHandler();
        char[] charArray66 = textHandler64.newTextBuffer((int) '4');
        char[] charArray68 = textHandler64.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = parameterHandler7.parse(charArray68, (int) '#', 1, '#');
        comp5111.assignment.cut.Subject subject73 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler74 = subject73.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler75 = subject73.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler76 = subject73.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler77 = subject73.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler78 = subject73.new TextHandler();
        char[] charArray80 = textHandler78.newTextBuffer((int) '4');
        char[] charArray82 = textHandler78.newTextBuffer((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap86 = parameterHandler7.parse(charArray82, 97, (-10086), '4');
        char[] charArray87 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap89 = parameterHandler7.parse(charArray87, 'a');
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(strMap89);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test222");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test223");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        int int26 = numberHandler5.minimum((int) (byte) 100, (int) (short) 100, (int) (short) 0);
        int int29 = numberHandler5.compare((double) 32, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test224");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        boolean boolean20 = numberHandler5.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test225");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        int int10 = numberHandler5.compare((float) 10, (float) (byte) -1);
        long long14 = numberHandler5.maximum((long) (byte) 10, (long) '#', (long) (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test227");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject0.new SortTools();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        int int21 = numberHandler5.compare((double) (byte) 0, (double) 10);
        long long25 = numberHandler5.maximum((long) (byte) 1, 35L, (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject9.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler11 = subject9.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject9.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler13 = subject9.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler14 = subject9.new TextHandler();
        char[] charArray16 = textHandler14.newTextBuffer((int) '4');
        char[] charArray18 = textHandler14.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = parameterHandler1.parse(charArray18, 'a');
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        java.lang.Boolean boolean27 = parameterHandler22.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean29 = parameterHandler22.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject30.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler32 = subject30.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler33 = subject30.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler34 = subject30.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler35 = subject30.new TextHandler();
        char[] charArray37 = textHandler35.newTextBuffer((int) '4');
        char[] charArray39 = textHandler35.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = parameterHandler22.parse(charArray39, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap45 = parameterHandler1.parse(charArray39, (int) (byte) 100, (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + true + "'", boolean27, true);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap45);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test230");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.newTextBuffer(97);
        java.lang.String str24 = textHandler5.unescapeJava("");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test231");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        java.lang.String str14 = taskHandler2.remove("hi!");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        java.lang.String str18 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test232");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        java.lang.Number number10 = numberHandler8.parseNumber("");
        boolean boolean12 = numberHandler8.isDigits("");
        int int15 = numberHandler8.compare((double) (-1), (double) 100.0f);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test233");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 100.0f, (double) (-1));
        long long12 = numberHandler5.minimum((long) (-10086), (long) 0, (long) (-1));
        int int15 = numberHandler5.compare((float) (-10086), 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-10086L) + "'", long12 == (-10086L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test234");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        long long9 = numberHandler5.minimum(10L, (long) (byte) 10, (long) (short) 1);
        boolean boolean11 = numberHandler5.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test235");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        int int12 = taskHandler4.getIndex("");
        java.lang.String str14 = taskHandler4.remove("");
        boolean boolean16 = taskHandler4.hasNested("");
        boolean boolean18 = taskHandler4.isMapped("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test236");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("hi!");
        char[] charArray7 = textHandler3.newTextBuffer(32);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test237");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        java.lang.String str10 = taskHandler2.getProperty("");
        int int12 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test239");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        java.lang.String str14 = taskHandler2.remove("hi!");
        java.lang.String str16 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        int int12 = taskHandler4.getIndex("");
        java.lang.String str14 = taskHandler4.remove("");
        java.lang.String str16 = taskHandler4.getKey("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test241");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (short) 1, (float) (short) 100);
        int int16 = numberHandler5.compare((float) '#', (float) (-1));
        boolean boolean18 = numberHandler5.isDigits("hi!");
        int int21 = numberHandler5.compare((float) (byte) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test242");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.getProperty("hi!");
        int int18 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test243");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isMapped("");
        java.lang.String str14 = taskHandler2.remove("hi!");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        java.lang.String str18 = taskHandler2.remove("hi!");
        boolean boolean20 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("hi!");
        boolean boolean12 = taskHandler4.hasNested("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test245");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray25 = new boolean[] { true, true, true, false, false, true };
        boolean boolean26 = parameterHandler6.hasOneTrue(booleanArray25);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject27.new ParameterHandler();
        java.lang.Boolean boolean33 = parameterHandler28.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean35 = parameterHandler28.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler28.parse(charArray45, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler6.parse(charArray45, (int) (byte) 0, 1, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap54 = parameterHandler6.parse("hi!", '4');
        java.lang.Boolean boolean56 = parameterHandler6.toBooleanObject("hi!");
        java.lang.Boolean boolean58 = parameterHandler6.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + true + "'", boolean33, true);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(boolean56);
        org.junit.Assert.assertNull(boolean58);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test246");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        char[] charArray49 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler45.parse(charArray49, ' ');
        char[] charArray54 = textHandler41.toUpperCase(charArray49, (int) (byte) 10, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler7.parse(charArray54, (int) (byte) 1, 1, '4');
        comp5111.assignment.cut.Subject subject59 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler60 = subject59.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler61 = subject59.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler62 = subject59.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler63 = subject59.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler64 = subject59.new TextHandler();
        char[] charArray66 = textHandler64.newTextBuffer((int) '4');
        char[] charArray68 = textHandler64.newTextBuffer((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = parameterHandler7.parse(charArray68, (int) '#', 1, '#');
        comp5111.assignment.cut.Subject subject74 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler75 = subject74.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler76 = subject74.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler77 = subject74.new ParameterHandler();
        char[] charArray81 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap83 = parameterHandler77.parse(charArray81, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap84 = parameterHandler7.parse("hi!", charArray81);
        boolean[] booleanArray89 = new boolean[] { false, false, true, false };
        boolean boolean90 = parameterHandler7.hasOneTrue(booleanArray89);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(booleanArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray89), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test247");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int6 = numberHandler3.compare((double) (short) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        java.lang.Number number20 = numberHandler5.parseNumber("");
        long long24 = numberHandler5.minimum(35L, (long) 97, (long) 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler7.parse(charArray45, '4');
        java.util.Map<java.lang.String, java.lang.String> strMap50 = parameterHandler7.parse("", '4');
        java.lang.Boolean boolean55 = parameterHandler7.toBooleanObject((int) '4', (int) (short) 10, 52, (int) '#');
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + boolean55 + "' != '" + false + "'", boolean55, false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test250");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        boolean[] booleanArray8 = null;
        boolean boolean9 = parameterHandler7.hasOneTrue(booleanArray8);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler13 = subject10.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject10.new TextHandler();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject16.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject16.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject16.new ParameterHandler();
        char[] charArray23 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler19.parse(charArray23, ' ');
        char[] charArray28 = textHandler15.toUpperCase(charArray23, (int) (byte) 10, 0);
        char[] charArray30 = textHandler15.newTextBuffer((int) (byte) -1);
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler32 = subject31.new ParameterHandler();
        char[] charArray39 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap40 = parameterHandler32.parse("hi!", charArray39);
        char[] charArray43 = textHandler15.toUpperCase(charArray39, (-10086), 10);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject44.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject44.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler47 = subject44.new ParameterHandler();
        char[] charArray51 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap53 = parameterHandler47.parse(charArray51, ' ');
        char[] charArray56 = textHandler15.toUpperCase(charArray51, 0, (int) (short) 100);
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler58 = subject57.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler59 = subject57.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler60 = subject57.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler61 = subject57.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler62 = subject57.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler63 = subject57.new ParameterHandler();
        comp5111.assignment.cut.Subject subject64 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler65 = subject64.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler66 = subject64.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler67 = subject64.new ParameterHandler();
        char[] charArray71 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap73 = parameterHandler67.parse(charArray71, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap75 = parameterHandler63.parse(charArray71, ' ');
        char[] charArray78 = textHandler15.toUpperCase(charArray71, (int) (short) 10, (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap82 = parameterHandler7.parse(charArray71, 0, 100, '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(charArray56);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNull(charArray78);
        org.junit.Assert.assertNotNull(strMap82);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test251");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        java.lang.Number number5 = numberHandler3.parseNumber("");
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test252");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        int int9 = numberHandler6.compare(0.0f, (float) (-1L));
        int int12 = numberHandler6.compare((double) 100.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test253");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler3.toBooleanObject("hi!", "", "hi!", "");
        java.lang.Boolean boolean13 = parameterHandler3.toBooleanObject((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler17 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler18 = subject14.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler19 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject14.new ParameterHandler();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler24 = subject21.new ParameterHandler();
        char[] charArray28 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler24.parse(charArray28, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler20.parse(charArray28, ' ');
        boolean[] booleanArray39 = new boolean[] { true, true, true, false, false, true };
        boolean boolean40 = parameterHandler20.hasOneTrue(booleanArray39);
        boolean boolean41 = parameterHandler3.hasOneTrue(booleanArray39);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler43 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler44 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler45 = subject42.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler46 = subject42.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler47 = subject42.new TextHandler();
        char[] charArray49 = textHandler47.newTextBuffer((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler3.parse(charArray49, '#');
        java.lang.Boolean boolean53 = parameterHandler3.toBooleanObject("");
        java.lang.Boolean boolean58 = parameterHandler3.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNull(boolean58);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test254");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        int int17 = numberHandler5.compare(0.0d, (double) ' ');
        int int21 = numberHandler5.maximum(1, (-1), (int) (short) 10);
        boolean boolean23 = numberHandler5.isDigits("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.getProperty("");
        boolean boolean10 = taskHandler4.hasNested("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test256");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        boolean boolean16 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test257");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        int int16 = numberHandler5.compare((float) (byte) 100, (float) ' ');
        boolean boolean18 = numberHandler5.isNumber("");
        long long22 = numberHandler5.maximum((long) 52, 35L, 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test258");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) (short) 100, (int) (byte) 0, (-1), 100);
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) 10, 1);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = parameterHandler1.parse("hi!", 'a');
        java.lang.Boolean boolean21 = parameterHandler1.toBooleanObject("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-10086), (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        int int14 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test260");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        boolean boolean7 = numberHandler5.isDigits("");
        int int11 = numberHandler5.maximum((-10086), (int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        long long16 = numberHandler5.maximum((long) (-10086), (long) '#', (long) (byte) 10);
        int int19 = numberHandler5.compare((double) 'a', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test262");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        int int18 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        int int10 = taskHandler4.getIndex("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test264");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        long long17 = numberHandler5.minimum((long) '4', (long) (short) 1, 1L);
        int int21 = numberHandler5.maximum(32, 0, (int) '4');
        long long25 = numberHandler5.maximum(100L, (long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test265");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        java.lang.String str14 = taskHandler2.findNext("");
        boolean boolean16 = taskHandler2.hasNested("");
        boolean boolean18 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test266");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        long long22 = numberHandler5.maximum((long) 100, 0L, (long) (byte) 0);
        int int26 = numberHandler5.minimum((int) (byte) 100, (int) (short) 100, (int) (short) 0);
        int int29 = numberHandler5.compare((float) 10L, (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test267");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.hasNested("");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        boolean boolean18 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test268");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject0.new TextHandler();
        char[] charArray9 = textHandler7.string2char("hi!");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test269");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.String str9 = textHandler5.escapeJavaStyleString("", true, false);
        char[] charArray11 = textHandler5.newTextBuffer((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test271");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("hi!");
        java.lang.Number number12 = numberHandler5.parseNumber("");
        long long16 = numberHandler5.maximum((long) (-1), (long) 10, (long) (-10086));
        int int19 = numberHandler5.compare((float) (short) -1, 0.0f);
        int int23 = numberHandler5.minimum(100, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(number12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("hi!");
        java.lang.String str12 = taskHandler4.findNext("hi!");
        boolean boolean14 = taskHandler4.hasNested("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test273");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler7.parse(charArray45, '4');
        java.util.Map<java.lang.String, java.lang.String> strMap50 = parameterHandler7.parse("", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean55 = parameterHandler7.toBooleanObject(1, (int) '#', (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test274");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test275");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        boolean boolean18 = numberHandler5.isDigits("hi!");
        boolean boolean20 = numberHandler5.isNumber("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test276");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        int int14 = taskHandler2.getIndex("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test277");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        long long9 = numberHandler5.minimum(10L, (long) (byte) 10, (long) (short) 1);
        int int12 = numberHandler5.compare((float) (short) 100, 0.0f);
        int int16 = numberHandler5.minimum((-1), (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test278");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        int int14 = taskHandler2.getIndex("hi!");
        java.lang.String str16 = taskHandler2.getKey("hi!");
        java.lang.String str18 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test279");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test280");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        char[] charArray22 = textHandler5.newTextBuffer(97);
        char[] charArray24 = textHandler5.newTextBuffer((-10086));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray24);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test281");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        long long18 = numberHandler5.minimum((long) (-1), (long) (short) 100, (long) (short) 10);
        java.lang.Number number20 = numberHandler5.parseNumber("");
        int int23 = numberHandler5.compare((double) 97L, (double) 10.0f);
        int int27 = numberHandler5.maximum((-10086), (int) '4', (int) (short) 0);
        boolean boolean29 = numberHandler5.isNumber("");
        long long33 = numberHandler5.minimum(100L, (long) 'a', (long) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test282");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler10 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject8.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler13 = subject8.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject8.new ParameterHandler();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler16 = subject15.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler17 = subject15.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject15.new ParameterHandler();
        char[] charArray22 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler14.parse(charArray22, ' ');
        boolean[] booleanArray33 = new boolean[] { true, true, true, false, false, true };
        boolean boolean34 = parameterHandler14.hasOneTrue(booleanArray33);
        boolean boolean35 = parameterHandler7.hasOneTrue(booleanArray33);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler38 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject36.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject36.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject36.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((int) '4');
        char[] charArray45 = textHandler41.newTextBuffer((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler7.parse(charArray45, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean52 = parameterHandler7.toBooleanObject((int) (byte) 10, 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("hi!");
        java.lang.String str12 = taskHandler4.findNext("hi!");
        int int14 = taskHandler4.getIndex("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test284");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = parameterHandler1.parse("hi!", '4');
        java.lang.Boolean boolean13 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean15 = parameterHandler1.toBooleanObject("hi!");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (byte) 1, (int) ' ', (int) (byte) 100);
        long long20 = numberHandler5.minimum((long) '#', (long) (byte) -1, (long) 'a');
        int int24 = numberHandler5.maximum((int) '4', 32, 32);
        int int27 = numberHandler5.compare((float) (-10086), (float) (short) 10);
        boolean boolean29 = numberHandler5.isNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test286");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject0.new TextHandler();
        char[] charArray9 = textHandler7.newTextBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test287");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test288");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        int int17 = numberHandler5.compare(0.0d, (double) ' ');
        long long21 = numberHandler5.minimum((long) (short) 0, (long) (short) 10, (long) 52);
        int int25 = numberHandler5.minimum(1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test289");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.getProperty("hi!");
        boolean boolean18 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        boolean boolean12 = numberHandler5.isNumber("hi!");
        int int16 = numberHandler5.maximum((int) (short) -1, (int) (short) 1, 1);
        boolean boolean18 = numberHandler5.isDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = numberHandler5.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test291");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject7.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler9 = subject7.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject7.new ParameterHandler();
        char[] charArray14 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler6.parse(charArray14, ' ');
        boolean[] booleanArray20 = new boolean[] { false };
        boolean boolean21 = parameterHandler6.hasOneTrue(booleanArray20);
        char[] charArray22 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler6.parse(charArray22, 0, 52, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler6.parse("", '#');
        java.lang.Boolean boolean34 = parameterHandler6.toBooleanObject("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + false + "'", boolean34, false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test292");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("");
        boolean boolean8 = taskHandler4.isMapped("");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        int int12 = taskHandler4.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test293");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.maximum(0L, 10L, (long) (byte) -1);
        int int18 = numberHandler5.minimum((int) (byte) 1, (int) '4', 10);
        boolean boolean20 = numberHandler5.isDigits("");
        int int24 = numberHandler5.maximum(52, (int) (byte) 100, (int) (short) -1);
        java.lang.Number number26 = numberHandler5.parseNumber("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNull(number26);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test294");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.minimum((-1L), 97L, (long) 97);
        boolean boolean9 = numberHandler3.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test295");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int9 = numberHandler5.minimum((int) 'a', (int) ' ', 0);
        int int13 = numberHandler5.minimum((int) (short) 100, 97, 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test296");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("");
        int int12 = taskHandler4.getIndex("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test297");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        boolean boolean8 = taskHandler4.isMapped("hi!");
        boolean boolean10 = taskHandler4.isIndexed("hi!");
        int int12 = taskHandler4.getIndex("");
        java.lang.String str14 = taskHandler4.getProperty("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test298");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        boolean boolean14 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test299");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isIndexed("");
        java.lang.String str8 = taskHandler4.getProperty("hi!");
        java.lang.String str10 = taskHandler4.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        int int14 = taskHandler2.getIndex("");
        int int16 = taskHandler2.getIndex("hi!");
        java.lang.String str18 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject0.new NumberHandler();
        java.lang.Number number10 = numberHandler8.parseNumber("");
        int int14 = numberHandler8.maximum(97, (int) (short) 10, 10);
        int int17 = numberHandler8.compare((float) (short) 1, (float) (byte) 0);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler6 = subject0.new TaskHandler();
        boolean boolean8 = taskHandler6.isMapped("");
        java.lang.String str10 = taskHandler6.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test303");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject0.new ParameterHandler();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = parameterHandler8.parse("", '#');
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler13 = subject12.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler15 = subject12.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler16 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler17 = subject12.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject12.new ParameterHandler();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject19.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler21 = subject19.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject19.new ParameterHandler();
        char[] charArray26 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap28 = parameterHandler22.parse(charArray26, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler18.parse(charArray26, ' ');
        boolean[] booleanArray37 = new boolean[] { true, true, true, false, false, true };
        boolean boolean38 = parameterHandler18.hasOneTrue(booleanArray37);
        boolean boolean39 = parameterHandler8.hasOneTrue(booleanArray37);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test304");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        java.lang.String str9 = textHandler5.escapeJavaStyleString("hi!", true, false);
        java.lang.String str11 = textHandler5.unescapeJava("hi!");
        java.lang.Class<?> wildcardClass12 = textHandler5.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test305");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        java.lang.String str14 = taskHandler2.remove("hi!");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        java.lang.String str18 = taskHandler2.getKey("");
        boolean boolean20 = taskHandler2.isIndexed("hi!");
        boolean boolean22 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test306");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isMapped("hi!");
        boolean boolean14 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test307");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler7 = subject6.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler8 = subject6.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler9 = subject6.new ParameterHandler();
        char[] charArray13 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler9.parse(charArray13, ' ');
        char[] charArray18 = textHandler5.toUpperCase(charArray13, (int) (byte) 10, 0);
        char[] charArray20 = textHandler5.newTextBuffer((int) (byte) -1);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        char[] charArray29 = new char[] { '4', '#', 'a', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap30 = parameterHandler22.parse("hi!", charArray29);
        char[] charArray33 = textHandler5.toUpperCase(charArray29, (-10086), 10);
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler35 = subject34.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler36 = subject34.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler37 = subject34.new ParameterHandler();
        char[] charArray41 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap43 = parameterHandler37.parse(charArray41, ' ');
        char[] charArray46 = textHandler5.toUpperCase(charArray41, 0, (int) (short) 100);
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler48 = subject47.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler49 = subject47.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler50 = subject47.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject47.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler52 = subject47.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler53 = subject47.new ParameterHandler();
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler55 = subject54.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler56 = subject54.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler57 = subject54.new ParameterHandler();
        char[] charArray61 = new char[] { '#', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap63 = parameterHandler57.parse(charArray61, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap65 = parameterHandler53.parse(charArray61, ' ');
        char[] charArray68 = textHandler5.toUpperCase(charArray61, (int) (short) 10, (int) (short) 1);
        char[] charArray70 = textHandler5.newTextBuffer(100);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, #, a, a,  ]");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "###");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "###");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #, #]");
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(charArray68);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test308");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.findNext("");
        boolean boolean10 = taskHandler4.isMapped("");
        boolean boolean12 = taskHandler4.hasNested("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test309");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        boolean boolean16 = taskHandler2.hasNested("");
        java.lang.String str18 = taskHandler2.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test310");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test311");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.remove("hi!");
        java.lang.String str8 = taskHandler4.getProperty("");
        java.lang.String str10 = taskHandler4.findNext("");
        java.lang.String str12 = taskHandler4.getProperty("");
        java.lang.String str14 = taskHandler4.getProperty("");
        boolean boolean16 = taskHandler4.isMapped("hi!");
        java.lang.String str18 = taskHandler4.remove("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test312");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (short) 1, (float) (short) 100);
        int int17 = numberHandler5.minimum((int) (short) 10, 100, (int) (short) 100);
        int int20 = numberHandler5.compare((-1.0d), (double) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test313");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        int int13 = numberHandler5.compare((float) (byte) 1, 0.0f);
        int int17 = numberHandler5.maximum(100, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test314");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        int int8 = numberHandler5.compare((double) 10.0f, (double) (byte) 0);
        boolean boolean10 = numberHandler5.isNumber("");
        long long14 = numberHandler5.minimum((long) (short) 1, (long) (byte) 100, (long) 10);
        int int17 = numberHandler5.compare((float) 0, (float) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop10_RegressionTest0.test315");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isMapped("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        int int14 = taskHandler2.getIndex("");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        boolean boolean18 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test(timeout = 4000)
  public void test405()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This 'string' contains / and \\";
      String expectedOutput = "This \\'string\\' contains \\/ and \\\\";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.escapeJavaStyleString(input, true, true));
  }
  
  @Test(timeout = 4000)
  public void test406()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This 'string' contains / and \\";
      String expectedOutput = "This 'string' contains / and \\\\";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.escapeJavaStyleString(input, false, false));
  }
  
  @Test(timeout = 4000)
  public void test407()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This 'string' contains / and \\";
      String expectedOutput = "This \\'string\\' contains / and \\\\";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.escapeJavaStyleString(input, true, false));
  }
  
  @Test(timeout = 4000)
  public void test408()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This 'string' contains / and \\";
      String expectedOutput = "This 'string' contains \\/ and \\\\";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.escapeJavaStyleString(input, false, true));
  }

  @Test(timeout = 4000)
  public void test410()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "Hello\\nworld";
      String expectedOutput = "Hello\nworld";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.unescapeJava(input));
  }

  @Test(timeout = 4000)
  public void test411()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "\\u0048\\u0065\\u006c\\u006c\\u006f";
      String expectedOutput = "Hello";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.unescapeJava(input));
  }
  
  @Test(timeout = 4000)
  public void test412()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This is a backslash: \\\\";
      String expectedOutput = "This is a backslash: \\";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.unescapeJava(input));
  }
  
  @Test(timeout = 4000)
  public void test413()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.TextHandler subject_TextHandler0 = subject0.new TextHandler();
      String input = "This is a tab: \\t, this is a newline: \\n, and this is a Unicode character: \\u0041";
      String expectedOutput = "This is a tab: \t, this is a newline: \n, and this is a Unicode character: A";
      org.junit.Assert.assertEquals(expectedOutput, subject_TextHandler0.unescapeJava(input));
  }
  
  @Test(timeout = 4000)
  public void test418()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 3, 2, 5, 4};
      int i = 0;
      int from = 0;
      int to = 4;
      int[] expectedOutput = {3, 5, 2, 1, 4};
      org.junit.Assert.assertArrayEquals(expectedOutput, subject_SortTools0.siftDown(input, i, from, to));
  }

  @Test(timeout = 4000)
  public void test430()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 4, 5};
      int lo = 1;
      int mid = 2;
      int hi = 3;
      int[] expectedOutput = {1, 3, 4, 2, 5};
      org.junit.Assert.assertArrayEquals(expectedOutput, subject_SortTools0.doRotate(input, lo, mid, hi));
  }
  
  @Test(timeout = 4000)
  public void test431()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 4, 5};
      int lo = 0;
      int mid = 2;
      int hi = 4;
      int[] expectedOutput = {4, 5, 1, 2, 3};
      org.junit.Assert.assertArrayEquals(expectedOutput, subject_SortTools0.doRotate(input, lo, mid, hi));
  }

  @Test(timeout = 4000)
  public void test432()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 4, 5};
      int lo = 1;
      int mid = 1;
      int hi = 2;
      int[] expectedOutput = {1, 2, 3, 4, 5};
      org.junit.Assert.assertArrayEquals(expectedOutput, subject_SortTools0.doRotate(input, lo, mid, hi));
  }
  
  @Test(timeout = 4000)
  public void test433()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 4, 5};
      int lo = 1;
      int mid = 3;
      int hi = 3;
      int[] expectedOutput = {1, 4, 2, 3, 5};
      org.junit.Assert.assertArrayEquals(expectedOutput, subject_SortTools0.doRotate(input, lo, mid, hi));
  }

  @Test(timeout = 4000)
  public void test437()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.NumberHandler subject_NumberHandler0 = subject0.new NumberHandler();
      String input = "0x1A";
      int expectedOutput = 26;
      org.junit.Assert.assertEquals(expectedOutput, subject_NumberHandler0.parseNumber(input));
  }

  @Test(timeout = 4000)
  public void test422()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 5, 6};
      int from = 0;
      int to = 4;
      int val = 4;
      int expectedOutput = 3;
      org.junit.Assert.assertEquals(expectedOutput, subject_SortTools0.lower(input, from, to, val));
  }
  
  @Test(timeout = 4000)
  public void test423()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 5, 6};
      int from = 0;
      int to = 4;
      int val = 1;
      int expectedOutput = 0;
      org.junit.Assert.assertEquals(expectedOutput, subject_SortTools0.lower(input, from, to, val));
  }
  
  @Test(timeout = 4000)
  public void test427()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 5, 6};
      int from = 0;
      int to = 4;
      int val = 4;
      int expectedOutput = 3;
      org.junit.Assert.assertEquals(expectedOutput, subject_SortTools0.upper(input, from, to, val));
  }
  
  @Test(timeout = 4000)
  public void test428()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] input = {1, 2, 3, 5, 6};
      int from = 0;
      int to = 4;
      int val = 6;
      int expectedOutput = 4;
      org.junit.Assert.assertEquals(expectedOutput, subject_SortTools0.upper(input, from, to, val));
  }

  @Test(timeout = 4000)
  public void test399()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] array = {1, 2, 3, 4, 5};
      int from = 1;
      int to = 2;
      int[] expected = {1, 3, 2, 4, 5};
      int[] actual = subject_SortTools0.reverse(array, from, to);
      org.junit.Assert.assertArrayEquals(expected, actual);
  }

  @Test(timeout = 4000)
  public void test398()  throws Throwable  {
      Subject subject0 = new Subject();
      Subject.SortTools subject_SortTools0 = subject0.new SortTools();
      int[] array = {1, 2, 3, 4, 5};
      int from = 0;
      int to = 2;
      int[] expected = {3, 2, 1, 4, 5};
      int[] actual = subject_SortTools0.reverse(array, from, to);
      org.junit.Assert.assertArrayEquals(expected, actual);
  }
}

