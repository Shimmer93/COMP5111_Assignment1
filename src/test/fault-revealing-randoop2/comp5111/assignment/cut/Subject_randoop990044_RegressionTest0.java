package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop990044_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test004");
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
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test007");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        boolean[] booleanArray9 = null;
        boolean boolean10 = parameterHandler2.hasOneTrue(booleanArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean15 = parameterHandler2.toBooleanObject((int) ' ', 10, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.Class<?> wildcardClass5 = taskHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        int[] intArray20 = new int[] { 1, 1 };
        int[] intArray23 = sortTools17.reverse(intArray20, 1, (int) (short) 10);
        int[] intArray26 = sortTools9.reverse(intArray20, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = sortTools1.compare(intArray26, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test012");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int int13 = sortTools1.lower(intArray6, (int) (short) 0, (int) (short) 1, 1);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        int[] intArray26 = new int[] { 1, 1 };
        int[] intArray29 = sortTools23.reverse(intArray26, 1, (int) (short) 10);
        int[] intArray32 = sortTools15.reverse(intArray26, (-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = sortTools1.compare(intArray26, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray32);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test013");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        boolean[] booleanArray9 = null;
        boolean boolean10 = parameterHandler2.hasOneTrue(booleanArray9);
        java.lang.Class<?> wildcardClass11 = parameterHandler2.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test014");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int14 = numberHandler2.maximum((int) ' ', 100, (int) '4');
        java.lang.Number number16 = numberHandler2.parseNumber("");
        long long20 = numberHandler2.maximum((long) '4', (long) (-10086), (long) 10);
        int int24 = numberHandler2.minimum(1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test015");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test016");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean9 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler12 = subject11.new TextHandler();
        java.lang.String str14 = textHandler12.unescapeJava("hi!");
        char[] charArray16 = textHandler12.newTextBuffer((int) (short) 10);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject17.new ParameterHandler();
        java.lang.Boolean boolean21 = parameterHandler19.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler25 = subject23.new ParameterHandler();
        char[] charArray29 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler25.parse(charArray29, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler19.parse("hi!", charArray29);
        char[] charArray35 = textHandler12.toUpperCase(charArray29, 1, 100);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = parameterHandler2.parse("", charArray35);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray11 = new int[] { 1, 1 };
        int[] intArray14 = sortTools8.reverse(intArray11, 1, (int) (short) 10);
        int[] intArray18 = sortTools6.siftDown(intArray14, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray23 = new int[] { 1, 1 };
        int[] intArray26 = sortTools20.reverse(intArray23, 1, (int) (short) 10);
        int[] intArray29 = sortTools6.swap(intArray23, (int) (byte) 10, (-1));
        int int33 = sortTools4.upper(intArray29, (-10086), 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-10086) + "'", int33 == (-10086));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.newTextBuffer((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = textHandler1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        java.lang.Boolean boolean23 = parameterHandler2.toBooleanObject(1, 35, 35, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean28 = parameterHandler2.toBooleanObject((int) (short) 10, (int) (short) -1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test021");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test022");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        int[] intArray14 = new int[] { 1, 1 };
        int[] intArray17 = sortTools11.reverse(intArray14, 1, (int) (short) 10);
        int[] intArray21 = sortTools3.siftDown(intArray17, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray28 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray31 = sortTools3.reverse(intArray28, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        int[] intArray38 = new int[] { 1, 1 };
        int[] intArray41 = sortTools35.reverse(intArray38, 1, (int) (short) 10);
        int[] intArray45 = sortTools33.siftDown(intArray41, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray50 = new int[] { 1, 1 };
        int[] intArray53 = sortTools47.reverse(intArray50, 1, (int) (short) 10);
        int[] intArray56 = sortTools33.swap(intArray50, (int) (byte) 10, (-1));
        int[] intArray59 = sortTools3.swap(intArray50, 0, (int) (short) 0);
        int[] intArray63 = sortTools1.rotate(intArray59, 1, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[0, 1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 1]");
        org.junit.Assert.assertNull(intArray63);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test023");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler2.parse("", 'a');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test024");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean9 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler2.parse("", ' ');
        java.lang.Boolean boolean17 = parameterHandler2.toBooleanObject(1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + false + "'", boolean17, false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test025");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        boolean[] booleanArray7 = new boolean[] { false, false };
        boolean boolean8 = parameterHandler2.hasOneTrue(booleanArray7);
        java.lang.Boolean boolean13 = parameterHandler2.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test026");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test027");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        java.lang.Number number17 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(number17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test028");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject((int) (short) 100, 35, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test029");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) ' ', (float) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test030");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test032");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray32 = sortTools20.siftDown(intArray28, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        int[] intArray37 = new int[] { 1, 1 };
        int[] intArray40 = sortTools34.reverse(intArray37, 1, (int) (short) 10);
        int[] intArray43 = sortTools20.swap(intArray37, (int) (byte) 10, (-1));
        int int47 = sortTools1.upper(intArray37, (int) (short) 10, 100, (int) (short) 1);
        boolean boolean50 = sortTools1.checkRange((-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-10086) + "'", int47 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test033");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.findNext("");
        java.lang.String str8 = taskHandler2.remove("");
        boolean boolean10 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test034");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools26.siftDown(intArray34, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray43 = new int[] { 1, 1 };
        int[] intArray46 = sortTools40.reverse(intArray43, 1, (int) (short) 10);
        int[] intArray49 = sortTools26.swap(intArray43, (int) (byte) 10, (-1));
        int[] intArray52 = sortTools1.swap(intArray49, (int) (short) -1, (int) (byte) 100);
        boolean boolean55 = sortTools1.checkRange((int) (byte) 0, (int) (short) -1);
        comp5111.assignment.cut.Subject subject56 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools57 = subject56.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler58 = subject56.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler59 = subject56.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools60 = subject56.new SortTools();
        int[] intArray65 = new int[] { (short) -1, (byte) 1, (byte) 0, '4' };
        int int69 = sortTools60.lower(intArray65, (int) (short) 1, (-1), (int) '4');
        int[] intArray73 = sortTools1.rotate(intArray65, (int) (short) 100, (int) (short) -1, 35);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-10086) + "'", int69 == (-10086));
        org.junit.Assert.assertNull(intArray73);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test035");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject10.new ParameterHandler();
        java.lang.Boolean boolean14 = parameterHandler12.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject16.new ParameterHandler();
        char[] charArray22 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler12.parse("hi!", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler2.parse("", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler2.parse("hi!", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean34 = parameterHandler2.toBooleanObject((int) ' ', (-1), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test036");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        java.lang.Boolean boolean23 = parameterHandler2.toBooleanObject(1, 35, 35, 1);
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test037");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("hi!", '4');
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler10 = subject8.new ParameterHandler();
        char[] charArray14 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap16 = parameterHandler10.parse(charArray14, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler2.parse(charArray14, 'a');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test038");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        int[] intArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sortTools4.compare(intArray5, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test039");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.lang.Boolean boolean6 = parameterHandler2.toBooleanObject("");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test040");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        int[] intArray8 = null;
        int[] intArray12 = sortTools1.siftDown(intArray8, 0, (int) (byte) -1, 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray31 = sortTools14.reverse(intArray25, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        int[] intArray38 = new int[] { 1, 1 };
        int[] intArray41 = sortTools35.reverse(intArray38, 1, (int) (short) 10);
        int[] intArray45 = sortTools33.siftDown(intArray41, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray50 = new int[] { 1, 1 };
        int[] intArray53 = sortTools47.reverse(intArray50, 1, (int) (short) 10);
        int[] intArray56 = sortTools33.swap(intArray50, (int) (byte) 10, (-1));
        int int60 = sortTools14.upper(intArray50, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray64 = sortTools1.rotate(intArray50, (int) (byte) 0, 35, (int) (byte) 100);
        boolean boolean67 = sortTools1.checkRange(97, 97);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-10086) + "'", int60 == (-10086));
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        int int10 = taskHandler2.getIndex("");
        java.lang.Class<?> wildcardClass11 = taskHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test042");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        java.lang.String str5 = textHandler1.unescapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test043");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        java.lang.String str10 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int int13 = sortTools1.lower(intArray6, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray14 = null;
        int[] intArray18 = sortTools1.rotate(intArray14, (-1), (int) 'a', (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler21 = subject19.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler22 = subject19.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray28 = new int[] { 1, 1 };
        int[] intArray31 = sortTools25.reverse(intArray28, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray42 = sortTools25.reverse(intArray36, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject43 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools44 = subject43.new SortTools();
        comp5111.assignment.cut.Subject subject45 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools46 = subject45.new SortTools();
        int[] intArray49 = new int[] { 1, 1 };
        int[] intArray52 = sortTools46.reverse(intArray49, 1, (int) (short) 10);
        int[] intArray56 = sortTools44.siftDown(intArray52, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools58 = subject57.new SortTools();
        int[] intArray61 = new int[] { 1, 1 };
        int[] intArray64 = sortTools58.reverse(intArray61, 1, (int) (short) 10);
        int[] intArray67 = sortTools44.swap(intArray61, (int) (byte) 10, (-1));
        int int71 = sortTools25.upper(intArray61, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray75 = sortTools23.doRotate(intArray61, 35, 35, (int) (short) 100);
        int[] intArray78 = sortTools1.insertionSort(intArray75, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1]");
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-10086) + "'", int71 == (-10086));
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(intArray78);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test045");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray23 = new int[] { 1, 1 };
        int[] intArray26 = sortTools20.reverse(intArray23, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools20.siftDown(intArray34, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray45 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray48 = sortTools20.reverse(intArray45, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools50 = subject49.new SortTools();
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        int[] intArray55 = new int[] { 1, 1 };
        int[] intArray58 = sortTools52.reverse(intArray55, 1, (int) (short) 10);
        int[] intArray62 = sortTools50.siftDown(intArray58, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        int[] intArray67 = new int[] { 1, 1 };
        int[] intArray70 = sortTools64.reverse(intArray67, 1, (int) (short) 10);
        int[] intArray73 = sortTools50.swap(intArray67, (int) (byte) 10, (-1));
        int[] intArray76 = sortTools20.swap(intArray67, 0, (int) (short) 0);
        comp5111.assignment.cut.Subject subject77 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools78 = subject77.new SortTools();
        comp5111.assignment.cut.Subject subject79 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools80 = subject79.new SortTools();
        int[] intArray83 = new int[] { 1, 1 };
        int[] intArray86 = sortTools80.reverse(intArray83, 1, (int) (short) 10);
        int int90 = sortTools78.lower(intArray83, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray94 = sortTools20.siftDown(intArray83, (int) (short) 1, (int) (byte) 1, (int) '#');
        int[] intArray97 = sortTools1.insertionSort(intArray94, 10, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[1, 1]");
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0, 1]");
        org.junit.Assert.assertNull(intArray70);
        org.junit.Assert.assertNull(intArray73);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1, 1]");
        org.junit.Assert.assertNull(intArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertNull(intArray97);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test046");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("", true, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test047");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertEquals("'" + boolean30 + "' != '" + false + "'", boolean30, false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test048");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("hi!", "hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject(0, (-1), (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test049");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test050");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (byte) 10, (long) (-10086));
        int int16 = numberHandler2.maximum((-10086), (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        java.lang.Boolean boolean13 = parameterHandler2.toBooleanObject((int) (byte) -1, (-1), (-1), (int) '#');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + true + "'", boolean13, true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test052");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((float) (byte) 10, (float) (short) 100);
        boolean boolean15 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Class<?> wildcardClass7 = parameterHandler6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test054");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray28 = new int[] { 1, 1 };
        int[] intArray31 = sortTools25.reverse(intArray28, 1, (int) (short) 10);
        int[] intArray35 = sortTools23.siftDown(intArray31, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray40 = new int[] { 1, 1 };
        int[] intArray43 = sortTools37.reverse(intArray40, 1, (int) (short) 10);
        int[] intArray46 = sortTools23.swap(intArray40, (int) (byte) 10, (-1));
        int int50 = sortTools21.upper(intArray40, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray54 = sortTools1.siftDown(intArray40, (int) (short) 1, (-1), (int) (byte) -1);
        int[] intArray55 = null;
        int[] intArray59 = sortTools1.siftDown(intArray55, (int) (byte) 1, (int) (byte) 10, 35);
        int[] intArray60 = null;
        int int64 = sortTools1.upper(intArray60, 100, (-1), (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1]");
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-10086) + "'", int50 == (-10086));
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-10086) + "'", int64 == (-10086));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test055");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((-10086), 0, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test056");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.newTextBuffer((int) (short) 10);
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler8 = subject6.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler9 = subject6.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler10 = subject6.new TextHandler();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler12 = subject11.new TextHandler();
        char[] charArray15 = new char[] { 'a', '4' };
        char[] charArray18 = textHandler12.toLowerCase(charArray15, (int) 'a', (int) (short) 1);
        char[] charArray20 = textHandler12.string2char("");
        char[] charArray23 = textHandler10.toUpperCase(charArray20, (int) (byte) 1, (int) (byte) 100);
        char[] charArray26 = textHandler1.toLowerCase(charArray23, 0, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4]");
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNull(charArray26);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test057");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean9 = parameterHandler2.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = parameterHandler2.toBooleanObject((-10086), 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test058");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray10 = new int[] { 1, 1 };
        int[] intArray13 = sortTools7.reverse(intArray10, 1, (int) (short) 10);
        int[] intArray17 = sortTools5.siftDown(intArray13, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray28 = sortTools5.swap(intArray22, (int) (byte) 10, (-1));
        int int32 = sortTools3.upper(intArray22, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray35 = sortTools1.swap(intArray22, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass36 = sortTools1.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test059");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        boolean boolean15 = numberHandler2.isNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test060");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("hi!", "hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject((-1), (int) (byte) 0, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test061");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        int int14 = numberHandler2.maximum((int) '4', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        long long16 = numberHandler2.minimum((long) 10, (long) (short) 10, (long) (-1));
        int int19 = numberHandler2.compare((double) 'a', (double) (-10086));
        boolean boolean21 = numberHandler2.isNumber("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test063");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools26.siftDown(intArray34, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray43 = new int[] { 1, 1 };
        int[] intArray46 = sortTools40.reverse(intArray43, 1, (int) (short) 10);
        int[] intArray49 = sortTools26.swap(intArray43, (int) (byte) 10, (-1));
        int[] intArray52 = sortTools1.swap(intArray49, (int) (short) -1, (int) (byte) 100);
        int[] intArray56 = new int[] { (byte) -1, (short) 1, 1 };
        int[] intArray59 = sortTools1.reverse(intArray56, 0, 0);
        int[] intArray60 = null;
        int int64 = sortTools1.lower(intArray60, 35, (int) (short) 1, 52);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-10086) + "'", int64 == (-10086));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test064");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray8 = new int[] { 1, 1 };
        int[] intArray11 = sortTools5.reverse(intArray8, 1, (int) (short) 10);
        int[] intArray15 = sortTools3.siftDown(intArray11, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        int[] intArray20 = new int[] { 1, 1 };
        int[] intArray23 = sortTools17.reverse(intArray20, 1, (int) (short) 10);
        int[] intArray26 = sortTools3.swap(intArray20, (int) (byte) 10, (-1));
        int int30 = sortTools1.upper(intArray20, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools32 = subject31.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler33 = subject31.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler34 = subject31.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject31.new SortTools();
        int[] intArray40 = new int[] { (short) -1, (byte) 1, (byte) 0, '4' };
        int int44 = sortTools35.lower(intArray40, (int) (short) 1, (-1), (int) '4');
        int[] intArray48 = sortTools1.rotate(intArray40, (int) (short) 100, (-10086), (int) (byte) 1);
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools50 = subject49.new SortTools();
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        int[] intArray57 = new int[] { 1, 1 };
        int[] intArray60 = sortTools54.reverse(intArray57, 1, (int) (short) 10);
        int[] intArray64 = sortTools52.siftDown(intArray60, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        int[] intArray69 = new int[] { 1, 1 };
        int[] intArray72 = sortTools66.reverse(intArray69, 1, (int) (short) 10);
        int[] intArray75 = sortTools52.swap(intArray69, (int) (byte) 10, (-1));
        int int79 = sortTools50.upper(intArray69, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int int83 = sortTools1.lower(intArray69, 0, (int) (short) 1, (int) (short) 1);
        int[] intArray87 = new int[] { (byte) 0, 100, (byte) 1 };
        int int91 = sortTools1.lower(intArray87, (-1), (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10086) + "'", int30 == (-10086));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-10086) + "'", int44 == (-10086));
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1]");
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1]");
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-10086) + "'", int79 == (-10086));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[0, 100, 1]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-10086) + "'", int91 == (-10086));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test065");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray13 = new int[] { 1, 1 };
        int[] intArray16 = sortTools10.reverse(intArray13, 1, (int) (short) 10);
        int[] intArray20 = sortTools8.siftDown(intArray16, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray31 = sortTools8.swap(intArray25, (int) (byte) 10, (-1));
        int int35 = sortTools6.upper(intArray25, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        int[] intArray42 = new int[] { 1, 1 };
        int[] intArray45 = sortTools39.reverse(intArray42, 1, (int) (short) 10);
        int int49 = sortTools37.lower(intArray42, (int) (short) 0, (int) (short) 1, 1);
        int int53 = sortTools6.upper(intArray42, (int) (byte) -1, 10, 0);
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools55 = subject54.new SortTools();
        comp5111.assignment.cut.Subject subject56 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools57 = subject56.new SortTools();
        int[] intArray60 = new int[] { 1, 1 };
        int[] intArray63 = sortTools57.reverse(intArray60, 1, (int) (short) 10);
        int int67 = sortTools55.lower(intArray60, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray71 = sortTools6.siftDown(intArray60, 0, (int) (byte) 0, 0);
        int int75 = sortTools4.upper(intArray60, (int) (short) -1, 10, 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-10086) + "'", int35 == (-10086));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1]");
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-10086) + "'", int53 == (-10086));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1]");
        org.junit.Assert.assertNull(intArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-10086) + "'", int75 == (-10086));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test066");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean43 = parameterHandler2.toBooleanObject("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + true + "'", boolean38, true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test067");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject((int) (short) 100, (int) ' ', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test068");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        boolean[] booleanArray7 = new boolean[] { false, false };
        boolean boolean8 = parameterHandler2.hasOneTrue(booleanArray7);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = parameterHandler2.parse("", '4');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test069");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((float) (short) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        comp5111.assignment.cut.Subject subject58 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools59 = subject58.new SortTools();
        comp5111.assignment.cut.Subject subject60 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools61 = subject60.new SortTools();
        int[] intArray64 = new int[] { 1, 1 };
        int[] intArray67 = sortTools61.reverse(intArray64, 1, (int) (short) 10);
        int int71 = sortTools59.lower(intArray64, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray75 = sortTools1.siftDown(intArray64, (int) (short) 1, (int) (byte) 1, (int) '#');
        boolean boolean78 = sortTools1.checkRange((-10086), (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test071");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        java.lang.Class<?> wildcardClass2 = sortTools1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test072");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray28 = new int[] { 1, 1 };
        int[] intArray31 = sortTools25.reverse(intArray28, 1, (int) (short) 10);
        int[] intArray35 = sortTools23.siftDown(intArray31, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray40 = new int[] { 1, 1 };
        int[] intArray43 = sortTools37.reverse(intArray40, 1, (int) (short) 10);
        int[] intArray46 = sortTools23.swap(intArray40, (int) (byte) 10, (-1));
        int int50 = sortTools21.upper(intArray40, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray54 = sortTools1.siftDown(intArray40, (int) (short) 1, (-1), (int) (byte) -1);
        int[] intArray55 = null;
        int[] intArray59 = sortTools1.siftDown(intArray55, (int) (byte) 1, (int) (byte) 10, 35);
        int[] intArray60 = null;
        int[] intArray64 = sortTools1.rotate(intArray60, (-10086), (int) (byte) 0, (-1));
        boolean boolean67 = sortTools1.checkRange(97, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1]");
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-10086) + "'", int50 == (-10086));
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test073");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        int int26 = numberHandler2.minimum((int) (short) 0, (int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test074");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject10.new ParameterHandler();
        java.lang.Boolean boolean14 = parameterHandler12.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject16.new ParameterHandler();
        char[] charArray22 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler12.parse("hi!", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler2.parse("", charArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean31 = parameterHandler2.toBooleanObject((int) (short) 10, (int) (byte) 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test075");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        int[] intArray8 = null;
        int[] intArray12 = sortTools1.siftDown(intArray8, 0, (int) (byte) -1, 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray31 = sortTools14.reverse(intArray25, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        int[] intArray38 = new int[] { 1, 1 };
        int[] intArray41 = sortTools35.reverse(intArray38, 1, (int) (short) 10);
        int[] intArray45 = sortTools33.siftDown(intArray41, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray50 = new int[] { 1, 1 };
        int[] intArray53 = sortTools47.reverse(intArray50, 1, (int) (short) 10);
        int[] intArray56 = sortTools33.swap(intArray50, (int) (byte) 10, (-1));
        int int60 = sortTools14.upper(intArray50, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray64 = sortTools1.rotate(intArray50, (int) (byte) 0, 35, (int) (byte) 100);
        boolean boolean67 = sortTools1.checkRange((int) (byte) 0, (int) (short) 100);
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        comp5111.assignment.cut.Subject subject70 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools71 = subject70.new SortTools();
        int[] intArray74 = new int[] { 1, 1 };
        int[] intArray77 = sortTools71.reverse(intArray74, 1, (int) (short) 10);
        int[] intArray81 = sortTools69.siftDown(intArray77, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject82 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools83 = subject82.new SortTools();
        int[] intArray86 = new int[] { 1, 1 };
        int[] intArray89 = sortTools83.reverse(intArray86, 1, (int) (short) 10);
        int[] intArray92 = sortTools69.swap(intArray86, (int) (byte) 10, (-1));
        int[] intArray96 = sortTools1.doRotate(intArray86, (int) (short) 10, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-10086) + "'", int60 == (-10086));
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1]");
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertNull(intArray81);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1]");
        org.junit.Assert.assertNull(intArray89);
        org.junit.Assert.assertNull(intArray92);
        org.junit.Assert.assertNull(intArray96);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test076");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        int[] intArray8 = null;
        int[] intArray12 = sortTools1.siftDown(intArray8, 0, (int) (byte) -1, 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray21 = new int[] { 1, 1 };
        int[] intArray24 = sortTools18.reverse(intArray21, 1, (int) (short) 10);
        int[] intArray28 = sortTools16.siftDown(intArray24, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        int[] intArray33 = new int[] { 1, 1 };
        int[] intArray36 = sortTools30.reverse(intArray33, 1, (int) (short) 10);
        int[] intArray39 = sortTools16.swap(intArray33, (int) (byte) 10, (-1));
        int int43 = sortTools14.upper(intArray33, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray50 = new int[] { 1, 1 };
        int[] intArray53 = sortTools47.reverse(intArray50, 1, (int) (short) 10);
        int int57 = sortTools45.lower(intArray50, (int) (short) 0, (int) (short) 1, 1);
        int int61 = sortTools14.upper(intArray50, (int) (byte) -1, 10, 0);
        comp5111.assignment.cut.Subject subject62 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools63 = subject62.new SortTools();
        comp5111.assignment.cut.Subject subject64 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools65 = subject64.new SortTools();
        int[] intArray68 = new int[] { 1, 1 };
        int[] intArray71 = sortTools65.reverse(intArray68, 1, (int) (short) 10);
        int int75 = sortTools63.lower(intArray68, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray79 = sortTools14.siftDown(intArray68, 0, (int) (byte) 0, 0);
        int int83 = sortTools1.lower(intArray79, (int) 'a', 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-10086) + "'", int43 == (-10086));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-10086) + "'", int61 == (-10086));
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1]");
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-10086) + "'", int83 == (-10086));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test077");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.findNext("");
        java.lang.String str8 = taskHandler2.remove("hi!");
        int int10 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test078");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        boolean[] booleanArray21 = new boolean[] { true, false, false, true, false };
        boolean boolean22 = parameterHandler2.hasOneTrue(booleanArray21);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler2.parse("", ' ');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test079");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("hi!", '4');
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test080");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        int int6 = taskHandler4.getIndex("");
        java.lang.String str8 = taskHandler4.getKey("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test081");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getKey("");
        int int8 = taskHandler2.getIndex("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test083");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        long long16 = numberHandler2.minimum((long) 10, (long) (short) 10, (long) (-1));
        int int19 = numberHandler2.compare((double) 'a', (double) (-10086));
        boolean boolean21 = numberHandler2.isNumber("hi!");
        long long25 = numberHandler2.minimum((long) (short) 100, (long) 52, 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test084");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int int13 = sortTools1.lower(intArray6, (int) (short) 0, (int) (short) 1, 1);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int int25 = sortTools1.lower(intArray21, (int) (short) 1, (int) '#', (int) (byte) 0);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        int[] intArray32 = new int[] { 1, 1 };
        int[] intArray35 = sortTools29.reverse(intArray32, 1, (int) (short) 10);
        int[] intArray39 = sortTools27.siftDown(intArray35, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray44 = new int[] { 1, 1 };
        int[] intArray47 = sortTools41.reverse(intArray44, 1, (int) (short) 10);
        int[] intArray50 = sortTools27.swap(intArray44, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        int[] intArray57 = new int[] { 1, 1 };
        int[] intArray60 = sortTools54.reverse(intArray57, 1, (int) (short) 10);
        int[] intArray64 = sortTools52.siftDown(intArray60, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        int[] intArray69 = new int[] { 1, 1 };
        int[] intArray72 = sortTools66.reverse(intArray69, 1, (int) (short) 10);
        int[] intArray75 = sortTools52.swap(intArray69, (int) (byte) 10, (-1));
        int[] intArray78 = sortTools27.swap(intArray75, (int) (short) -1, (int) (byte) 100);
        int[] intArray82 = new int[] { (byte) -1, (short) 1, 1 };
        int[] intArray85 = sortTools27.reverse(intArray82, 0, 0);
        int int89 = sortTools1.upper(intArray82, 52, 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10086) + "'", int25 == (-10086));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 1]");
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNull(intArray50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1, 1]");
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1]");
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(intArray78);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-10086) + "'", int89 == (-10086));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test085");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        char[] charArray18 = new char[] { '#', '#', ' ', '#', '#' };
        java.util.Map<java.lang.String, java.lang.String> strMap20 = parameterHandler2.parse(charArray18, '#');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "## ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "## ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #,  , #, #]");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test086");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        char[] charArray4 = new char[] { 'a', '4' };
        char[] charArray7 = textHandler1.toLowerCase(charArray4, (int) 'a', (int) (short) 1);
        char[] charArray9 = textHandler1.string2char("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4]");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test087");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        boolean boolean6 = numberHandler2.isDigits("hi!");
        long long10 = numberHandler2.maximum((long) 10, 1L, (long) 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test088");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        java.lang.String str12 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test089");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray9 = new int[] { 1, 1 };
        int[] intArray12 = sortTools6.reverse(intArray9, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        int[] intArray24 = sortTools6.siftDown(intArray20, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray31 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray34 = sortTools6.reverse(intArray31, (int) (byte) 10, (int) (byte) 1);
        int[] intArray38 = sortTools4.rotate(intArray34, (int) ' ', (int) (short) -1, 1);
        boolean boolean41 = sortTools4.checkRange((int) ' ', 0);
        int[] intArray42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = sortTools4.swap(intArray42, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test090");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        int[] intArray14 = new int[] { 1, 1 };
        int[] intArray17 = sortTools11.reverse(intArray14, 1, (int) (short) 10);
        int[] intArray21 = sortTools9.siftDown(intArray17, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        int[] intArray26 = new int[] { 1, 1 };
        int[] intArray29 = sortTools23.reverse(intArray26, 1, (int) (short) 10);
        int[] intArray32 = sortTools9.swap(intArray26, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        int[] intArray39 = new int[] { 1, 1 };
        int[] intArray42 = sortTools36.reverse(intArray39, 1, (int) (short) 10);
        int[] intArray46 = sortTools34.siftDown(intArray42, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools48 = subject47.new SortTools();
        int[] intArray51 = new int[] { 1, 1 };
        int[] intArray54 = sortTools48.reverse(intArray51, 1, (int) (short) 10);
        int[] intArray57 = sortTools34.swap(intArray51, (int) (byte) 10, (-1));
        int[] intArray60 = sortTools9.swap(intArray57, (int) (short) -1, (int) (byte) 100);
        int[] intArray64 = new int[] { (byte) -1, (short) 1, 1 };
        int[] intArray67 = sortTools9.reverse(intArray64, 0, 0);
        int[] intArray70 = sortTools1.insertionSort(intArray67, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray57);
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 1, 1]");
        org.junit.Assert.assertNull(intArray70);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test091");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        int int16 = numberHandler2.compare((double) (byte) 0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test092");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        int int26 = numberHandler2.maximum((int) (short) -1, 10, 97);
        boolean boolean28 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test093");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray8 = new int[] { 1, 1 };
        int[] intArray11 = sortTools5.reverse(intArray8, 1, (int) (short) 10);
        int[] intArray15 = sortTools3.siftDown(intArray11, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        int[] intArray20 = new int[] { 1, 1 };
        int[] intArray23 = sortTools17.reverse(intArray20, 1, (int) (short) 10);
        int[] intArray26 = sortTools3.swap(intArray20, (int) (byte) 10, (-1));
        int int30 = sortTools1.upper(intArray20, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools32 = subject31.new SortTools();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        int[] intArray37 = new int[] { 1, 1 };
        int[] intArray40 = sortTools34.reverse(intArray37, 1, (int) (short) 10);
        int int44 = sortTools32.lower(intArray37, (int) (short) 0, (int) (short) 1, 1);
        int int48 = sortTools1.upper(intArray37, (int) (byte) -1, 10, 0);
        boolean boolean51 = sortTools1.checkRange((-10086), (int) (byte) 0);
        boolean boolean54 = sortTools1.checkRange((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10086) + "'", int30 == (-10086));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-10086) + "'", int48 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test094");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test095");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject4.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler7 = subject4.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray13 = new int[] { 1, 1 };
        int[] intArray16 = sortTools10.reverse(intArray13, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray21 = new int[] { 1, 1 };
        int[] intArray24 = sortTools18.reverse(intArray21, 1, (int) (short) 10);
        int[] intArray27 = sortTools10.reverse(intArray21, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        int[] intArray34 = new int[] { 1, 1 };
        int[] intArray37 = sortTools31.reverse(intArray34, 1, (int) (short) 10);
        int[] intArray41 = sortTools29.siftDown(intArray37, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray46 = new int[] { 1, 1 };
        int[] intArray49 = sortTools43.reverse(intArray46, 1, (int) (short) 10);
        int[] intArray52 = sortTools29.swap(intArray46, (int) (byte) 10, (-1));
        int int56 = sortTools10.upper(intArray46, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray60 = sortTools8.doRotate(intArray46, 35, 35, (int) (short) 100);
        int[] intArray64 = sortTools3.rotate(intArray60, 35, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1]");
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray64);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test096");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test097");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler3 = subject0.new TaskHandler();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test098");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.findNext("");
        java.lang.String str8 = taskHandler2.remove("");
        boolean boolean10 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean8 = parameterHandler6.toBooleanObject("");
        java.lang.Boolean boolean13 = parameterHandler6.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-10086), (java.lang.Integer) 0, (java.lang.Integer) 100);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test100");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int8 = numberHandler2.minimum((int) (byte) 1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test101");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test102");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.minimum((long) 97, (long) '#', (long) (short) 0);
        boolean boolean16 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test104");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        java.lang.Boolean boolean17 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean17 + "' != '" + true + "'", boolean17, true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        boolean boolean16 = sortTools1.checkRange((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = sortTools1.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test106");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        java.lang.Boolean boolean10 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean15 = parameterHandler2.toBooleanObject("hi!", "hi!", "", "");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject17.new ParameterHandler();
        java.lang.Boolean boolean21 = parameterHandler19.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler25 = subject23.new ParameterHandler();
        char[] charArray29 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler25.parse(charArray29, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler19.parse("hi!", charArray29);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("hi!", charArray29);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + true + "'", boolean15, true);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray32 = sortTools20.siftDown(intArray28, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        int[] intArray37 = new int[] { 1, 1 };
        int[] intArray40 = sortTools34.reverse(intArray37, 1, (int) (short) 10);
        int[] intArray43 = sortTools20.swap(intArray37, (int) (byte) 10, (-1));
        int int47 = sortTools1.upper(intArray37, (int) (short) 10, 100, (int) (short) 1);
        comp5111.assignment.cut.Subject subject48 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools49 = subject48.new SortTools();
        int[] intArray52 = new int[] { 1, 1 };
        int[] intArray55 = sortTools49.reverse(intArray52, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject56 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools57 = subject56.new SortTools();
        int[] intArray60 = new int[] { 1, 1 };
        int[] intArray63 = sortTools57.reverse(intArray60, 1, (int) (short) 10);
        int[] intArray66 = sortTools49.reverse(intArray60, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        comp5111.assignment.cut.Subject subject69 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools70 = subject69.new SortTools();
        int[] intArray73 = new int[] { 1, 1 };
        int[] intArray76 = sortTools70.reverse(intArray73, 1, (int) (short) 10);
        int[] intArray80 = sortTools68.siftDown(intArray76, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject81 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools82 = subject81.new SortTools();
        int[] intArray85 = new int[] { 1, 1 };
        int[] intArray88 = sortTools82.reverse(intArray85, 1, (int) (short) 10);
        int[] intArray91 = sortTools68.swap(intArray85, (int) (byte) 10, (-1));
        int int95 = sortTools49.upper(intArray85, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray98 = sortTools1.swap(intArray85, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-10086) + "'", int47 == (-10086));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 1]");
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1]");
        org.junit.Assert.assertNull(intArray63);
        org.junit.Assert.assertNull(intArray66);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1]");
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertNull(intArray80);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1]");
        org.junit.Assert.assertNull(intArray88);
        org.junit.Assert.assertNull(intArray91);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-10086) + "'", int95 == (-10086));
        org.junit.Assert.assertNull(intArray98);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test108");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test109");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray9 = new int[] { 1, 1 };
        int[] intArray12 = sortTools6.reverse(intArray9, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        int[] intArray24 = sortTools6.siftDown(intArray20, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray31 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray34 = sortTools6.reverse(intArray31, (int) (byte) 10, (int) (byte) 1);
        int[] intArray38 = sortTools4.rotate(intArray34, (int) ' ', (int) (short) -1, 1);
        boolean boolean41 = sortTools4.checkRange(0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test110");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        java.lang.Boolean boolean9 = parameterHandler4.toBooleanObject("hi!", "hi!", "", "");
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test111");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("hi!", '4');
        char[] charArray8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = parameterHandler2.parse(charArray8, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean15 = parameterHandler2.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) (-10086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        java.lang.Boolean boolean23 = parameterHandler2.toBooleanObject(1, 35, 35, 1);
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("");
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject26.new ParameterHandler();
        java.lang.Boolean boolean30 = parameterHandler28.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler28.parse("", '#');
        java.lang.Boolean boolean38 = parameterHandler28.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap41 = parameterHandler28.parse("", 'a');
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler44 = subject42.new ParameterHandler();
        java.lang.Boolean boolean46 = parameterHandler44.toBooleanObject("hi!");
        boolean[] booleanArray49 = new boolean[] { false, false };
        boolean boolean50 = parameterHandler44.hasOneTrue(booleanArray49);
        boolean boolean51 = parameterHandler28.hasOneTrue(booleanArray49);
        boolean boolean52 = parameterHandler2.hasOneTrue(booleanArray49);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + false + "'", boolean38, false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test113");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        boolean boolean60 = sortTools1.checkRange(1, (int) (short) 1);
        int[] intArray63 = new int[] { 100, 1 };
        int[] intArray66 = sortTools1.reverse(intArray63, 35, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[100, 1]");
        org.junit.Assert.assertNull(intArray66);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test114");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((float) (byte) 10, (float) (short) 100);
        long long17 = numberHandler2.maximum((long) '#', 10L, 0L);
        int int21 = numberHandler2.maximum((-10086), (-10086), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test115");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("hi!", "hi!", "", "");
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject26.new ParameterHandler();
        java.lang.Boolean boolean30 = parameterHandler28.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler34 = subject32.new ParameterHandler();
        char[] charArray38 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap40 = parameterHandler34.parse(charArray38, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap41 = parameterHandler28.parse("hi!", charArray38);
        boolean[] booleanArray47 = new boolean[] { true, false, false, true, false };
        boolean boolean48 = parameterHandler28.hasOneTrue(booleanArray47);
        boolean boolean49 = parameterHandler2.hasOneTrue(booleanArray47);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + true + "'", boolean25, true);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test116");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        int int14 = taskHandler2.getIndex("hi!");
        boolean boolean16 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test117");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools26.siftDown(intArray34, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray43 = new int[] { 1, 1 };
        int[] intArray46 = sortTools40.reverse(intArray43, 1, (int) (short) 10);
        int[] intArray49 = sortTools26.swap(intArray43, (int) (byte) 10, (-1));
        int[] intArray52 = sortTools1.swap(intArray49, (int) (short) -1, (int) (byte) 100);
        int[] intArray56 = new int[] { (byte) -1, (short) 1, 1 };
        int[] intArray59 = sortTools1.reverse(intArray56, 0, 0);
        boolean boolean62 = sortTools1.checkRange(10, 100);
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler65 = subject63.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler66 = subject63.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools67 = subject63.new SortTools();
        int[] intArray72 = new int[] { (short) -1, (byte) 1, (byte) 0, '4' };
        int int76 = sortTools67.lower(intArray72, (int) (short) 1, (-1), (int) '4');
        int[] intArray79 = sortTools1.reverse(intArray72, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass80 = intArray79.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 1, 1]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-10086) + "'", int76 == (-10086));
        org.junit.Assert.assertNull(intArray79);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test118");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        int int6 = taskHandler4.getIndex("");
        boolean boolean8 = taskHandler4.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test120");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        java.lang.Boolean boolean11 = parameterHandler6.toBooleanObject(0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        long long19 = numberHandler2.minimum((long) (byte) 10, (long) (-1), (long) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test122");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum(100, 35, (-10086));
        boolean boolean20 = numberHandler2.isDigits("");
        java.lang.Number number22 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(number22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray10 = new int[] { 1, 1 };
        int[] intArray13 = sortTools7.reverse(intArray10, 1, (int) (short) 10);
        int[] intArray17 = sortTools5.siftDown(intArray13, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray28 = sortTools5.swap(intArray22, (int) (byte) 10, (-1));
        int int32 = sortTools3.upper(intArray22, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray35 = sortTools1.swap(intArray22, (int) '#', (int) (short) -1);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray44 = new int[] { 1, 1 };
        int[] intArray47 = sortTools41.reverse(intArray44, 1, (int) (short) 10);
        int[] intArray51 = sortTools39.siftDown(intArray47, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools53 = subject52.new SortTools();
        int[] intArray56 = new int[] { 1, 1 };
        int[] intArray59 = sortTools53.reverse(intArray56, 1, (int) (short) 10);
        int[] intArray62 = sortTools39.swap(intArray56, (int) (byte) 10, (-1));
        int int66 = sortTools37.upper(intArray56, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler69 = subject67.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler70 = subject67.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools71 = subject67.new SortTools();
        int[] intArray76 = new int[] { (short) -1, (byte) 1, (byte) 0, '4' };
        int int80 = sortTools71.lower(intArray76, (int) (short) 1, (-1), (int) '4');
        int[] intArray84 = sortTools37.rotate(intArray76, (int) (short) 100, (-10086), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = sortTools1.compare(intArray84, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1]");
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10086) + "'", int66 == (-10086));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-10086) + "'", int80 == (-10086));
        org.junit.Assert.assertNull(intArray84);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test124");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum((long) 'a', 52L, (long) 100);
        int int11 = numberHandler3.minimum((int) (short) 10, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test125");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        java.lang.Boolean boolean40 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = parameterHandler2.parse("", '4');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + true + "'", boolean38, true);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test126");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.findNext("");
        java.lang.String str8 = taskHandler2.remove("");
        java.lang.String str10 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test127");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test128");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.getProperty("hi!");
        int int18 = taskHandler2.getIndex("");
        java.lang.String str20 = taskHandler2.remove("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test129");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean25 = parameterHandler2.toBooleanObject("");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = parameterHandler2.parse("hi!", 'a');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test130");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isMapped("");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        boolean boolean18 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test131");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools26.siftDown(intArray34, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray43 = new int[] { 1, 1 };
        int[] intArray46 = sortTools40.reverse(intArray43, 1, (int) (short) 10);
        int[] intArray49 = sortTools26.swap(intArray43, (int) (byte) 10, (-1));
        int[] intArray52 = sortTools1.swap(intArray49, (int) (short) -1, (int) (byte) 100);
        boolean boolean55 = sortTools1.checkRange(0, (int) ' ');
        boolean boolean58 = sortTools1.checkRange((int) (short) 0, (-10086));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        int int14 = taskHandler2.getIndex("hi!");
        int int16 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test133");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int int13 = sortTools1.lower(intArray6, (int) (short) 0, (int) (short) 1, 1);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int int25 = sortTools1.lower(intArray21, (int) (short) 1, (int) '#', (int) (byte) 0);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        int[] intArray34 = new int[] { 1, 1 };
        int[] intArray37 = sortTools31.reverse(intArray34, 1, (int) (short) 10);
        int[] intArray41 = sortTools29.siftDown(intArray37, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray46 = new int[] { 1, 1 };
        int[] intArray49 = sortTools43.reverse(intArray46, 1, (int) (short) 10);
        int[] intArray52 = sortTools29.swap(intArray46, (int) (byte) 10, (-1));
        int int56 = sortTools27.upper(intArray46, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray59 = sortTools1.reverse(intArray46, (int) (byte) 0, (int) (byte) 1);
        boolean boolean62 = sortTools1.checkRange(0, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10086) + "'", int25 == (-10086));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1]");
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test134");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.string2char("hi!");
        java.lang.String str7 = textHandler1.unescapeJava("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int int13 = sortTools1.lower(intArray6, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray14 = null;
        int[] intArray18 = sortTools1.rotate(intArray14, (-1), (int) 'a', (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray23 = new int[] { 1, 1 };
        int[] intArray26 = sortTools20.reverse(intArray23, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray37 = sortTools20.reverse(intArray31, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray44 = new int[] { 1, 1 };
        int[] intArray47 = sortTools41.reverse(intArray44, 1, (int) (short) 10);
        int[] intArray51 = sortTools39.siftDown(intArray47, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools53 = subject52.new SortTools();
        int[] intArray56 = new int[] { 1, 1 };
        int[] intArray59 = sortTools53.reverse(intArray56, 1, (int) (short) 10);
        int[] intArray62 = sortTools39.swap(intArray56, (int) (byte) 10, (-1));
        int int66 = sortTools20.upper(intArray56, (int) (short) 10, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = sortTools1.compare(intArray56, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1]");
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10086) + "'", int66 == (-10086));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test136");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getKey("");
        boolean boolean8 = taskHandler2.isMapped("");
        java.lang.String str10 = taskHandler2.remove("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getKey("");
        boolean boolean8 = taskHandler2.isMapped("");
        boolean boolean10 = taskHandler2.isIndexed("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.isMapped("");
        java.lang.String str12 = taskHandler2.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test139");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) ' ', (int) '#', (int) (short) 100);
        int int9 = numberHandler2.compare((double) (short) 0, (double) 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test140");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        boolean boolean6 = taskHandler2.isIndexed("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test141");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test142");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        char[] charArray20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler2.parse("hi!", charArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean26 = parameterHandler2.toBooleanObject(0, (-10086), (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test143");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean23 = parameterHandler21.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject25.new ParameterHandler();
        char[] charArray31 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler27.parse(charArray31, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler21.parse("hi!", charArray31);
        java.lang.Boolean boolean39 = parameterHandler21.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler21.parse("", '#');
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler45 = subject44.new TextHandler();
        char[] charArray48 = new char[] { 'a', '4' };
        char[] charArray51 = textHandler45.toLowerCase(charArray48, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler21.parse("", charArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler2.parse(charArray48, (int) ' ', 97, '#');
        java.lang.Boolean boolean58 = parameterHandler2.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean63 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, 4]");
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(boolean58);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test144");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean23 = parameterHandler21.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject25.new ParameterHandler();
        char[] charArray31 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler27.parse(charArray31, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler21.parse("hi!", charArray31);
        java.lang.Boolean boolean39 = parameterHandler21.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler21.parse("", '#');
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler45 = subject44.new TextHandler();
        char[] charArray48 = new char[] { 'a', '4' };
        char[] charArray51 = textHandler45.toLowerCase(charArray48, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler21.parse("", charArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler2.parse(charArray48, (int) ' ', 97, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean61 = parameterHandler2.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, 4]");
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        java.lang.Class<?> wildcardClass13 = taskHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        int int12 = numberHandler2.minimum((int) (short) 0, 100, (int) 'a');
        java.lang.Number number14 = numberHandler2.parseNumber("");
        boolean boolean16 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.maximum((-1L), (long) (short) 1, 100L);
        int int17 = numberHandler2.compare((double) 0, (double) (byte) -1);
        java.lang.Number number19 = numberHandler2.parseNumber("");
        boolean boolean21 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test148");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        int int21 = numberHandler2.minimum((int) (byte) 0, (int) 'a', (int) (byte) 1);
        boolean boolean23 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test149");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("");
        int int7 = numberHandler2.compare((double) ' ', 10.0d);
        java.lang.Number number9 = numberHandler2.parseNumber("");
        int int12 = numberHandler2.compare((-1.0f), (float) (short) 100);
        boolean boolean14 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(number9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test150");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (byte) 10, (long) (-10086));
        boolean boolean14 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test152");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean9 = parameterHandler2.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = parameterHandler2.toBooleanObject((int) (byte) 100, 35, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler6 = subject0.new ParameterHandler();
        boolean[] booleanArray7 = null;
        boolean boolean8 = parameterHandler6.hasOneTrue(booleanArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test154");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        boolean boolean6 = numberHandler2.isDigits("hi!");
        long long10 = numberHandler2.minimum((-10086L), (long) (short) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10086L) + "'", long10 == (-10086L));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test155");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int14 = numberHandler2.maximum((int) ' ', 100, (int) '4');
        java.lang.Number number16 = numberHandler2.parseNumber("");
        long long20 = numberHandler2.maximum((long) '4', (long) (-10086), (long) 10);
        int int24 = numberHandler2.minimum((int) (short) 10, (int) '4', (-1));
        boolean boolean26 = numberHandler2.isDigits("");
        long long30 = numberHandler2.minimum(0L, 0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test156");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer((int) (byte) 1);
        char[] charArray6 = textHandler2.string2char("hi!");
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test157");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test158");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum((int) (short) 100, (int) (byte) 1, 0);
        boolean boolean20 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test159");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int17 = numberHandler2.compare((double) 0.0f, (double) 0);
        int int20 = numberHandler2.compare((double) '#', (double) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.remove("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test161");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        int[] intArray34 = new int[] { 1, 1 };
        int[] intArray37 = sortTools31.reverse(intArray34, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        int[] intArray42 = new int[] { 1, 1 };
        int[] intArray45 = sortTools39.reverse(intArray42, 1, (int) (short) 10);
        int[] intArray49 = sortTools31.siftDown(intArray45, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray56 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray59 = sortTools31.reverse(intArray56, (int) (byte) 10, (int) (byte) 1);
        int[] intArray63 = sortTools1.doRotate(intArray59, (int) (short) -1, 32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1]");
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray63);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test162");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("", 'a');
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject16.new ParameterHandler();
        java.lang.Boolean boolean20 = parameterHandler18.toBooleanObject("hi!");
        boolean[] booleanArray23 = new boolean[] { false, false };
        boolean boolean24 = parameterHandler18.hasOneTrue(booleanArray23);
        boolean boolean25 = parameterHandler2.hasOneTrue(booleanArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean30 = parameterHandler2.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test163");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.remove("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test164");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        int int20 = numberHandler2.compare((float) 32L, (float) (byte) 100);
        int int24 = numberHandler2.maximum(10, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test165");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        int[] intArray8 = null;
        int[] intArray12 = sortTools1.siftDown(intArray8, 0, (int) (byte) -1, 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray25 = new int[] { 1, 1 };
        int[] intArray28 = sortTools22.reverse(intArray25, 1, (int) (short) 10);
        int[] intArray31 = sortTools14.reverse(intArray25, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        int[] intArray38 = new int[] { 1, 1 };
        int[] intArray41 = sortTools35.reverse(intArray38, 1, (int) (short) 10);
        int[] intArray45 = sortTools33.siftDown(intArray41, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray50 = new int[] { 1, 1 };
        int[] intArray53 = sortTools47.reverse(intArray50, 1, (int) (short) 10);
        int[] intArray56 = sortTools33.swap(intArray50, (int) (byte) 10, (-1));
        int int60 = sortTools14.upper(intArray50, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray64 = sortTools1.rotate(intArray50, (int) (byte) 0, 35, (int) (byte) 100);
        boolean boolean67 = sortTools1.checkRange((int) (byte) 0, (int) (short) 100);
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        comp5111.assignment.cut.Subject subject70 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools71 = subject70.new SortTools();
        int[] intArray74 = new int[] { 1, 1 };
        int[] intArray77 = sortTools71.reverse(intArray74, 1, (int) (short) 10);
        int[] intArray81 = sortTools69.siftDown(intArray77, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject82 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools83 = subject82.new SortTools();
        int[] intArray86 = new int[] { 1, 1 };
        int[] intArray89 = sortTools83.reverse(intArray86, 1, (int) (short) 10);
        int[] intArray92 = sortTools69.swap(intArray86, (int) (byte) 10, (-1));
        int[] intArray95 = sortTools1.swap(intArray86, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[1, 1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-10086) + "'", int60 == (-10086));
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1]");
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertNull(intArray81);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1, 1]");
        org.junit.Assert.assertNull(intArray89);
        org.junit.Assert.assertNull(intArray92);
        org.junit.Assert.assertNull(intArray95);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int6 = numberHandler3.compare((double) 'a', (double) 0L);
        int int9 = numberHandler3.compare((double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test167");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        boolean boolean21 = sortTools1.checkRange((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test168");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject10.new ParameterHandler();
        java.lang.Boolean boolean14 = parameterHandler12.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject16.new ParameterHandler();
        char[] charArray22 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler12.parse("hi!", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler2.parse("", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler2.parse("", 'a');
        java.lang.Boolean boolean34 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) (-10086), (java.lang.Integer) 10, (java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean39 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + true + "'", boolean34, true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test169");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean23 = parameterHandler21.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject25.new ParameterHandler();
        char[] charArray31 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler27.parse(charArray31, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler21.parse("hi!", charArray31);
        java.lang.Boolean boolean39 = parameterHandler21.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler21.parse("", '#');
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler45 = subject44.new TextHandler();
        char[] charArray48 = new char[] { 'a', '4' };
        char[] charArray51 = textHandler45.toLowerCase(charArray48, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler21.parse("", charArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler2.parse(charArray48, (int) ' ', 97, '#');
        java.lang.Boolean boolean58 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean60 = parameterHandler2.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean65 = parameterHandler2.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, 4]");
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNull(boolean60);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test170");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum(100, 35, (-10086));
        boolean boolean20 = numberHandler2.isDigits("");
        boolean boolean22 = numberHandler2.isNumber("");
        long long26 = numberHandler2.maximum((long) 52, 1L, (long) (-10086));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        boolean boolean14 = numberHandler2.isNumber("");
        int int17 = numberHandler2.compare(1.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test172");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.getProperty("hi!");
        int int18 = taskHandler2.getIndex("");
        java.lang.String str20 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        java.lang.Number number10 = numberHandler2.parseNumber("");
        int int13 = numberHandler2.compare((float) 1, (float) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(number10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        int int14 = taskHandler2.getIndex("hi!");
        java.lang.String str16 = taskHandler2.findNext("hi!");
        java.lang.String str18 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10086) + "'", int14 == (-10086));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        int[] intArray14 = new int[] { 1, 1 };
        int[] intArray17 = sortTools11.reverse(intArray14, 1, (int) (short) 10);
        int[] intArray21 = sortTools3.siftDown(intArray17, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray28 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray31 = sortTools3.reverse(intArray28, (int) (byte) 10, (int) (byte) 1);
        int[] intArray34 = sortTools1.insertionSort(intArray31, (int) (byte) 100, 97);
        int[] intArray35 = null;
        int[] intArray38 = sortTools1.swap(intArray35, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test176");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        boolean boolean60 = sortTools1.checkRange(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        java.lang.String str12 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test178");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        boolean boolean14 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test179");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum(100, 35, (-10086));
        boolean boolean20 = numberHandler2.isDigits("");
        boolean boolean22 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test180");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("");
        int int10 = taskHandler2.getIndex("");
        boolean boolean12 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test181");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) ' ', (int) '#', (int) (short) 100);
        int int10 = numberHandler2.maximum((int) (byte) 10, (int) (byte) 0, (int) 'a');
        long long14 = numberHandler2.minimum((long) (byte) 100, (-1L), 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test182");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test183");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        char[] charArray20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler2.parse("hi!", charArray20);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler2.parse("hi!", ' ');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test184");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test185");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray23 = new int[] { 1, 1 };
        int[] intArray26 = sortTools20.reverse(intArray23, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        int[] intArray31 = new int[] { 1, 1 };
        int[] intArray34 = sortTools28.reverse(intArray31, 1, (int) (short) 10);
        int[] intArray38 = sortTools20.siftDown(intArray34, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        comp5111.assignment.cut.Subject subject41 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools42 = subject41.new SortTools();
        comp5111.assignment.cut.Subject subject43 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools44 = subject43.new SortTools();
        int[] intArray47 = new int[] { 1, 1 };
        int[] intArray50 = sortTools44.reverse(intArray47, 1, (int) (short) 10);
        int[] intArray54 = sortTools42.siftDown(intArray50, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools56 = subject55.new SortTools();
        int[] intArray59 = new int[] { 1, 1 };
        int[] intArray62 = sortTools56.reverse(intArray59, 1, (int) (short) 10);
        int[] intArray65 = sortTools42.swap(intArray59, (int) (byte) 10, (-1));
        int int69 = sortTools40.upper(intArray59, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray73 = sortTools20.siftDown(intArray59, (int) (short) 1, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray76 = sortTools1.reverse(intArray73, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1]");
        org.junit.Assert.assertNull(intArray50);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1, 1]");
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-10086) + "'", int69 == (-10086));
        org.junit.Assert.assertNull(intArray73);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test186");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        boolean boolean14 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test187");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.maximum(100L, (long) (-1), (long) (byte) 0);
        boolean boolean16 = numberHandler2.isNumber("");
        int int19 = numberHandler2.compare((double) 10.0f, (double) (byte) 100);
        boolean boolean21 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test188");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Class<?> wildcardClass3 = parameterHandler2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test189");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler4.parse("", '4');
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test190");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        boolean boolean60 = sortTools1.checkRange(1, (int) (short) 1);
        int[] intArray61 = null;
        int[] intArray65 = sortTools1.rotate(intArray61, (int) 'a', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(intArray65);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test191");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        int int12 = numberHandler2.minimum((int) (short) 0, 100, (int) 'a');
        java.lang.Number number14 = numberHandler2.parseNumber("");
        boolean boolean16 = numberHandler2.isNumber("hi!");
        long long20 = numberHandler2.minimum((long) (short) 100, (long) 52, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test192");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        int int17 = numberHandler2.minimum((int) '#', (-10086), (int) 'a');
        int int20 = numberHandler2.compare((double) 10, 1.0d);
        long long24 = numberHandler2.minimum(0L, 0L, (long) 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-10086) + "'", int17 == (-10086));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test193");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean43 = parameterHandler2.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) (-10086), (java.lang.Integer) (-10086), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + true + "'", boolean38, true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test194");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray10 = new int[] { 1, 1 };
        int[] intArray13 = sortTools7.reverse(intArray10, 1, (int) (short) 10);
        int[] intArray17 = sortTools5.siftDown(intArray13, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray28 = sortTools5.swap(intArray22, (int) (byte) 10, (-1));
        int int32 = sortTools3.upper(intArray22, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray35 = sortTools1.swap(intArray22, (int) '#', (int) (short) -1);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray40 = new int[] { 1, 1 };
        int[] intArray43 = sortTools37.reverse(intArray40, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray55 = sortTools37.siftDown(intArray51, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray62 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray65 = sortTools37.reverse(intArray62, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools67 = subject66.new SortTools();
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        int[] intArray72 = new int[] { 1, 1 };
        int[] intArray75 = sortTools69.reverse(intArray72, 1, (int) (short) 10);
        int[] intArray79 = sortTools67.siftDown(intArray75, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject80 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools81 = subject80.new SortTools();
        int[] intArray84 = new int[] { 1, 1 };
        int[] intArray87 = sortTools81.reverse(intArray84, 1, (int) (short) 10);
        int[] intArray90 = sortTools67.swap(intArray84, (int) (byte) 10, (-1));
        int[] intArray93 = sortTools37.swap(intArray84, 0, (int) (short) 0);
        int[] intArray97 = sortTools1.rotate(intArray93, 97, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass98 = intArray97.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1]");
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 1]");
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(intArray79);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0, 1]");
        org.junit.Assert.assertNull(intArray87);
        org.junit.Assert.assertNull(intArray90);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[0, 1]");
        org.junit.Assert.assertNull(intArray97);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test195");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test196");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        int int12 = taskHandler2.getIndex("");
        java.lang.String str14 = taskHandler2.getKey("hi!");
        boolean boolean16 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test197");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        int int12 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test198");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        boolean boolean12 = numberHandler2.isNumber("hi!");
        long long16 = numberHandler2.minimum((long) 1, (long) (-10086), (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-10086L) + "'", long16 == (-10086L));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test199");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test200");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.Class<?> wildcardClass7 = taskHandler2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test201");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.remove("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        long long21 = numberHandler2.maximum((long) (byte) 100, (long) (byte) 100, 100L);
        int int25 = numberHandler2.minimum((int) '4', (-10086), (int) ' ');
        int int29 = numberHandler2.maximum((int) (short) 100, (int) 'a', 52);
        int int32 = numberHandler2.compare((double) 1.0f, (double) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10086) + "'", int25 == (-10086));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test203");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test204");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        comp5111.assignment.cut.Subject subject58 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools59 = subject58.new SortTools();
        comp5111.assignment.cut.Subject subject60 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools61 = subject60.new SortTools();
        int[] intArray64 = new int[] { 1, 1 };
        int[] intArray67 = sortTools61.reverse(intArray64, 1, (int) (short) 10);
        int int71 = sortTools59.lower(intArray64, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray75 = sortTools1.siftDown(intArray64, (int) (short) 1, (int) (byte) 1, (int) '#');
        boolean boolean78 = sortTools1.checkRange((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test205");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        boolean[] booleanArray9 = null;
        boolean boolean10 = parameterHandler2.hasOneTrue(booleanArray9);
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("", '#');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test206");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray29 = sortTools17.siftDown(intArray25, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        int[] intArray34 = new int[] { 1, 1 };
        int[] intArray37 = sortTools31.reverse(intArray34, 1, (int) (short) 10);
        int[] intArray40 = sortTools17.swap(intArray34, (int) (byte) 10, (-1));
        int int44 = sortTools15.upper(intArray34, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject45 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools46 = subject45.new SortTools();
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools48 = subject47.new SortTools();
        int[] intArray51 = new int[] { 1, 1 };
        int[] intArray54 = sortTools48.reverse(intArray51, 1, (int) (short) 10);
        int int58 = sortTools46.lower(intArray51, (int) (short) 0, (int) (short) 1, 1);
        int int62 = sortTools15.upper(intArray51, (int) (byte) -1, 10, 0);
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        int[] intArray69 = new int[] { 1, 1 };
        int[] intArray72 = sortTools66.reverse(intArray69, 1, (int) (short) 10);
        int int76 = sortTools64.lower(intArray69, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray80 = sortTools15.siftDown(intArray69, 0, (int) (byte) 0, 0);
        int[] intArray84 = sortTools1.rotate(intArray80, 52, (-1), (-10086));
        boolean boolean87 = sortTools1.checkRange(32, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[1, 1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-10086) + "'", int44 == (-10086));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1]");
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[1, 1]");
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test207");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.maximum((-1L), (long) (short) 1, 100L);
        int int17 = numberHandler2.compare((double) 0, (double) (byte) -1);
        java.lang.Number number19 = numberHandler2.parseNumber("");
        boolean boolean21 = numberHandler2.isNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(number19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test208");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.maximum((-1L), (long) (short) 1, 100L);
        int int17 = numberHandler2.compare((double) 0, (double) (byte) -1);
        boolean boolean19 = numberHandler2.isNumber("");
        int int23 = numberHandler2.minimum((int) '4', (int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test209");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        java.lang.Class<?> wildcardClass6 = taskHandler5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test210");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.isMapped("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test212");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject25.new TextHandler();
        char[] charArray29 = new char[] { 'a', '4' };
        char[] charArray32 = textHandler26.toLowerCase(charArray29, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse("", charArray29);
        java.lang.Boolean boolean35 = parameterHandler2.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, 4]");
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(boolean35);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test213");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str6 = textHandler2.escapeJavaStyleString("hi!", false, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test214");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean12 = parameterHandler2.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("", 'a');
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler23 = subject21.new ParameterHandler();
        java.lang.Boolean boolean25 = parameterHandler23.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = parameterHandler23.parse("", '#');
        java.lang.Boolean boolean33 = parameterHandler23.toBooleanObject(97, (int) (byte) -1, 97, (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap36 = parameterHandler23.parse("", 'a');
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools38 = subject37.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler39 = subject37.new ParameterHandler();
        java.lang.Boolean boolean41 = parameterHandler39.toBooleanObject("hi!");
        boolean[] booleanArray44 = new boolean[] { false, false };
        boolean boolean45 = parameterHandler39.hasOneTrue(booleanArray44);
        boolean boolean46 = parameterHandler23.hasOneTrue(booleanArray44);
        boolean boolean47 = parameterHandler2.hasOneTrue(booleanArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean52 = parameterHandler2.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) (-10086), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + boolean33 + "' != '" + false + "'", boolean33, false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        java.lang.String str4 = textHandler2.unescapeJava("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean23 = parameterHandler21.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject25.new ParameterHandler();
        char[] charArray31 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler27.parse(charArray31, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler21.parse("hi!", charArray31);
        java.lang.Boolean boolean39 = parameterHandler21.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler21.parse("", '#');
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler45 = subject44.new TextHandler();
        char[] charArray48 = new char[] { 'a', '4' };
        char[] charArray51 = textHandler45.toLowerCase(charArray48, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler21.parse("", charArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler2.parse(charArray48, (int) ' ', 97, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap59 = parameterHandler2.parse("hi!", '4');
        java.lang.Boolean boolean64 = parameterHandler2.toBooleanObject("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, 4]");
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + true + "'", boolean64, true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test218");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        int int9 = numberHandler2.compare((double) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test219");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        int int12 = taskHandler2.getIndex("");
        java.lang.String str14 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test220");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler16 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler17 = subject14.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject14.new SortTools();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        int[] intArray27 = new int[] { 1, 1 };
        int[] intArray30 = sortTools24.reverse(intArray27, 1, (int) (short) 10);
        int[] intArray34 = sortTools22.siftDown(intArray30, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        int[] intArray39 = new int[] { 1, 1 };
        int[] intArray42 = sortTools36.reverse(intArray39, 1, (int) (short) 10);
        int[] intArray45 = sortTools22.swap(intArray39, (int) (byte) 10, (-1));
        int int49 = sortTools20.upper(intArray39, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject50 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools51 = subject50.new SortTools();
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools53 = subject52.new SortTools();
        int[] intArray56 = new int[] { 1, 1 };
        int[] intArray59 = sortTools53.reverse(intArray56, 1, (int) (short) 10);
        int int63 = sortTools51.lower(intArray56, (int) (short) 0, (int) (short) 1, 1);
        int int67 = sortTools20.upper(intArray56, (int) (byte) -1, 10, 0);
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        comp5111.assignment.cut.Subject subject70 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools71 = subject70.new SortTools();
        int[] intArray74 = new int[] { 1, 1 };
        int[] intArray77 = sortTools71.reverse(intArray74, 1, (int) (short) 10);
        int int81 = sortTools69.lower(intArray74, (int) (short) 0, (int) (short) 1, 1);
        int[] intArray85 = sortTools20.siftDown(intArray74, 0, (int) (byte) 0, 0);
        int[] intArray89 = sortTools18.siftDown(intArray74, (int) (short) 10, (-10086), (int) (short) 0);
        int[] intArray92 = sortTools1.reverse(intArray74, (int) ' ', (int) (short) 10);
        boolean boolean95 = sortTools1.checkRange((-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNull(intArray30);
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 1]");
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-10086) + "'", int49 == (-10086));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1]");
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-10086) + "'", int67 == (-10086));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1, 1]");
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 1]");
        org.junit.Assert.assertNull(intArray89);
        org.junit.Assert.assertNull(intArray92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test221");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler5 = subject0.new TaskHandler();
        int int7 = taskHandler5.getIndex("hi!");
        java.lang.String str9 = taskHandler5.getKey("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test222");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        boolean boolean21 = numberHandler2.isDigits("hi!");
        int int24 = numberHandler2.compare((float) 1L, 10.0f);
        long long28 = numberHandler2.minimum((long) (byte) 10, (long) (short) 0, 0L);
        long long32 = numberHandler2.minimum(100L, (long) (byte) 10, 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test223");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler25 = subject24.new TextHandler();
        java.lang.String str27 = textHandler25.unescapeJava("hi!");
        char[] charArray29 = textHandler25.newTextBuffer((int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler2.parse(charArray29, 0, (int) (short) -1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean38 = parameterHandler2.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test224");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        long long21 = numberHandler2.maximum((long) (byte) 100, (long) (byte) 100, 100L);
        int int24 = numberHandler2.compare((float) 0L, (float) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test225");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test227");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        char[] charArray3 = textHandler1.newTextBuffer(32);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isMapped("");
        java.lang.Class<?> wildcardClass15 = taskHandler2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray9 = new int[] { 1, 1 };
        int[] intArray12 = sortTools6.reverse(intArray9, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray17 = new int[] { 1, 1 };
        int[] intArray20 = sortTools14.reverse(intArray17, 1, (int) (short) 10);
        int[] intArray23 = sortTools6.reverse(intArray17, (-1), (int) (byte) 100);
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        int[] intArray30 = new int[] { 1, 1 };
        int[] intArray33 = sortTools27.reverse(intArray30, 1, (int) (short) 10);
        int[] intArray37 = sortTools25.siftDown(intArray33, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        int[] intArray42 = new int[] { 1, 1 };
        int[] intArray45 = sortTools39.reverse(intArray42, 1, (int) (short) 10);
        int[] intArray48 = sortTools25.swap(intArray42, (int) (byte) 10, (-1));
        int int52 = sortTools6.upper(intArray42, (int) (short) 10, 100, (int) (short) 1);
        int[] intArray56 = sortTools4.doRotate(intArray42, 35, 35, (int) (short) 100);
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools58 = subject57.new SortTools();
        int[] intArray61 = new int[] { 1, 1 };
        int[] intArray64 = sortTools58.reverse(intArray61, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        int[] intArray69 = new int[] { 1, 1 };
        int[] intArray72 = sortTools66.reverse(intArray69, 1, (int) (short) 10);
        int[] intArray76 = sortTools58.siftDown(intArray72, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray80 = new int[] { (byte) 0, ' ', 10 };
        int[] intArray84 = sortTools58.siftDown(intArray80, (-10086), (int) (short) 100, 0);
        int[] intArray88 = sortTools4.rotate(intArray80, 35, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1]");
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-10086) + "'", int52 == (-10086));
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[1, 1]");
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 1]");
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 32, 10]");
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertNull(intArray88);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test230");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.newTextBuffer((int) (short) 10);
        java.lang.String str9 = textHandler1.escapeJavaStyleString("", true, false);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject10.new ParameterHandler();
        char[] charArray16 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap18 = parameterHandler12.parse(charArray16, 'a');
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject20.new ParameterHandler();
        java.lang.Boolean boolean24 = parameterHandler22.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler28 = subject26.new ParameterHandler();
        char[] charArray32 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler28.parse(charArray32, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap35 = parameterHandler22.parse("hi!", charArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = parameterHandler12.parse("", charArray32);
        char[] charArray39 = textHandler1.toUpperCase(charArray32, (int) ' ', 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(charArray39);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test231");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getKey("");
        int int8 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test232");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        java.lang.String str14 = taskHandler2.findNext("");
        boolean boolean16 = taskHandler2.isMapped("hi!");
        java.lang.String str18 = taskHandler2.remove("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test233");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        int int20 = numberHandler2.compare((float) 32L, (float) (byte) 100);
        int int24 = numberHandler2.minimum(97, (int) '4', 0);
        int int27 = numberHandler2.compare((float) (byte) 1, (float) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test234");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        java.lang.String str10 = taskHandler2.findNext("");
        int int12 = taskHandler2.getIndex("");
        java.lang.String str14 = taskHandler2.getKey("hi!");
        boolean boolean16 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test235");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((float) (byte) 10, (float) (short) 100);
        boolean boolean15 = numberHandler2.isDigits("hi!");
        long long19 = numberHandler2.maximum((long) 100, (long) 97, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test236");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.string2char("hi!");
        char[] charArray7 = textHandler1.newTextBuffer((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test237");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        boolean boolean12 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        long long21 = numberHandler2.maximum((long) (byte) 100, (long) (byte) 100, 100L);
        int int25 = numberHandler2.minimum((int) '4', (-10086), (int) ' ');
        int int29 = numberHandler2.maximum(32, 35, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-10086) + "'", int25 == (-10086));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test239");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        java.lang.String str10 = taskHandler2.remove("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test241");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        java.lang.String str3 = textHandler1.unescapeJava("hi!");
        char[] charArray5 = textHandler1.newTextBuffer((int) (short) 0);
        char[] charArray7 = textHandler1.newTextBuffer((int) (short) 100);
        char[] charArray9 = textHandler1.string2char("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test242");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        int[] intArray29 = new int[] { 1, 1 };
        int[] intArray32 = sortTools26.reverse(intArray29, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        int[] intArray37 = new int[] { 1, 1 };
        int[] intArray40 = sortTools34.reverse(intArray37, 1, (int) (short) 10);
        int[] intArray44 = sortTools26.siftDown(intArray40, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray51 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray54 = sortTools26.reverse(intArray51, (int) (byte) 10, (int) (byte) 1);
        int[] intArray57 = sortTools1.swap(intArray51, (-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass58 = intArray51.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 1]");
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 1]");
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test243");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        long long16 = numberHandler2.maximum((long) (-1), (-1L), (long) (short) 10);
        boolean boolean18 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isMapped("hi!");
        java.lang.String str8 = taskHandler2.getProperty("hi!");
        boolean boolean10 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test245");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        boolean boolean32 = sortTools1.checkRange((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test246");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("hi!", '4');
        char[] charArray8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = parameterHandler2.parse(charArray8, 'a');
        boolean[] booleanArray15 = new boolean[] { true, true, false, true };
        boolean boolean16 = parameterHandler2.hasOneTrue(booleanArray15);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler20 = subject18.new ParameterHandler();
        java.lang.Boolean boolean22 = parameterHandler20.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler26 = subject24.new ParameterHandler();
        char[] charArray30 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap32 = parameterHandler26.parse(charArray30, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler20.parse("hi!", charArray30);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler2.parse("hi!", charArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean39 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test247");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        boolean boolean24 = numberHandler2.isNumber("");
        int int28 = numberHandler2.minimum((int) (short) 10, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.minimum((long) (byte) 10, (long) 10, (long) '4');
        int int10 = numberHandler3.compare((double) 1.0f, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray18 = sortTools1.reverse(intArray12, (-1), (int) (byte) 100);
        int[] intArray21 = new int[] { '4', 97 };
        int[] intArray25 = sortTools1.rotate(intArray21, (int) (short) 100, (int) '#', 35);
        int[] intArray28 = new int[] { 0, 32 };
        int[] intArray32 = sortTools1.doRotate(intArray28, (int) '4', 10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[52, 97]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 32]");
        org.junit.Assert.assertNull(intArray32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test250");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.isMapped("");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test251");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.minimum(97, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test252");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        char[] charArray20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler2.parse("hi!", charArray20);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler2.parse("", '4');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test253");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum((int) (byte) 100, (-1), (int) (short) 0);
        java.lang.Number number20 = numberHandler2.parseNumber("");
        boolean boolean22 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test254");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int14 = numberHandler2.maximum((int) ' ', 100, (int) '4');
        java.lang.Number number16 = numberHandler2.parseNumber("");
        long long20 = numberHandler2.maximum((long) '4', (long) (-10086), (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler1 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = parameterHandler2.parse("", '4');
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test256");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        int int12 = taskHandler2.getIndex("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test257");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        int int20 = numberHandler2.compare((float) 32L, (float) (byte) 100);
        int int24 = numberHandler2.minimum(97, (int) '4', 0);
        java.lang.Number number26 = numberHandler2.parseNumber("");
        boolean boolean28 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(number26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test258");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = parameterHandler2.parse("", '#');
        java.lang.Boolean boolean9 = parameterHandler2.toBooleanObject("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler2.parse("", ' ');
        char[] charArray13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = parameterHandler2.parse(charArray13, (-10086), (int) 'a', ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap20 = parameterHandler2.parse("hi!", ' ');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test260");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        long long19 = numberHandler2.maximum((-10086L), (long) (short) 1, (long) '#');
        int int22 = numberHandler2.compare((double) (-1L), (double) 97L);
        boolean boolean24 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler2.parse("", '#');
        char[] charArray24 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler2.parse(charArray24, '#');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test262");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        int int26 = numberHandler2.maximum((int) (short) -1, 10, 97);
        int int29 = numberHandler2.compare((float) (-1), (float) 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        long long14 = numberHandler2.maximum((long) '4', (long) (short) 100, (-1L));
        int int18 = numberHandler2.maximum((int) (short) 100, (int) (byte) 1, 0);
        int int21 = numberHandler2.compare((float) 32L, (float) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test264");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        char[] charArray4 = new char[] { 'a', '4' };
        char[] charArray7 = textHandler1.toLowerCase(charArray4, (int) 'a', (int) (short) 1);
        char[] charArray9 = textHandler1.string2char("");
        java.lang.String str13 = textHandler1.escapeJavaStyleString("hi!", true, true);
        java.lang.String str15 = textHandler1.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4]");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test265");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        java.lang.String str16 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test266");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler23 = subject22.new TextHandler();
        java.lang.String str25 = textHandler23.unescapeJava("hi!");
        char[] charArray27 = textHandler23.newTextBuffer((int) (short) 10);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler30 = subject28.new ParameterHandler();
        java.lang.Boolean boolean32 = parameterHandler30.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler36 = subject34.new ParameterHandler();
        char[] charArray40 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler36.parse(charArray40, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap43 = parameterHandler30.parse("hi!", charArray40);
        char[] charArray46 = textHandler23.toUpperCase(charArray40, 1, 100);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler2.parse("hi!", charArray46);
        java.lang.Boolean boolean49 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean51 = parameterHandler2.toBooleanObject("hi!");
        java.lang.Boolean boolean56 = parameterHandler2.toBooleanObject((-1), (int) (short) -1, (-1), (int) (short) 10);
        java.lang.Boolean boolean58 = parameterHandler2.toBooleanObject("");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNull(boolean51);
        org.junit.Assert.assertEquals("'" + boolean56 + "' != '" + true + "'", boolean56, true);
        org.junit.Assert.assertNull(boolean58);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test267");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler12 = subject10.new ParameterHandler();
        java.lang.Boolean boolean14 = parameterHandler12.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools17 = subject16.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler18 = subject16.new ParameterHandler();
        char[] charArray22 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap24 = parameterHandler18.parse(charArray22, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap25 = parameterHandler12.parse("hi!", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = parameterHandler2.parse("", charArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler2.parse("", 'a');
        java.lang.Boolean boolean34 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) (-10086), (java.lang.Integer) 10, (java.lang.Integer) 0);
        java.lang.Boolean boolean39 = parameterHandler2.toBooleanObject("", "hi!", "", "");
        java.lang.Boolean boolean41 = parameterHandler2.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + true + "'", boolean34, true);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + false + "'", boolean39, false);
        org.junit.Assert.assertNull(boolean41);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test268");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject0.new SortTools();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test269");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        boolean boolean21 = numberHandler2.isDigits("hi!");
        int int24 = numberHandler2.compare((float) 1L, 10.0f);
        long long28 = numberHandler2.minimum((long) (byte) 10, (long) (short) 0, 0L);
        long long32 = numberHandler2.maximum((long) 32, (long) 97, 97L);
        boolean boolean34 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("");
        java.lang.String str6 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test271");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isMapped("");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        java.lang.String str18 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        java.lang.Boolean boolean4 = parameterHandler2.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler8 = subject6.new ParameterHandler();
        char[] charArray12 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap14 = parameterHandler8.parse(charArray12, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap15 = parameterHandler2.parse("hi!", charArray12);
        java.lang.Boolean boolean20 = parameterHandler2.toBooleanObject("hi!", "hi!", "hi!", "");
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler23 = subject22.new TextHandler();
        java.lang.String str25 = textHandler23.unescapeJava("hi!");
        char[] charArray27 = textHandler23.newTextBuffer((int) (short) 10);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler30 = subject28.new ParameterHandler();
        java.lang.Boolean boolean32 = parameterHandler30.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler36 = subject34.new ParameterHandler();
        char[] charArray40 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler36.parse(charArray40, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap43 = parameterHandler30.parse("hi!", charArray40);
        char[] charArray46 = textHandler23.toUpperCase(charArray40, 1, 100);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler2.parse("hi!", charArray46);
        java.lang.Boolean boolean52 = parameterHandler2.toBooleanObject((-1), 0, (int) (short) -1, 32);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + true + "'", boolean20, true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertEquals("'" + boolean52 + "' != '" + false + "'", boolean52, false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test273");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.String str10 = taskHandler2.remove("");
        int int12 = taskHandler2.getIndex("");
        int int14 = taskHandler2.getIndex("");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test274");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        boolean boolean10 = taskHandler2.isIndexed("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        boolean boolean14 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test275");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((float) (byte) 10, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test276");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray28 = new int[] { 1, 1 };
        int[] intArray31 = sortTools25.reverse(intArray28, 1, (int) (short) 10);
        int[] intArray35 = sortTools23.siftDown(intArray31, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray40 = new int[] { 1, 1 };
        int[] intArray43 = sortTools37.reverse(intArray40, 1, (int) (short) 10);
        int[] intArray46 = sortTools23.swap(intArray40, (int) (byte) 10, (-1));
        int int50 = sortTools21.upper(intArray40, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray54 = sortTools1.siftDown(intArray40, (int) (short) 1, (-1), (int) (byte) -1);
        int[] intArray55 = null;
        int[] intArray59 = sortTools1.siftDown(intArray55, (int) (byte) 1, (int) (byte) 10, 35);
        comp5111.assignment.cut.Subject subject60 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools61 = subject60.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler62 = subject60.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools63 = subject60.new SortTools();
        int[] intArray65 = new int[] { (-1) };
        int[] intArray68 = sortTools63.swap(intArray65, (int) '#', (int) (short) -1);
        int int72 = sortTools1.lower(intArray65, 32, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1]");
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-10086) + "'", int50 == (-10086));
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1]");
        org.junit.Assert.assertNull(intArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-10086) + "'", int72 == (-10086));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test277");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray10 = new int[] { 1, 1 };
        int[] intArray13 = sortTools7.reverse(intArray10, 1, (int) (short) 10);
        int[] intArray17 = sortTools5.siftDown(intArray13, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray28 = sortTools5.swap(intArray22, (int) (byte) 10, (-1));
        int int32 = sortTools3.upper(intArray22, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray35 = sortTools1.swap(intArray22, (int) '#', (int) (short) -1);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray44 = new int[] { 1, 1 };
        int[] intArray47 = sortTools41.reverse(intArray44, 1, (int) (short) 10);
        int[] intArray51 = sortTools39.siftDown(intArray47, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools53 = subject52.new SortTools();
        int[] intArray56 = new int[] { 1, 1 };
        int[] intArray59 = sortTools53.reverse(intArray56, 1, (int) (short) 10);
        int[] intArray62 = sortTools39.swap(intArray56, (int) (byte) 10, (-1));
        int int66 = sortTools37.upper(intArray56, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        comp5111.assignment.cut.Subject subject69 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools70 = subject69.new SortTools();
        int[] intArray73 = new int[] { 1, 1 };
        int[] intArray76 = sortTools70.reverse(intArray73, 1, (int) (short) 10);
        int int80 = sortTools68.lower(intArray73, (int) (short) 0, (int) (short) 1, 1);
        int int84 = sortTools37.upper(intArray73, (int) (byte) -1, 10, 0);
        int int88 = sortTools1.lower(intArray73, (int) 'a', 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[1, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[1, 1]");
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10086) + "'", int66 == (-10086));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 1]");
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-10086) + "'", int84 == (-10086));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-10086) + "'", int88 == (-10086));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test278");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        int int7 = numberHandler2.compare((double) (short) 1, (double) '4');
        int int11 = numberHandler2.minimum(32, 52, (int) (short) 100);
        long long15 = numberHandler2.minimum((long) (short) 10, 35L, 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test279");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray10 = new int[] { 1, 1 };
        int[] intArray13 = sortTools7.reverse(intArray10, 1, (int) (short) 10);
        int[] intArray17 = sortTools5.siftDown(intArray13, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        int[] intArray22 = new int[] { 1, 1 };
        int[] intArray25 = sortTools19.reverse(intArray22, 1, (int) (short) 10);
        int[] intArray28 = sortTools5.swap(intArray22, (int) (byte) 10, (-1));
        int int32 = sortTools3.upper(intArray22, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray35 = sortTools1.swap(intArray22, (int) '#', (int) (short) -1);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray46 = new int[] { 1, 1 };
        int[] intArray49 = sortTools43.reverse(intArray46, 1, (int) (short) 10);
        int[] intArray53 = sortTools41.siftDown(intArray49, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools55 = subject54.new SortTools();
        int[] intArray58 = new int[] { 1, 1 };
        int[] intArray61 = sortTools55.reverse(intArray58, 1, (int) (short) 10);
        int[] intArray64 = sortTools41.swap(intArray58, (int) (byte) 10, (-1));
        int int68 = sortTools39.upper(intArray58, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        int[] intArray71 = sortTools37.swap(intArray58, (int) '#', (int) (short) -1);
        int int75 = sortTools1.lower(intArray71, (int) (byte) -1, 32, 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 1]");
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[1, 1]");
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-10086) + "'", int68 == (-10086));
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-10086) + "'", int75 == (-10086));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test280");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        int int8 = taskHandler2.getIndex("");
        int int10 = taskHandler2.getIndex("");
        java.lang.String str12 = taskHandler2.remove("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test281");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        int int6 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10086) + "'", int6 == (-10086));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test282");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler4 = subject0.new TextHandler();
        char[] charArray6 = textHandler4.newTextBuffer((int) (byte) 1);
        java.lang.String str10 = textHandler4.escapeJavaStyleString("", true, false);
        char[] charArray12 = textHandler4.string2char("hi!");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[h, i, !]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        boolean boolean24 = numberHandler2.isNumber("");
        int int27 = numberHandler2.compare((float) 35, (float) 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test284");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        char[] charArray6 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap8 = parameterHandler2.parse(charArray6, 'a');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler11 = subject9.new ParameterHandler();
        java.lang.Boolean boolean13 = parameterHandler11.toBooleanObject("hi!");
        boolean[] booleanArray16 = new boolean[] { false, false };
        boolean boolean17 = parameterHandler11.hasOneTrue(booleanArray16);
        boolean boolean18 = parameterHandler2.hasOneTrue(booleanArray16);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean23 = parameterHandler21.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject25.new ParameterHandler();
        char[] charArray31 = new char[] { ' ', 'a', ' ' };
        java.util.Map<java.lang.String, java.lang.String> strMap33 = parameterHandler27.parse(charArray31, 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler21.parse("hi!", charArray31);
        java.lang.Boolean boolean39 = parameterHandler21.toBooleanObject("hi!", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap42 = parameterHandler21.parse("", '#');
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler45 = subject44.new TextHandler();
        char[] charArray48 = new char[] { 'a', '4' };
        char[] charArray51 = textHandler45.toLowerCase(charArray48, (int) 'a', (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler21.parse("", charArray48);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler2.parse(charArray48, (int) ' ', 97, '#');
        java.lang.Boolean boolean58 = parameterHandler2.toBooleanObject("");
        java.lang.Boolean boolean60 = parameterHandler2.toBooleanObject("hi!");
        java.lang.Boolean boolean65 = parameterHandler2.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) (-10086), (java.lang.Integer) (-1), (java.lang.Integer) 32);
        java.lang.Boolean boolean70 = parameterHandler2.toBooleanObject("", "", "", "hi!");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , a,  ]");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + boolean39 + "' != '" + true + "'", boolean39, true);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, 4]");
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNull(boolean60);
        org.junit.Assert.assertEquals("'" + boolean65 + "' != '" + true + "'", boolean65, true);
        org.junit.Assert.assertEquals("'" + boolean70 + "' != '" + true + "'", boolean70, true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        int int22 = numberHandler2.compare((double) ' ', (double) (byte) 1);
        boolean boolean24 = numberHandler2.isNumber("");
        int int28 = numberHandler2.maximum(97, 10, 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test286");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test287");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        java.lang.String str12 = taskHandler2.getKey("");
        boolean boolean14 = taskHandler2.isIndexed("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test288");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((double) (-1), (double) 0);
        long long17 = numberHandler2.minimum((long) 100, (long) (byte) 10, (-1L));
        boolean boolean19 = numberHandler2.isDigits("hi!");
        int int23 = numberHandler2.minimum(1, (int) (short) 10, 1);
        int int27 = numberHandler2.minimum(32, (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test289");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        int[] intArray5 = null;
        int[] intArray9 = sortTools4.rotate(intArray5, (int) (byte) 10, 52, (int) (short) 1);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        java.lang.String str12 = taskHandler2.remove("hi!");
        int int14 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test291");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        java.lang.String str8 = taskHandler2.remove("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        boolean boolean14 = taskHandler2.isMapped("");
        java.lang.String str16 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test292");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.remove("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("hi!");
        java.lang.String str14 = taskHandler2.remove("hi!");
        java.lang.String str16 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test293");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler2 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test294");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test295");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler5 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler6 = subject0.new NumberHandler();
        long long10 = numberHandler6.minimum((-10086L), (long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10086L) + "'", long10 == (-10086L));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test296");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray4 = new int[] { 1, 1 };
        int[] intArray7 = sortTools1.reverse(intArray4, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray12 = new int[] { 1, 1 };
        int[] intArray15 = sortTools9.reverse(intArray12, 1, (int) (short) 10);
        int[] intArray19 = sortTools1.siftDown(intArray15, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray26 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray29 = sortTools1.reverse(intArray26, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray36 = new int[] { 1, 1 };
        int[] intArray39 = sortTools33.reverse(intArray36, 1, (int) (short) 10);
        int[] intArray43 = sortTools31.siftDown(intArray39, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray48 = new int[] { 1, 1 };
        int[] intArray51 = sortTools45.reverse(intArray48, 1, (int) (short) 10);
        int[] intArray54 = sortTools31.swap(intArray48, (int) (byte) 10, (-1));
        int[] intArray57 = sortTools1.swap(intArray48, 0, (int) (short) 0);
        boolean boolean60 = sortTools1.checkRange((int) '#', (int) (byte) 0);
        comp5111.assignment.cut.Subject subject61 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools62 = subject61.new SortTools();
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        int[] intArray67 = new int[] { 1, 1 };
        int[] intArray70 = sortTools64.reverse(intArray67, 1, (int) (short) 10);
        int[] intArray74 = sortTools62.siftDown(intArray70, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject75 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools76 = subject75.new SortTools();
        int[] intArray79 = new int[] { 1, 1 };
        int[] intArray82 = sortTools76.reverse(intArray79, 1, (int) (short) 10);
        int[] intArray85 = sortTools62.swap(intArray79, (int) (byte) 10, (-1));
        int int89 = sortTools1.upper(intArray79, 1, (-1), (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1]");
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 1]");
        org.junit.Assert.assertNull(intArray70);
        org.junit.Assert.assertNull(intArray74);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[1, 1]");
        org.junit.Assert.assertNull(intArray82);
        org.junit.Assert.assertNull(intArray85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-10086) + "'", int89 == (-10086));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test297");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        boolean boolean6 = numberHandler2.isDigits("hi!");
        int int9 = numberHandler2.compare((float) (short) 10, (float) (byte) 10);
        boolean boolean11 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test298");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isNumber("");
        int int13 = numberHandler2.compare((float) (byte) 100, (float) 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test299");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray6 = new int[] { 1, 1 };
        int[] intArray9 = sortTools3.reverse(intArray6, 1, (int) (short) 10);
        int[] intArray13 = sortTools1.siftDown(intArray9, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools15 = subject14.new SortTools();
        int[] intArray18 = new int[] { 1, 1 };
        int[] intArray21 = sortTools15.reverse(intArray18, 1, (int) (short) 10);
        int[] intArray24 = sortTools1.swap(intArray18, (int) (byte) 10, (-1));
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        int[] intArray33 = new int[] { 1, 1 };
        int[] intArray36 = sortTools30.reverse(intArray33, 1, (int) (short) 10);
        int[] intArray40 = sortTools28.siftDown(intArray36, (int) (byte) -1, (int) (byte) 100, 0);
        comp5111.assignment.cut.Subject subject41 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools42 = subject41.new SortTools();
        int[] intArray45 = new int[] { 1, 1 };
        int[] intArray48 = sortTools42.reverse(intArray45, 1, (int) (short) 10);
        int[] intArray51 = sortTools28.swap(intArray45, (int) (byte) 10, (-1));
        int int55 = sortTools26.upper(intArray45, (int) (short) -1, (int) (byte) 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject56 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools57 = subject56.new SortTools();
        int[] intArray60 = new int[] { 1, 1 };
        int[] intArray63 = sortTools57.reverse(intArray60, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject64 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools65 = subject64.new SortTools();
        int[] intArray68 = new int[] { 1, 1 };
        int[] intArray71 = sortTools65.reverse(intArray68, 1, (int) (short) 10);
        int[] intArray75 = sortTools57.siftDown(intArray71, (int) ' ', (int) (byte) 0, (int) (byte) 100);
        int[] intArray82 = new int[] { 100, 0, (byte) 100, '#', 1, (byte) 0 };
        int[] intArray85 = sortTools57.reverse(intArray82, (int) (byte) 10, (int) (byte) 1);
        int[] intArray89 = sortTools26.rotate(intArray82, (int) (byte) 10, (int) '#', 0);
        int[] intArray92 = sortTools1.swap(intArray89, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1]");
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-10086) + "'", int55 == (-10086));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[1, 1]");
        org.junit.Assert.assertNull(intArray63);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[1, 1]");
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[100, 0, 100, 35, 1, 0]");
        org.junit.Assert.assertNull(intArray85);
        org.junit.Assert.assertNull(intArray89);
        org.junit.Assert.assertNull(intArray92);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        long long12 = numberHandler2.maximum((long) (short) -1, (long) (short) 1, (long) 1);
        int int15 = numberHandler2.compare((float) (short) 10, (float) (byte) 100);
        int int19 = numberHandler2.maximum((int) (byte) 100, (int) '4', (int) (short) 0);
        boolean boolean21 = numberHandler2.isDigits("hi!");
        int int24 = numberHandler2.compare((float) 1L, 10.0f);
        long long28 = numberHandler2.minimum((long) (byte) 10, (long) (short) 0, 0L);
        long long32 = numberHandler2.maximum((long) 32, (long) 97, 97L);
        int int36 = numberHandler2.maximum((int) '#', (-10086), 32);
        int int40 = numberHandler2.maximum(35, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (byte) 1, 0, (int) (short) 100);
        boolean boolean8 = numberHandler2.isNumber("");
        boolean boolean10 = numberHandler2.isDigits("");
        long long14 = numberHandler2.maximum(100L, (long) (-1), (long) (byte) 0);
        long long18 = numberHandler2.minimum((long) 32, (long) 52, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.remove("hi!");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        int int8 = taskHandler2.getIndex("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990044_RegressionTest0.test303");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        boolean boolean4 = taskHandler2.isIndexed("hi!");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("hi!");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

