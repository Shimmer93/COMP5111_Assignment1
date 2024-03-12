package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Subject_randoop990021_RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test003");
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
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test004");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        java.lang.Class<?> wildcardClass1 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test005");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray12 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray16 = sortTools5.rotate(intArray12, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray27 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray31 = sortTools20.rotate(intArray27, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray35 = sortTools18.rotate(intArray27, 10, 0, 1);
        int[] intArray38 = sortTools5.insertionSort(intArray27, (int) (short) 100, (int) (byte) 1);
        int[] intArray41 = sortTools3.swap(intArray27, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = sortTools1.reverse(intArray41, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNull(intArray41);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test006");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        long long6 = numberHandler2.minimum((long) (short) 1, (long) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test007");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray8 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray12 = sortTools1.rotate(intArray8, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        int[] intArray23 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray27 = sortTools16.rotate(intArray23, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray31 = sortTools14.rotate(intArray23, 10, 0, 1);
        int[] intArray34 = sortTools1.insertionSort(intArray23, (int) (short) 100, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools38 = subject37.new SortTools();
        int[] intArray45 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray49 = sortTools38.rotate(intArray45, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray53 = sortTools36.rotate(intArray45, 10, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = sortTools1.swap(intArray53, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray49);
        org.junit.Assert.assertNull(intArray53);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((-1), 0, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-10086), (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int56 = sortTools1.lower(intArray52, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean59 = sortTools1.checkRange(1, 1);
        comp5111.assignment.cut.Subject subject60 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools61 = subject60.new SortTools();
        int[] intArray68 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray72 = sortTools61.rotate(intArray68, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject73 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools74 = subject73.new SortTools();
        comp5111.assignment.cut.Subject subject75 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools76 = subject75.new SortTools();
        int[] intArray83 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray87 = sortTools76.rotate(intArray83, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray91 = sortTools74.rotate(intArray83, 10, 0, 1);
        int[] intArray94 = sortTools61.insertionSort(intArray83, (int) (short) 100, (int) (byte) 1);
        int[] intArray98 = sortTools1.rotate(intArray83, (int) 'a', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray87);
        org.junit.Assert.assertNull(intArray91);
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertNull(intArray98);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test012");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int56 = sortTools1.lower(intArray52, 10, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass57 = sortTools1.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test013");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        boolean boolean12 = parameterHandler1.hasOneTrue(booleanArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = parameterHandler1.toBooleanObject("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test014");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        java.lang.String str6 = taskHandler2.getKey("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test015");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int56 = sortTools1.lower(intArray52, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean59 = sortTools1.checkRange(1, 1);
        int[] intArray64 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray67 = sortTools1.insertionSort(intArray64, (int) 'a', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        int[] intArray76 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray80 = sortTools69.rotate(intArray76, (int) (byte) 10, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int83 = sortTools1.compare(intArray76, 10, (-10086));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray80);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test016");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools56 = subject55.new SortTools();
        int[] intArray63 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray67 = sortTools56.rotate(intArray63, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray71 = sortTools54.rotate(intArray63, 10, 0, 1);
        int[] intArray74 = sortTools41.insertionSort(intArray63, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray77 = sortTools1.reverse(intArray74, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray74);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        boolean boolean3 = taskHandler1.isMapped("");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((int) '#', 52, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = parameterHandler4.toBooleanObject((int) ' ', 0, (-10086), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test021");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("", true, true);
        java.lang.String str11 = textHandler3.escapeJavaStyleString("", false, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test022");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test023");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        boolean boolean4 = sortTools1.checkRange((int) (short) -1, (-1));
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        int[] intArray18 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray22 = sortTools11.rotate(intArray18, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray26 = sortTools9.rotate(intArray18, 10, 0, 1);
        int[] intArray29 = sortTools7.insertionSort(intArray18, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = sortTools1.compare(intArray29, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNull(intArray29);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test024");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        java.lang.Boolean boolean8 = parameterHandler1.toBooleanObject("");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test025");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test026");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        java.lang.String str5 = taskHandler1.remove("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test027");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray23 = sortTools6.rotate(intArray15, 10, 0, 1);
        int[] intArray26 = sortTools4.insertionSort(intArray15, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = sortTools1.compare(intArray26, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test028");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        boolean boolean5 = sortTools2.checkRange((int) (byte) 1, (int) ' ');
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray16 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray20 = sortTools9.rotate(intArray16, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        int[] intArray31 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray35 = sortTools24.rotate(intArray31, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray39 = sortTools22.rotate(intArray31, 10, 0, 1);
        int[] intArray42 = sortTools9.insertionSort(intArray31, (int) (short) 100, (int) (byte) 1);
        int[] intArray45 = sortTools7.swap(intArray31, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray54 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray58 = sortTools47.rotate(intArray54, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int62 = sortTools7.lower(intArray58, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean65 = sortTools7.checkRange(1, 1);
        int[] intArray70 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray73 = sortTools7.insertionSort(intArray70, (int) 'a', (int) (byte) -1);
        int[] intArray76 = sortTools2.insertionSort(intArray73, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray73);
        org.junit.Assert.assertNull(intArray76);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test029");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        int[] intArray45 = new int[] { (short) 1, (byte) -1, (short) -1, 1, 1 };
        int[] intArray48 = sortTools1.insertionSort(intArray45, (int) (byte) -1, (int) (byte) 0);
        int[] intArray52 = new int[] { (byte) 0, 52, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int55 = sortTools1.compare(intArray52, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, -1, -1, 1, 1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 52, 10]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test030");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        java.lang.String str6 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int18 = sortTools1.upper(intArray14, (int) (short) -1, 10, (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray44 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray48 = sortTools37.rotate(intArray44, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray52 = sortTools35.rotate(intArray44, 10, 0, 1);
        int[] intArray55 = sortTools22.insertionSort(intArray44, (int) (short) 100, (int) (byte) 1);
        int[] intArray58 = sortTools20.swap(intArray44, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject59 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools60 = subject59.new SortTools();
        int[] intArray67 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray71 = sortTools60.rotate(intArray67, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int75 = sortTools20.lower(intArray71, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean78 = sortTools20.checkRange(1, 1);
        int[] intArray83 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray86 = sortTools20.insertionSort(intArray83, (int) 'a', (int) (byte) -1);
        int int90 = sortTools1.lower(intArray86, (int) (short) 10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10086) + "'", int18 == (-10086));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-10086) + "'", int75 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-10086) + "'", int90 == (-10086));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test032");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("hi!");
        java.lang.String str5 = taskHandler1.getKey("");
        java.lang.String str7 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test033");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test034");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int56 = sortTools1.lower(intArray52, 10, (int) (byte) 0, (int) (short) 1);
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools58 = subject57.new SortTools();
        comp5111.assignment.cut.Subject subject59 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools60 = subject59.new SortTools();
        int[] intArray67 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray71 = sortTools60.rotate(intArray67, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray75 = sortTools58.rotate(intArray67, 10, 0, 1);
        int[] intArray80 = new int[] { (-1), (byte) 1, '#', (short) 100 };
        int[] intArray83 = sortTools58.swap(intArray80, 52, 100);
        int int87 = sortTools1.lower(intArray83, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNull(intArray83);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-10086) + "'", int87 == (-10086));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test035");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray44 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray48 = sortTools37.rotate(intArray44, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray52 = sortTools35.rotate(intArray44, 10, 0, 1);
        int[] intArray55 = sortTools22.insertionSort(intArray44, (int) (short) 100, (int) (byte) 1);
        int[] intArray58 = sortTools20.swap(intArray44, (int) (byte) 10, (int) (byte) 1);
        int int62 = sortTools1.lower(intArray44, 0, (int) 'a', (int) (short) -1);
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        int[] intArray71 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray75 = sortTools64.rotate(intArray71, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray79 = sortTools1.rotate(intArray75, 0, (int) (short) 10, 1);
        comp5111.assignment.cut.Subject subject80 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools81 = subject80.new SortTools();
        int[] intArray88 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray92 = sortTools81.rotate(intArray88, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray95 = sortTools1.swap(intArray92, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(intArray79);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray92);
        org.junit.Assert.assertNull(intArray95);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test036");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray32 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray36 = sortTools25.rotate(intArray32, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray40 = sortTools23.rotate(intArray32, 10, 0, 1);
        int[] intArray43 = sortTools21.insertionSort(intArray32, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = sortTools1.compare(intArray32, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test037");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test038");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        java.lang.Boolean boolean53 = parameterHandler1.toBooleanObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean58 = parameterHandler1.toBooleanObject((int) (short) 0, (int) (short) 1, 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean53);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test039");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test040");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        boolean boolean5 = sortTools2.checkRange((int) (byte) 1, (int) ' ');
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray16 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray20 = sortTools9.rotate(intArray16, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        int[] intArray31 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray35 = sortTools24.rotate(intArray31, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray39 = sortTools22.rotate(intArray31, 10, 0, 1);
        int[] intArray42 = sortTools9.insertionSort(intArray31, (int) (short) 100, (int) (byte) 1);
        int[] intArray45 = sortTools7.swap(intArray31, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray54 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray58 = sortTools47.rotate(intArray54, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int62 = sortTools7.lower(intArray58, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean65 = sortTools7.checkRange(1, 1);
        int[] intArray70 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray73 = sortTools7.insertionSort(intArray70, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = sortTools2.compare(intArray73, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray73);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum((long) 'a', (-1L), (long) 52);
        long long11 = numberHandler3.maximum((long) (short) 1, (long) (short) -1, (long) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test042");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int12 = numberHandler2.minimum((int) (byte) 0, (int) (byte) 0, 100);
        java.lang.Number number14 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(number14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test043");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools41.rotate(intArray50, 10, 0, 1);
        int[] intArray61 = sortTools1.reverse(intArray58, 100, 52);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer((int) (byte) 0);
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler7 = subject5.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler8 = subject5.new TextHandler();
        char[] charArray10 = textHandler8.newTextBuffer((-10086));
        char[] charArray14 = new char[] { 'a', '#', 'a' };
        char[] charArray17 = textHandler8.toUpperCase(charArray14, (int) (short) 0, (int) (byte) 100);
        char[] charArray20 = textHandler2.toLowerCase(charArray14, (int) (byte) 0, 10);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject21.new TextHandler();
        char[] charArray26 = textHandler24.newTextBuffer((-10086));
        char[] charArray28 = textHandler24.newTextBuffer((int) (byte) 100);
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler31 = subject29.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler32 = subject29.new TextHandler();
        char[] charArray34 = textHandler32.newTextBuffer((-10086));
        char[] charArray36 = textHandler32.newTextBuffer((int) (byte) 100);
        char[] charArray39 = textHandler24.toUpperCase(charArray36, (-10086), (-10086));
        char[] charArray42 = textHandler2.toLowerCase(charArray36, (int) (byte) 100, 100);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #, a]");
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test045");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        int int10 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10086) + "'", int10 == (-10086));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test046");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject3.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray13 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray17 = sortTools6.rotate(intArray13, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray21 = sortTools4.rotate(intArray13, 10, 0, 1);
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        int[] intArray32 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray36 = sortTools25.rotate(intArray32, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools38 = subject37.new SortTools();
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray47 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray51 = sortTools40.rotate(intArray47, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray55 = sortTools38.rotate(intArray47, 10, 0, 1);
        int[] intArray58 = sortTools25.insertionSort(intArray47, (int) (short) 100, (int) (byte) 1);
        int[] intArray61 = sortTools23.swap(intArray47, (int) (byte) 10, (int) (byte) 1);
        int int65 = sortTools4.lower(intArray47, 0, (int) 'a', (int) (short) -1);
        int[] intArray68 = sortTools2.swap(intArray47, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-10086) + "'", int65 == (-10086));
        org.junit.Assert.assertNull(intArray68);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test047");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test048");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray2 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = parameterHandler1.parse(charArray2, '4');
        java.lang.Boolean boolean9 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = parameterHandler1.parse("", '4');
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test049");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((int) (byte) -1);
        char[] charArray15 = textHandler3.string2char("");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test050");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = parameterHandler1.parse("", ' ');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        boolean boolean4 = sortTools1.checkRange((int) (short) -1, (-1));
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray23 = sortTools6.rotate(intArray15, 10, 0, 1);
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools25 = subject24.new SortTools();
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        int[] intArray34 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray38 = sortTools27.rotate(intArray34, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        comp5111.assignment.cut.Subject subject41 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools42 = subject41.new SortTools();
        int[] intArray49 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray53 = sortTools42.rotate(intArray49, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray57 = sortTools40.rotate(intArray49, 10, 0, 1);
        int[] intArray60 = sortTools27.insertionSort(intArray49, (int) (short) 100, (int) (byte) 1);
        int[] intArray63 = sortTools25.swap(intArray49, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject64 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools65 = subject64.new SortTools();
        int[] intArray72 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray76 = sortTools65.rotate(intArray72, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int80 = sortTools25.lower(intArray76, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean83 = sortTools25.checkRange(1, 1);
        int[] intArray88 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray91 = sortTools25.insertionSort(intArray88, (int) 'a', (int) (byte) -1);
        int[] intArray94 = sortTools6.insertionSort(intArray88, (int) (short) 1, 100);
        int[] intArray98 = sortTools1.rotate(intArray94, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray53);
        org.junit.Assert.assertNull(intArray57);
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray63);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-10086) + "'", int80 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray91);
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertNull(intArray98);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test052");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int12 = numberHandler2.minimum((int) (byte) 0, (int) (byte) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = numberHandler2.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject3.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray13 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray17 = sortTools6.rotate(intArray13, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray21 = sortTools4.rotate(intArray13, 10, 0, 1);
        int[] intArray24 = sortTools2.insertionSort(intArray13, (int) (short) 10, (int) (short) 0);
        boolean boolean27 = sortTools2.checkRange((int) (short) 10, 97);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test054");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray23 = sortTools6.rotate(intArray15, 10, 0, 1);
        int[] intArray26 = sortTools4.insertionSort(intArray15, (int) (short) 10, (int) (short) 0);
        int int30 = sortTools1.upper(intArray15, (int) (short) 10, (-1), (int) (byte) 0);
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools32 = subject31.new SortTools();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        int[] intArray41 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray45 = sortTools34.rotate(intArray41, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        comp5111.assignment.cut.Subject subject48 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools49 = subject48.new SortTools();
        int[] intArray56 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray60 = sortTools49.rotate(intArray56, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray64 = sortTools47.rotate(intArray56, 10, 0, 1);
        int[] intArray67 = sortTools34.insertionSort(intArray56, (int) (short) 100, (int) (byte) 1);
        int[] intArray70 = sortTools32.swap(intArray56, (int) (byte) 10, (int) (byte) 1);
        int[] intArray76 = new int[] { (short) 1, (byte) -1, (short) -1, 1, 1 };
        int[] intArray79 = sortTools32.insertionSort(intArray76, (int) (byte) -1, (int) (byte) 0);
        int[] intArray83 = sortTools1.rotate(intArray76, 52, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10086) + "'", int30 == (-10086));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertNull(intArray70);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, -1, -1, 1, 1]");
        org.junit.Assert.assertNull(intArray79);
        org.junit.Assert.assertNull(intArray83);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test055");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        java.lang.Class<?> wildcardClass15 = taskHandler2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test056");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) 100, (int) ' ');
        boolean boolean9 = numberHandler3.isDigits("");
        int int12 = numberHandler3.compare((double) 0.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test057");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        java.lang.String str18 = textHandler3.unescapeJava("");
        char[] charArray20 = textHandler3.newTextBuffer((int) 'a');
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test058");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("hi!");
        java.lang.String str6 = taskHandler2.getProperty("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test059");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        java.lang.String str14 = taskHandler2.getProperty("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test060");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        int[] intArray23 = new int[] { (-1), (byte) 1, '#', (short) 100 };
        int[] intArray26 = sortTools1.swap(intArray23, 52, 100);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        int[] intArray37 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray41 = sortTools30.rotate(intArray37, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray52 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray56 = sortTools45.rotate(intArray52, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray60 = sortTools43.rotate(intArray52, 10, 0, 1);
        int[] intArray63 = sortTools30.insertionSort(intArray52, (int) (short) 100, (int) (byte) 1);
        int[] intArray66 = sortTools28.swap(intArray52, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        comp5111.assignment.cut.Subject subject69 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools70 = subject69.new SortTools();
        int[] intArray77 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray81 = sortTools70.rotate(intArray77, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray85 = sortTools68.rotate(intArray77, 10, 0, 1);
        int[] intArray88 = sortTools28.reverse(intArray77, 1, (int) (byte) 0);
        int int92 = sortTools1.lower(intArray77, (int) 'a', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNull(intArray63);
        org.junit.Assert.assertNull(intArray66);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray81);
        org.junit.Assert.assertNull(intArray85);
        org.junit.Assert.assertNull(intArray88);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-10086) + "'", int92 == (-10086));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test061");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) -1, (int) (byte) 1);
        boolean boolean9 = numberHandler3.isDigits("");
        long long13 = numberHandler3.minimum((long) 'a', (-10086L), (long) 100);
        java.lang.Number number15 = numberHandler3.parseNumber("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10086L) + "'", long13 == (-10086L));
        org.junit.Assert.assertNull(number15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        boolean boolean7 = taskHandler1.isIndexed("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test063");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        java.lang.String str20 = textHandler3.escapeJavaStyleString("", false, true);
        char[] charArray22 = textHandler3.newTextBuffer((-10086));
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(charArray22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test064");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        int[] intArray23 = new int[] { (-1), (byte) 1, '#', (short) 100 };
        int[] intArray26 = sortTools1.swap(intArray23, 52, 100);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools28 = subject27.new SortTools();
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools32 = subject31.new SortTools();
        int[] intArray39 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray43 = sortTools32.rotate(intArray39, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int47 = sortTools30.upper(intArray43, (int) (short) -1, 10, (int) ' ');
        comp5111.assignment.cut.Subject subject48 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools49 = subject48.new SortTools();
        comp5111.assignment.cut.Subject subject50 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools51 = subject50.new SortTools();
        int[] intArray58 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray62 = sortTools51.rotate(intArray58, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject63 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject63.new SortTools();
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        int[] intArray73 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray77 = sortTools66.rotate(intArray73, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray81 = sortTools64.rotate(intArray73, 10, 0, 1);
        int[] intArray84 = sortTools51.insertionSort(intArray73, (int) (short) 100, (int) (byte) 1);
        int[] intArray87 = sortTools49.swap(intArray73, (int) (byte) 10, (int) (byte) 1);
        int int91 = sortTools30.lower(intArray73, (int) (byte) 1, 1, (int) (byte) 1);
        int int95 = sortTools28.lower(intArray73, 52, 0, 97);
        int[] intArray98 = sortTools1.reverse(intArray73, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-10086) + "'", int47 == (-10086));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertNull(intArray81);
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertNull(intArray87);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-10086) + "'", int95 == (-10086));
        org.junit.Assert.assertNull(intArray98);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test065");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("");
        java.lang.String str5 = taskHandler1.findNext("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test066");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray17 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray21 = sortTools10.rotate(intArray17, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray25 = sortTools8.rotate(intArray17, 10, 0, 1);
        int[] intArray28 = sortTools6.insertionSort(intArray17, (int) (short) 10, (int) (short) 0);
        int int32 = sortTools3.upper(intArray17, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray35 = sortTools1.reverse(intArray17, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        int[] intArray46 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray50 = sortTools39.rotate(intArray46, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        int[] intArray61 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray65 = sortTools54.rotate(intArray61, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray69 = sortTools52.rotate(intArray61, 10, 0, 1);
        int[] intArray72 = sortTools39.insertionSort(intArray61, (int) (short) 100, (int) (byte) 1);
        int[] intArray75 = sortTools37.swap(intArray61, (int) (byte) 10, (int) (byte) 1);
        int[] intArray81 = new int[] { (short) 1, (byte) -1, (short) -1, 1, 1 };
        int[] intArray84 = sortTools37.insertionSort(intArray81, (int) (byte) -1, (int) (byte) 0);
        int[] intArray89 = new int[] { '#', (short) 1, '4', (byte) 1 };
        int[] intArray92 = sortTools37.insertionSort(intArray89, (-10086), 0);
        int[] intArray95 = sortTools1.swap(intArray92, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray50);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNull(intArray69);
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, -1, -1, 1, 1]");
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[35, 1, 52, 1]");
        org.junit.Assert.assertNull(intArray92);
        org.junit.Assert.assertNull(intArray95);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test067");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        int int6 = taskHandler2.getIndex("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test068");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isDigits("");
        int int11 = numberHandler2.compare((float) 97, (float) 'a');
        java.lang.Class<?> wildcardClass12 = numberHandler2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test069");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        boolean boolean14 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        java.lang.Boolean boolean9 = parameterHandler4.toBooleanObject("hi!", "", "", "hi!");
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test071");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        java.lang.Boolean boolean53 = parameterHandler1.toBooleanObject("");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", 'a');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test072");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean56 = parameterHandler1.toBooleanObject((int) (short) 1, (-1), (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test073");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = charArray13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(charArray13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test074");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        int int6 = taskHandler2.getIndex("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        boolean boolean10 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10086) + "'", int6 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test075");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler14 = subject12.new ParameterHandler();
        java.lang.Boolean boolean19 = parameterHandler14.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler23 = subject21.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler24 = subject21.new TextHandler();
        char[] charArray26 = textHandler24.newTextBuffer((-10086));
        char[] charArray30 = new char[] { 'a', '#', 'a' };
        char[] charArray33 = textHandler24.toUpperCase(charArray30, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = parameterHandler14.parse("", charArray30);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = parameterHandler1.parse(charArray30, ' ');
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler38 = subject37.new ParameterHandler();
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler40 = subject39.new ParameterHandler();
        boolean[] booleanArray46 = new boolean[] { false, true, false, false, true };
        boolean boolean47 = parameterHandler40.hasOneTrue(booleanArray46);
        boolean boolean48 = parameterHandler38.hasOneTrue(booleanArray46);
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools50 = subject49.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler51 = subject49.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler52 = subject49.new TextHandler();
        char[] charArray54 = textHandler52.newTextBuffer((-10086));
        char[] charArray56 = textHandler52.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap58 = parameterHandler38.parse(charArray56, ' ');
        java.lang.Boolean boolean63 = parameterHandler38.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler67 = subject65.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler68 = subject65.new TextHandler();
        char[] charArray70 = textHandler68.newTextBuffer((-10086));
        char[] charArray72 = textHandler68.string2char("");
        java.lang.String str74 = textHandler68.unescapeJava("");
        java.lang.String str76 = textHandler68.unescapeJava("");
        comp5111.assignment.cut.Subject subject77 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools78 = subject77.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler79 = subject77.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler80 = subject77.new TextHandler();
        char[] charArray86 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray89 = textHandler80.toUpperCase(charArray86, 100, (-1));
        char[] charArray92 = textHandler68.toUpperCase(charArray86, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap93 = parameterHandler38.parse("hi!", charArray92);
        boolean[] booleanArray95 = new boolean[] { true };
        boolean boolean96 = parameterHandler38.hasOneTrue(booleanArray95);
        boolean boolean97 = parameterHandler1.hasOneTrue(booleanArray95);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + boolean19 + "' != '" + true + "'", boolean19, true);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, a]");
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(charArray54);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + boolean63 + "' != '" + true + "'", boolean63, true);
        org.junit.Assert.assertNull(charArray70);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray89);
        org.junit.Assert.assertNull(charArray92);
        org.junit.Assert.assertNotNull(strMap93);
        org.junit.Assert.assertNotNull(booleanArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray95), "[true]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test076");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        java.lang.String str12 = taskHandler2.findNext("hi!");
        java.lang.String str14 = taskHandler2.remove("");
        java.lang.String str16 = taskHandler2.findNext("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test077");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("hi!");
        java.lang.String str5 = taskHandler1.getKey("");
        int int7 = taskHandler1.getIndex("hi!");
        int int9 = taskHandler1.getIndex("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test078");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler53 = subject52.new ParameterHandler();
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler55 = subject54.new ParameterHandler();
        boolean[] booleanArray61 = new boolean[] { false, true, false, false, true };
        boolean boolean62 = parameterHandler55.hasOneTrue(booleanArray61);
        boolean boolean63 = parameterHandler53.hasOneTrue(booleanArray61);
        comp5111.assignment.cut.Subject subject64 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools65 = subject64.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler66 = subject64.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler67 = subject64.new TextHandler();
        char[] charArray69 = textHandler67.newTextBuffer((-10086));
        char[] charArray71 = textHandler67.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap73 = parameterHandler53.parse(charArray71, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap77 = parameterHandler1.parse(charArray71, (int) (byte) 10, (int) (byte) 0, ' ');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(charArray69);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[]");
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test079");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray21 = new char[] { 'a', '#', 'a' };
        char[] charArray24 = textHandler15.toUpperCase(charArray21, (int) (short) 0, (int) (byte) 100);
        char[] charArray26 = textHandler15.newTextBuffer((int) (short) 1);
        java.lang.String str28 = textHandler15.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject29.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray47 = new char[] { 'a', '#', 'a' };
        char[] charArray50 = textHandler41.toUpperCase(charArray47, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler31.parse("", charArray47);
        char[] charArray54 = textHandler15.toLowerCase(charArray47, 1, (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse(charArray54, '#');
        comp5111.assignment.cut.Subject subject58 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools59 = subject58.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler60 = subject58.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler61 = subject58.new TextHandler();
        char[] charArray63 = textHandler61.newTextBuffer((-10086));
        char[] charArray65 = textHandler61.newTextBuffer((int) (byte) 100);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools67 = subject66.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler69 = subject66.new TextHandler();
        char[] charArray71 = textHandler69.newTextBuffer((-10086));
        char[] charArray73 = textHandler69.newTextBuffer((int) (byte) 100);
        char[] charArray76 = textHandler61.toUpperCase(charArray73, (-10086), (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap77 = parameterHandler1.parse("", charArray73);
        java.lang.Class<?> wildcardClass78 = parameterHandler1.getClass();
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a]");
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, #, a]");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, #, a]");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(charArray63);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray71);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test080");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test081");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int56 = sortTools1.lower(intArray52, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean59 = sortTools1.checkRange(1, 1);
        comp5111.assignment.cut.Subject subject60 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools61 = subject60.new SortTools();
        comp5111.assignment.cut.Subject subject62 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools63 = subject62.new SortTools();
        int[] intArray70 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray74 = sortTools63.rotate(intArray70, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray78 = sortTools61.rotate(intArray70, 10, 0, 1);
        int int82 = sortTools1.lower(intArray70, (int) (short) 100, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-10086) + "'", int56 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray74);
        org.junit.Assert.assertNull(intArray78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-10086) + "'", int82 == (-10086));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        char[] charArray9 = textHandler3.newTextBuffer((int) (byte) 1);
        char[] charArray11 = textHandler3.newTextBuffer(1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test083");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) -1, (int) (byte) 1);
        boolean boolean9 = numberHandler3.isDigits("");
        long long13 = numberHandler3.maximum((long) (-1), (long) 97, (long) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test084");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        boolean boolean12 = taskHandler2.isIndexed("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test085");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        boolean boolean8 = taskHandler2.isIndexed("");
        java.lang.String str10 = taskHandler2.getKey("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test086");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test087");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test088");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = parameterHandler4.toBooleanObject((int) '4', (int) (byte) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test089");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray17 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray21 = sortTools10.rotate(intArray17, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray25 = sortTools8.rotate(intArray17, 10, 0, 1);
        int[] intArray28 = sortTools6.insertionSort(intArray17, (int) (short) 10, (int) (short) 0);
        int int32 = sortTools3.upper(intArray17, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray35 = sortTools1.reverse(intArray17, 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass36 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test090");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("");
        char[] charArray7 = textHandler3.newTextBuffer(0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test091");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        boolean boolean12 = parameterHandler1.hasOneTrue(booleanArray11);
        java.lang.Boolean boolean14 = parameterHandler1.toBooleanObject("");
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test092");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        boolean boolean12 = parameterHandler1.hasOneTrue(booleanArray11);
        java.lang.Boolean boolean17 = parameterHandler1.toBooleanObject((int) (short) 10, (int) ' ', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test093");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray14 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray18 = sortTools7.rotate(intArray14, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray40 = sortTools7.insertionSort(intArray29, (int) (short) 100, (int) (byte) 1);
        int[] intArray43 = sortTools5.swap(intArray29, (int) (byte) 10, (int) (byte) 1);
        int[] intArray47 = new int[] { (short) 0, (-10086), (short) 1 };
        int[] intArray51 = sortTools5.doRotate(intArray47, 0, (int) '#', (int) (byte) -1);
        int[] intArray54 = sortTools3.reverse(intArray47, (int) (short) -1, 52);
        int[] intArray61 = new int[] { (byte) -1, (short) 1, (byte) 1, ' ', (-10086), 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int64 = sortTools3.compare(intArray61, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, -10086, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 1, 1, 32, -10086, 0]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test094");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        long long12 = numberHandler2.maximum((long) 'a', (long) 0, 1L);
        long long16 = numberHandler2.maximum((long) 10, (long) 0, (long) (byte) 100);
        long long20 = numberHandler2.minimum(100L, (-10086L), 52L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-10086L) + "'", long20 == (-10086L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test095");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        int int8 = taskHandler2.getIndex("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test096");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        char[] charArray9 = textHandler3.newTextBuffer((int) (byte) 1);
        java.lang.String str11 = textHandler3.unescapeJava("hi!");
        java.lang.Class<?> wildcardClass12 = textHandler3.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test097");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray14 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray18 = sortTools7.rotate(intArray14, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray40 = sortTools7.insertionSort(intArray29, (int) (short) 100, (int) (byte) 1);
        int[] intArray43 = sortTools5.swap(intArray29, (int) (byte) 10, (int) (byte) 1);
        int[] intArray47 = new int[] { (short) 0, (-10086), (short) 1 };
        int[] intArray51 = sortTools5.doRotate(intArray47, 0, (int) '#', (int) (byte) -1);
        int[] intArray54 = sortTools3.insertionSort(intArray51, 0, 52);
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools56 = subject55.new SortTools();
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools58 = subject57.new SortTools();
        int[] intArray65 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray69 = sortTools58.rotate(intArray65, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject70 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools71 = subject70.new SortTools();
        comp5111.assignment.cut.Subject subject72 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools73 = subject72.new SortTools();
        int[] intArray80 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray84 = sortTools73.rotate(intArray80, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray88 = sortTools71.rotate(intArray80, 10, 0, 1);
        int[] intArray91 = sortTools58.insertionSort(intArray80, (int) (short) 100, (int) (byte) 1);
        int[] intArray94 = sortTools56.swap(intArray80, (int) (byte) 10, (int) (byte) 1);
        int int98 = sortTools3.lower(intArray94, (int) (short) 0, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, -10086, 1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray69);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertNull(intArray88);
        org.junit.Assert.assertNull(intArray91);
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-10086) + "'", int98 == (-10086));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test098");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject((int) (byte) 100, (int) ' ', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.getProperty("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test100");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        java.lang.String str18 = textHandler3.unescapeJava("");
        char[] charArray20 = textHandler3.newTextBuffer((int) (short) -1);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(charArray20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test101");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler3 = subject0.new TaskHandler();
        java.lang.String str5 = taskHandler3.findNext("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test102");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str5 = textHandler3.unescapeJava("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        int[] intArray43 = new int[] { (short) 0, (-10086), (short) 1 };
        int[] intArray47 = sortTools1.doRotate(intArray43, 0, (int) '#', (int) (byte) -1);
        boolean boolean50 = sortTools1.checkRange(0, (int) (byte) 100);
        int[] intArray51 = null;
        int[] intArray55 = sortTools1.siftDown(intArray51, (int) ' ', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, -10086, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(intArray55);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test104");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler4 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler7 = subject5.new TextHandler();
        char[] charArray9 = textHandler7.newTextBuffer((int) (byte) 0);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler12 = subject10.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler13 = subject10.new TextHandler();
        char[] charArray15 = textHandler13.newTextBuffer((-10086));
        char[] charArray19 = new char[] { 'a', '#', 'a' };
        char[] charArray22 = textHandler13.toUpperCase(charArray19, (int) (short) 0, (int) (byte) 100);
        char[] charArray25 = textHandler7.toLowerCase(charArray19, (int) (byte) 0, 10);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler27 = subject26.new ParameterHandler();
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler29 = subject28.new ParameterHandler();
        boolean[] booleanArray35 = new boolean[] { false, true, false, false, true };
        boolean boolean36 = parameterHandler29.hasOneTrue(booleanArray35);
        boolean boolean37 = parameterHandler27.hasOneTrue(booleanArray35);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray45 = textHandler41.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = parameterHandler27.parse(charArray45, ' ');
        char[] charArray50 = textHandler7.toUpperCase(charArray45, (int) (byte) -1, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = parameterHandler4.parse(charArray50, '#');
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, #, a]");
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.hasNested("");
        int int12 = taskHandler2.getIndex("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test106");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        boolean boolean10 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject17.new ParameterHandler();
        java.lang.Boolean boolean24 = parameterHandler19.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler28 = subject26.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler29 = subject26.new TextHandler();
        char[] charArray31 = textHandler29.newTextBuffer((-10086));
        char[] charArray35 = new char[] { 'a', '#', 'a' };
        char[] charArray38 = textHandler29.toUpperCase(charArray35, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = parameterHandler19.parse("", charArray35);
        char[] charArray42 = textHandler3.toLowerCase(charArray35, 1, (int) (short) 0);
        java.lang.String str46 = textHandler3.escapeJavaStyleString("hi!", true, false);
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools48 = subject47.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools49 = subject47.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler50 = subject47.new TextHandler();
        char[] charArray52 = textHandler50.string2char("");
        char[] charArray55 = textHandler3.toLowerCase(charArray52, 1, (int) (byte) 10);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + boolean24 + "' != '" + true + "'", boolean24, true);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, #, a]");
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, #, a]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertNull(charArray55);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test108");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (short) -1, 0, (int) (byte) 0);
        int int10 = numberHandler2.maximum(100, (int) '#', (-1));
        long long14 = numberHandler2.maximum((long) (short) 0, (long) 1, (-1L));
        boolean boolean16 = numberHandler2.isDigits("hi!");
        java.lang.Number number18 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(number18);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test109");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        char[] charArray11 = textHandler3.newTextBuffer(0);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        char[] charArray22 = textHandler3.toUpperCase(charArray19, 97, (-1));
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNull(charArray22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test110");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray14 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray18 = sortTools7.rotate(intArray14, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray40 = sortTools7.insertionSort(intArray29, (int) (short) 100, (int) (byte) 1);
        int[] intArray43 = sortTools5.swap(intArray29, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        comp5111.assignment.cut.Subject subject46 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools47 = subject46.new SortTools();
        int[] intArray54 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray58 = sortTools47.rotate(intArray54, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray62 = sortTools45.rotate(intArray54, 10, 0, 1);
        int[] intArray65 = sortTools5.reverse(intArray54, 1, (int) (byte) 0);
        int[] intArray69 = sortTools3.doRotate(intArray54, (int) 'a', (-1), (-10086));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray43);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNull(intArray69);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test111");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int18 = sortTools1.upper(intArray14, (int) (short) -1, 10, (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools56 = subject55.new SortTools();
        int[] intArray63 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray67 = sortTools56.rotate(intArray63, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray71 = sortTools54.rotate(intArray63, 10, 0, 1);
        int[] intArray74 = sortTools41.insertionSort(intArray63, (int) (short) 100, (int) (byte) 1);
        int[] intArray77 = sortTools39.swap(intArray63, (int) (byte) 10, (int) (byte) 1);
        int int81 = sortTools20.lower(intArray63, 0, (int) 'a', (int) (short) -1);
        int[] intArray88 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray91 = sortTools20.reverse(intArray88, (int) (byte) 0, 1);
        int[] intArray94 = sortTools1.reverse(intArray91, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass95 = intArray91.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10086) + "'", int18 == (-10086));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray74);
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-10086) + "'", int81 == (-10086));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray12 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray16 = sortTools5.rotate(intArray12, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray27 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray31 = sortTools20.rotate(intArray27, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray35 = sortTools18.rotate(intArray27, 10, 0, 1);
        int[] intArray38 = sortTools5.insertionSort(intArray27, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = sortTools3.doRotate(intArray38, (int) (byte) 1, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray38);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test113");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        java.lang.Class<?> wildcardClass5 = sortTools4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test114");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test115");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler55 = subject53.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray62 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray65 = textHandler56.toUpperCase(charArray62, 100, (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap66 = parameterHandler1.parse("", charArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray65);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test116");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean23 = parameterHandler1.toBooleanObject("hi!");
        java.lang.Boolean boolean28 = parameterHandler1.toBooleanObject("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(boolean28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test117");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        java.lang.String str20 = textHandler3.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test118");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject((-1), (int) ' ', (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject((int) (byte) 1, (-10086), (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        java.lang.String str14 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test120");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        char[] charArray18 = textHandler3.newTextBuffer((int) (byte) 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNull(charArray18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        boolean boolean7 = sortTools4.checkRange((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test122");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        boolean boolean12 = taskHandler2.hasNested("");
        java.lang.String str14 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray12 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray16 = sortTools5.rotate(intArray12, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools31 = subject30.new SortTools();
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        int[] intArray40 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray44 = sortTools33.rotate(intArray40, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray48 = sortTools31.rotate(intArray40, 10, 0, 1);
        int[] intArray51 = sortTools18.insertionSort(intArray40, (int) (short) 100, (int) (byte) 1);
        int[] intArray54 = sortTools5.insertionSort(intArray40, (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = sortTools3.swap(intArray54, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNull(intArray54);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test125");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) 100, (int) ' ');
        java.lang.Number number9 = numberHandler3.parseNumber("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(number9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test126");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray17 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray21 = sortTools10.rotate(intArray17, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray25 = sortTools8.rotate(intArray17, 10, 0, 1);
        int[] intArray28 = sortTools6.insertionSort(intArray17, (int) (short) 10, (int) (short) 0);
        int int32 = sortTools3.upper(intArray17, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray35 = sortTools1.reverse(intArray17, 1, (int) (short) 10);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        int[] intArray46 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray50 = sortTools39.rotate(intArray46, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        int[] intArray61 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray65 = sortTools54.rotate(intArray61, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray69 = sortTools52.rotate(intArray61, 10, 0, 1);
        int[] intArray72 = sortTools39.insertionSort(intArray61, (int) (short) 100, (int) (byte) 1);
        int[] intArray75 = sortTools37.swap(intArray61, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray79 = sortTools1.doRotate(intArray75, 0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray50);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNull(intArray69);
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray75);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test127");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isDigits("");
        int int11 = numberHandler2.compare((float) 97, (float) 'a');
        int int14 = numberHandler2.compare((double) 52, (double) 97L);
        java.lang.Number number16 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test128");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isDigits("");
        int int7 = numberHandler2.compare((double) (-1.0f), (-1.0d));
        long long11 = numberHandler2.minimum(0L, 52L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test129");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        char[] charArray18 = textHandler3.string2char("");
        java.lang.String str20 = textHandler3.unescapeJava("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test130");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int12 = numberHandler2.minimum((int) (byte) 0, (int) (byte) 0, 100);
        boolean boolean14 = numberHandler2.isDigits("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test131");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray44 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray48 = sortTools37.rotate(intArray44, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray52 = sortTools35.rotate(intArray44, 10, 0, 1);
        int[] intArray55 = sortTools22.insertionSort(intArray44, (int) (short) 100, (int) (byte) 1);
        int[] intArray58 = sortTools20.swap(intArray44, (int) (byte) 10, (int) (byte) 1);
        int int62 = sortTools1.lower(intArray44, 0, (int) 'a', (int) (short) -1);
        int[] intArray69 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray72 = sortTools1.reverse(intArray69, (int) (byte) 0, 1);
        boolean boolean75 = sortTools1.checkRange((-10086), (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        java.lang.String str14 = taskHandler2.getKey("");
        boolean boolean16 = taskHandler2.hasNested("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test133");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        java.lang.Class<?> wildcardClass7 = taskHandler2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test134");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        char[] charArray4 = textHandler2.newTextBuffer((int) (byte) 0);
        java.lang.String str8 = textHandler2.escapeJavaStyleString("", false, false);
        char[] charArray10 = textHandler2.newTextBuffer(52);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray8 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray12 = sortTools1.rotate(intArray8, (int) (byte) 10, (int) (byte) 1, (int) '4');
        boolean boolean15 = sortTools1.checkRange(97, (int) '#');
        boolean boolean18 = sortTools1.checkRange((int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test136");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        int[] intArray12 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray16 = sortTools5.rotate(intArray12, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        int[] intArray27 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray31 = sortTools20.rotate(intArray27, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray35 = sortTools18.rotate(intArray27, 10, 0, 1);
        int[] intArray38 = sortTools5.insertionSort(intArray27, (int) (short) 100, (int) (byte) 1);
        int[] intArray41 = sortTools3.swap(intArray27, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int58 = sortTools3.lower(intArray54, 10, (int) (byte) 0, (int) (short) 1);
        boolean boolean61 = sortTools3.checkRange(1, 1);
        int[] intArray66 = new int[] { '#', (short) 1, (byte) 100, (short) 10 };
        int[] intArray69 = sortTools3.insertionSort(intArray66, (int) 'a', (int) (byte) -1);
        int int73 = sortTools1.upper(intArray69, (int) (byte) 100, (int) '#', 32);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-10086) + "'", int58 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, 1, 100, 10]");
        org.junit.Assert.assertNull(intArray69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-10086) + "'", int73 == (-10086));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools41.rotate(intArray50, 10, 0, 1);
        int[] intArray61 = sortTools1.reverse(intArray50, 1, (int) (byte) 0);
        comp5111.assignment.cut.Subject subject62 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools63 = subject62.new SortTools();
        int[] intArray70 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray74 = sortTools63.rotate(intArray70, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject75 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools76 = subject75.new SortTools();
        comp5111.assignment.cut.Subject subject77 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools78 = subject77.new SortTools();
        int[] intArray85 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray89 = sortTools78.rotate(intArray85, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray93 = sortTools76.rotate(intArray85, 10, 0, 1);
        int[] intArray96 = sortTools63.insertionSort(intArray85, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = sortTools1.compare(intArray96, (int) (short) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray74);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray89);
        org.junit.Assert.assertNull(intArray93);
        org.junit.Assert.assertNull(intArray96);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray44 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray48 = sortTools37.rotate(intArray44, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray52 = sortTools35.rotate(intArray44, 10, 0, 1);
        int[] intArray55 = sortTools22.insertionSort(intArray44, (int) (short) 100, (int) (byte) 1);
        int[] intArray58 = sortTools20.swap(intArray44, (int) (byte) 10, (int) (byte) 1);
        int int62 = sortTools1.lower(intArray44, 0, (int) 'a', (int) (short) -1);
        int[] intArray69 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray72 = sortTools1.reverse(intArray69, (int) (byte) 0, 1);
        comp5111.assignment.cut.Subject subject73 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools74 = subject73.new SortTools();
        int[] intArray81 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray85 = sortTools74.rotate(intArray81, (int) (byte) 10, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int88 = sortTools1.compare(intArray81, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Wrong index.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-10086) + "'", int62 == (-10086));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray85);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test139");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        java.lang.String str14 = taskHandler2.getKey("");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test140");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        char[] charArray18 = textHandler3.string2char("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[h, i, !]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test141");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "hi!", "", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject("", "", "", "hi!");
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        char[] charArray21 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = parameterHandler1.parse(charArray21, '4');
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test142");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str5 = textHandler3.unescapeJava("");
        char[] charArray7 = textHandler3.newTextBuffer((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test143");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        long long10 = numberHandler2.maximum((long) (byte) 100, (long) (byte) 0, (long) (byte) 100);
        int int13 = numberHandler2.compare((float) (byte) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test144");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        boolean boolean7 = sortTools4.checkRange((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        boolean boolean6 = numberHandler4.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) 100, (int) ' ');
        boolean boolean9 = numberHandler3.isDigits("");
        java.lang.Class<?> wildcardClass10 = numberHandler3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isDigits("");
        int int12 = numberHandler2.minimum((int) (byte) 1, (int) (short) -1, (-10086));
        int int16 = numberHandler2.maximum((int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
        int int19 = numberHandler2.compare((double) 100.0f, 0.0d);
        int int23 = numberHandler2.maximum((-1), (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test148");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler55 = subject53.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray62 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray65 = textHandler56.toUpperCase(charArray62, 100, (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap66 = parameterHandler1.parse("", charArray62);
        java.lang.Boolean boolean68 = parameterHandler1.toBooleanObject("hi!");
        java.lang.Boolean boolean73 = parameterHandler1.toBooleanObject("", "", "hi!", "");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertEquals("'" + boolean73 + "' != '" + true + "'", boolean73, true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test149");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test150");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        boolean boolean6 = taskHandler4.isMapped("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int18 = sortTools1.upper(intArray14, (int) (short) -1, 10, (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools37 = subject36.new SortTools();
        int[] intArray44 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray48 = sortTools37.rotate(intArray44, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray52 = sortTools35.rotate(intArray44, 10, 0, 1);
        int[] intArray55 = sortTools22.insertionSort(intArray44, (int) (short) 100, (int) (byte) 1);
        int[] intArray58 = sortTools20.swap(intArray44, (int) (byte) 10, (int) (byte) 1);
        int int62 = sortTools1.lower(intArray44, (int) (byte) 1, 1, (int) (byte) 1);
        boolean boolean65 = sortTools1.checkRange(0, 0);
        boolean boolean68 = sortTools1.checkRange(35, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10086) + "'", int18 == (-10086));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray55);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test152");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        boolean boolean12 = parameterHandler1.hasOneTrue(booleanArray11);
        char[] charArray13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = parameterHandler1.parse(charArray13, (int) (byte) 0, (int) (short) -1, '#');
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        java.lang.String str8 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test154");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str5 = textHandler3.unescapeJava("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        char[] charArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textHandler3.toUpperCase(charArray8, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test155");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray41 = sortTools1.siftDown(intArray37, (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools46 = subject44.new SortTools();
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools48 = subject47.new SortTools();
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools50 = subject49.new SortTools();
        int[] intArray57 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray61 = sortTools50.rotate(intArray57, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray65 = sortTools48.rotate(intArray57, 10, 0, 1);
        int[] intArray68 = sortTools46.insertionSort(intArray57, (int) (short) 10, (int) (short) 0);
        int int72 = sortTools43.upper(intArray57, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray75 = sortTools1.reverse(intArray57, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNull(intArray68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-10086) + "'", int72 == (-10086));
        org.junit.Assert.assertNull(intArray75);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test156");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        java.lang.Class<?> wildcardClass5 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test157");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test158");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        java.lang.Number number4 = numberHandler2.parseNumber("");
        int int7 = numberHandler2.compare(0.0f, (float) 10L);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test159");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray21 = new char[] { 'a', '#', 'a' };
        char[] charArray24 = textHandler15.toUpperCase(charArray21, (int) (short) 0, (int) (byte) 100);
        char[] charArray26 = textHandler15.newTextBuffer((int) (short) 1);
        java.lang.String str28 = textHandler15.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject29.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray47 = new char[] { 'a', '#', 'a' };
        char[] charArray50 = textHandler41.toUpperCase(charArray47, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler31.parse("", charArray47);
        char[] charArray54 = textHandler15.toLowerCase(charArray47, 1, (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse(charArray54, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap59 = parameterHandler1.parse("hi!", ' ');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a]");
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, #, a]");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, #, a]");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler20 = subject17.new TextHandler();
        java.lang.String str24 = textHandler20.escapeJavaStyleString("", true, true);
        char[] charArray26 = textHandler20.string2char("");
        char[] charArray29 = textHandler3.toUpperCase(charArray26, 0, 1);
        char[] charArray31 = textHandler3.string2char("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[h, i, !]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test161");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray21 = new char[] { 'a', '#', 'a' };
        char[] charArray24 = textHandler15.toUpperCase(charArray21, (int) (short) 0, (int) (byte) 100);
        char[] charArray26 = textHandler15.newTextBuffer((int) (short) 1);
        java.lang.String str28 = textHandler15.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject29.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray47 = new char[] { 'a', '#', 'a' };
        char[] charArray50 = textHandler41.toUpperCase(charArray47, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler31.parse("", charArray47);
        char[] charArray54 = textHandler15.toLowerCase(charArray47, 1, (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse(charArray54, '#');
        java.util.Map<java.lang.String, java.lang.String> strMap59 = parameterHandler1.parse("", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a]");
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, #, a]");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, #, a]");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test162");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        int int6 = taskHandler2.getIndex("hi!");
        int int8 = taskHandler2.getIndex("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10086) + "'", int6 == (-10086));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test163");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        int int16 = taskHandler2.getIndex("");
        boolean boolean18 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test164");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        int int6 = taskHandler2.getIndex("hi!");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10086) + "'", int6 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test165");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) -1, (int) (byte) 1);
        boolean boolean9 = numberHandler3.isDigits("");
        long long13 = numberHandler3.minimum((long) 'a', (-10086L), (long) 100);
        int int17 = numberHandler3.maximum(97, (-1), 10);
        java.lang.Number number19 = numberHandler3.parseNumber("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10086L) + "'", long13 == (-10086L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(number19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        boolean boolean18 = taskHandler2.isMapped("");
        boolean boolean20 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test167");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "hi!", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject((java.lang.Integer) (-10086), (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test168");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        boolean boolean14 = taskHandler2.isMapped("");
        int int16 = taskHandler2.getIndex("");
        java.lang.String str18 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test169");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) -1, (int) (byte) 1);
        boolean boolean9 = numberHandler3.isDigits("");
        long long13 = numberHandler3.minimum((long) 'a', (-10086L), (long) 100);
        int int17 = numberHandler3.maximum(97, (-1), 10);
        long long21 = numberHandler3.maximum(97L, (long) (short) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10086L) + "'", long13 == (-10086L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test170");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((int) (short) -1);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(charArray13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TextHandler textHandler1 = subject0.new TextHandler();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test172");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        int[] intArray43 = new int[] { (short) 0, (-10086), (short) 1 };
        int[] intArray47 = sortTools1.doRotate(intArray43, 0, (int) '#', (int) (byte) -1);
        boolean boolean50 = sortTools1.checkRange(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, -10086, 1]");
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        boolean boolean8 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int11 = numberHandler2.compare((double) (-10086L), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        boolean boolean6 = sortTools3.checkRange((int) ' ', (int) '4');
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        boolean boolean22 = sortTools8.checkRange(97, (int) '#');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        int[] intArray33 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray37 = sortTools26.rotate(intArray33, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray41 = sortTools24.rotate(intArray33, 10, 0, 1);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray52 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray56 = sortTools45.rotate(intArray52, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools58 = subject57.new SortTools();
        comp5111.assignment.cut.Subject subject59 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools60 = subject59.new SortTools();
        int[] intArray67 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray71 = sortTools60.rotate(intArray67, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray75 = sortTools58.rotate(intArray67, 10, 0, 1);
        int[] intArray78 = sortTools45.insertionSort(intArray67, (int) (short) 100, (int) (byte) 1);
        int[] intArray81 = sortTools43.swap(intArray67, (int) (byte) 10, (int) (byte) 1);
        int int85 = sortTools24.lower(intArray67, 0, (int) 'a', (int) (short) -1);
        int int89 = sortTools8.lower(intArray67, 0, 97, (int) '4');
        int[] intArray92 = sortTools3.insertionSort(intArray67, (int) ' ', 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray75);
        org.junit.Assert.assertNull(intArray78);
        org.junit.Assert.assertNull(intArray81);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-10086) + "'", int85 == (-10086));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-10086) + "'", int89 == (-10086));
        org.junit.Assert.assertNull(intArray92);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test176");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("", true, true);
        java.lang.String str11 = textHandler3.escapeJavaStyleString("hi!", true, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test178");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray23 = sortTools6.rotate(intArray15, 10, 0, 1);
        int[] intArray26 = sortTools4.insertionSort(intArray15, (int) (short) 10, (int) (short) 0);
        int int30 = sortTools1.upper(intArray15, (int) (short) 10, (-1), (int) (byte) 0);
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools32 = subject31.new SortTools();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools34 = subject33.new SortTools();
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools38 = subject37.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject37.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools41.rotate(intArray50, 10, 0, 1);
        int[] intArray61 = sortTools39.insertionSort(intArray50, (int) (short) 10, (int) (short) 0);
        int int65 = sortTools36.upper(intArray50, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray68 = sortTools34.reverse(intArray50, 1, (int) (short) 10);
        int[] intArray72 = sortTools32.siftDown(intArray50, 97, (int) (short) -1, (int) (byte) 0);
        int[] intArray76 = sortTools1.siftDown(intArray72, (int) (byte) 10, 32, (int) '#');
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10086) + "'", int30 == (-10086));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-10086) + "'", int65 == (-10086));
        org.junit.Assert.assertNull(intArray68);
        org.junit.Assert.assertNull(intArray72);
        org.junit.Assert.assertNull(intArray76);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test179");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        java.lang.String str14 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test180");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test181");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("hi!");
        char[] charArray11 = textHandler3.newTextBuffer((int) (short) 10);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test182");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (short) -1, 0, (int) (byte) 0);
        int int10 = numberHandler2.maximum(100, (int) '#', (-1));
        java.lang.Number number12 = numberHandler2.parseNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(number12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test183");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum(0, 0, 52);
        int int9 = numberHandler2.compare((double) (-1), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test184");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        int int8 = taskHandler2.getIndex("");
        java.lang.String str10 = taskHandler2.remove("");
        java.lang.String str12 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test185");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (short) -1, 0, (int) (byte) 0);
        int int10 = numberHandler2.maximum(100, (int) '#', (-1));
        long long14 = numberHandler2.maximum((long) (short) 0, (long) 1, (-1L));
        int int17 = numberHandler2.compare((double) (byte) 1, (double) (-1));
        long long21 = numberHandler2.minimum((long) (byte) -1, (long) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test186");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int int18 = sortTools1.upper(intArray14, (int) (short) -1, 10, (int) ' ');
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools56 = subject55.new SortTools();
        int[] intArray63 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray67 = sortTools56.rotate(intArray63, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray71 = sortTools54.rotate(intArray63, 10, 0, 1);
        int[] intArray74 = sortTools41.insertionSort(intArray63, (int) (short) 100, (int) (byte) 1);
        int[] intArray77 = sortTools39.swap(intArray63, (int) (byte) 10, (int) (byte) 1);
        int int81 = sortTools20.lower(intArray63, 0, (int) 'a', (int) (short) -1);
        int[] intArray88 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray91 = sortTools20.reverse(intArray88, (int) (byte) 0, 1);
        int[] intArray94 = sortTools1.reverse(intArray91, (int) (short) 100, (int) ' ');
        boolean boolean97 = sortTools1.checkRange(97, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10086) + "'", int18 == (-10086));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray67);
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNull(intArray74);
        org.junit.Assert.assertNull(intArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-10086) + "'", int81 == (-10086));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNull(intArray94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test187");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        int int16 = taskHandler2.getIndex("");
        java.lang.String str18 = taskHandler2.getProperty("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test188");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools41.rotate(intArray50, 10, 0, 1);
        int[] intArray61 = sortTools1.reverse(intArray50, 1, (int) (byte) 0);
        comp5111.assignment.cut.Subject subject62 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools63 = subject62.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools64 = subject62.new SortTools();
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools66 = subject65.new SortTools();
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        int[] intArray75 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray79 = sortTools68.rotate(intArray75, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray83 = sortTools66.rotate(intArray75, 10, 0, 1);
        int[] intArray86 = sortTools64.insertionSort(intArray75, (int) (short) 10, (int) (short) 0);
        int[] intArray90 = sortTools1.rotate(intArray86, 1, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray79);
        org.junit.Assert.assertNull(intArray83);
        org.junit.Assert.assertNull(intArray86);
        org.junit.Assert.assertNull(intArray90);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test189");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isDigits("");
        int int7 = numberHandler2.compare((float) 52, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test190");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        boolean boolean5 = sortTools2.checkRange((int) (byte) 1, (int) ' ');
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        int[] intArray16 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray20 = sortTools9.rotate(intArray16, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        int[] intArray31 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray35 = sortTools24.rotate(intArray31, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray39 = sortTools22.rotate(intArray31, 10, 0, 1);
        int[] intArray42 = sortTools9.insertionSort(intArray31, (int) (short) 100, (int) (byte) 1);
        int[] intArray45 = sortTools7.swap(intArray31, (int) (byte) 10, (int) (byte) 1);
        int[] intArray48 = sortTools2.insertionSort(intArray31, (-10086), 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray35);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNull(intArray48);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test191");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler4 = subject0.new TaskHandler();
        java.lang.String str6 = taskHandler4.getKey("");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test192");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools10 = subject9.new SortTools();
        int[] intArray17 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray21 = sortTools10.rotate(intArray17, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray25 = sortTools8.rotate(intArray17, 10, 0, 1);
        int[] intArray28 = sortTools6.insertionSort(intArray17, (int) (short) 10, (int) (short) 0);
        int int32 = sortTools3.upper(intArray17, (int) (short) 10, (-1), (int) (byte) 0);
        int[] intArray35 = sortTools1.reverse(intArray17, 1, (int) (short) 10);
        int[] intArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = sortTools1.doRotate(intArray36, (int) (byte) 1, 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-10086) + "'", int32 == (-10086));
        org.junit.Assert.assertNull(intArray35);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test193");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray8 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray12 = sortTools1.rotate(intArray8, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        int[] intArray23 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray27 = sortTools16.rotate(intArray23, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray31 = sortTools14.rotate(intArray23, 10, 0, 1);
        comp5111.assignment.cut.Subject subject32 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools33 = subject32.new SortTools();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools35 = subject34.new SortTools();
        int[] intArray42 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray46 = sortTools35.rotate(intArray42, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject47 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools48 = subject47.new SortTools();
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools50 = subject49.new SortTools();
        int[] intArray57 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray61 = sortTools50.rotate(intArray57, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray65 = sortTools48.rotate(intArray57, 10, 0, 1);
        int[] intArray68 = sortTools35.insertionSort(intArray57, (int) (short) 100, (int) (byte) 1);
        int[] intArray71 = sortTools33.swap(intArray57, (int) (byte) 10, (int) (byte) 1);
        int int75 = sortTools14.lower(intArray57, 0, (int) 'a', (int) (short) -1);
        int[] intArray82 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray85 = sortTools14.reverse(intArray82, (int) (byte) 0, 1);
        int[] intArray88 = sortTools1.swap(intArray82, 0, (int) (short) 100);
        boolean boolean91 = sortTools1.checkRange((int) (byte) 1, 97);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNull(intArray31);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray46);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNull(intArray68);
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-10086) + "'", int75 == (-10086));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNull(intArray88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test194");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        boolean boolean8 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test195");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        boolean boolean12 = taskHandler2.hasNested("");
        java.lang.String str14 = taskHandler2.remove("");
        java.lang.String str16 = taskHandler2.getProperty("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test196");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        int int5 = taskHandler1.getIndex("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10086) + "'", int5 == (-10086));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test197");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.remove("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test198");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        boolean boolean18 = taskHandler2.isMapped("");
        java.lang.String str20 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test199");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.hasNested("");
        java.lang.String str14 = taskHandler2.remove("");
        java.lang.String str16 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test200");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        boolean boolean6 = taskHandler2.isMapped("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test201");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools8 = subject7.new SortTools();
        int[] intArray15 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray19 = sortTools8.rotate(intArray15, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools23 = subject22.new SortTools();
        int[] intArray30 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray34 = sortTools23.rotate(intArray30, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray38 = sortTools21.rotate(intArray30, 10, 0, 1);
        int[] intArray41 = sortTools8.insertionSort(intArray30, (int) (short) 100, (int) (byte) 1);
        int[] intArray44 = sortTools6.swap(intArray30, (int) (byte) 10, (int) (byte) 1);
        int[] intArray47 = sortTools4.insertionSort(intArray30, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray34);
        org.junit.Assert.assertNull(intArray38);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNull(intArray47);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getProperty("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test203");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int12 = numberHandler2.maximum((int) (short) 0, 97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test204");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("", true, true);
        char[] charArray9 = textHandler3.string2char("");
        java.lang.String str13 = textHandler3.escapeJavaStyleString("", true, false);
        java.lang.String str17 = textHandler3.escapeJavaStyleString("", true, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test205");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        char[] charArray9 = textHandler3.newTextBuffer((int) '4');
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test206");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isDigits("");
        int int7 = numberHandler2.compare((double) (-1.0f), (-1.0d));
        int int10 = numberHandler2.compare((float) (byte) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test207");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools5 = subject4.new SortTools();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools7 = subject6.new SortTools();
        int[] intArray14 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray18 = sortTools7.rotate(intArray14, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray22 = sortTools5.rotate(intArray14, 10, 0, 1);
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        int[] intArray33 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray37 = sortTools26.rotate(intArray33, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        int[] intArray48 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray52 = sortTools41.rotate(intArray48, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray56 = sortTools39.rotate(intArray48, 10, 0, 1);
        int[] intArray59 = sortTools26.insertionSort(intArray48, (int) (short) 100, (int) (byte) 1);
        int[] intArray62 = sortTools24.swap(intArray48, (int) (byte) 10, (int) (byte) 1);
        int int66 = sortTools5.lower(intArray48, 0, (int) 'a', (int) (short) -1);
        int[] intArray73 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray76 = sortTools5.reverse(intArray73, (int) (byte) 0, 1);
        int int80 = sortTools3.lower(intArray73, (int) (byte) -1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray52);
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNull(intArray59);
        org.junit.Assert.assertNull(intArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-10086) + "'", int66 == (-10086));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-10086) + "'", int80 == (-10086));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test208");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        int int16 = taskHandler2.getIndex("hi!");
        boolean boolean18 = taskHandler2.hasNested("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test209");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        java.lang.Number number4 = numberHandler2.parseNumber("");
        org.junit.Assert.assertNull(number4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test210");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray41 = sortTools1.siftDown(intArray37, (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools1.rotate(intArray54, (int) (byte) 1, 35, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        java.lang.String str20 = textHandler3.escapeJavaStyleString("", false, true);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler22 = subject21.new ParameterHandler();
        java.lang.Boolean boolean27 = parameterHandler22.toBooleanObject("", "", "hi!", "hi!");
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray37 = new char[] { 'a', '#', 'a' };
        char[] charArray40 = textHandler31.toUpperCase(charArray37, (int) (short) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject41 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools42 = subject41.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler43 = subject41.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler44 = subject41.new TextHandler();
        char[] charArray46 = textHandler44.newTextBuffer((-10086));
        char[] charArray50 = new char[] { 'a', '#', 'a' };
        char[] charArray53 = textHandler44.toUpperCase(charArray50, (int) (short) 0, (int) (byte) 100);
        char[] charArray56 = textHandler31.toUpperCase(charArray50, 0, (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = parameterHandler22.parse(charArray50, 10, (int) (byte) 10, '4');
        char[] charArray63 = textHandler3.toLowerCase(charArray50, 100, 35);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + true + "'", boolean27, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, #, a]");
        org.junit.Assert.assertNull(charArray40);
        org.junit.Assert.assertNull(charArray46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "A#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "A#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[A, #, a]");
        org.junit.Assert.assertNull(charArray53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "A#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "A#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[A, #, a]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(charArray63);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test212");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isDigits("");
        int int12 = numberHandler2.minimum((int) (byte) 1, (int) (short) -1, (-10086));
        int int16 = numberHandler2.maximum((int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
        int int19 = numberHandler2.compare((double) 100.0f, 0.0d);
        int int23 = numberHandler2.minimum((int) (byte) 10, 10, 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10086) + "'", int12 == (-10086));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test213");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        boolean boolean14 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test214");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        java.lang.Boolean boolean53 = parameterHandler1.toBooleanObject("hi!");
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler56 = subject55.new ParameterHandler();
        comp5111.assignment.cut.Subject subject57 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler58 = subject57.new ParameterHandler();
        boolean[] booleanArray64 = new boolean[] { false, true, false, false, true };
        boolean boolean65 = parameterHandler58.hasOneTrue(booleanArray64);
        boolean boolean66 = parameterHandler56.hasOneTrue(booleanArray64);
        comp5111.assignment.cut.Subject subject67 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools68 = subject67.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler69 = subject67.new ParameterHandler();
        java.lang.Boolean boolean74 = parameterHandler69.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject76 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools77 = subject76.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler78 = subject76.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler79 = subject76.new TextHandler();
        char[] charArray81 = textHandler79.newTextBuffer((-10086));
        char[] charArray85 = new char[] { 'a', '#', 'a' };
        char[] charArray88 = textHandler79.toUpperCase(charArray85, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap89 = parameterHandler69.parse("", charArray85);
        java.util.Map<java.lang.String, java.lang.String> strMap91 = parameterHandler56.parse(charArray85, ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap92 = parameterHandler1.parse("hi!", charArray85);
        java.util.Map<java.lang.String, java.lang.String> strMap95 = parameterHandler1.parse("hi!", '4');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray64), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + boolean74 + "' != '" + true + "'", boolean74, true);
        org.junit.Assert.assertNull(charArray81);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[a, #, a]");
        org.junit.Assert.assertNull(charArray88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(strMap91);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(strMap95);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        long long10 = numberHandler2.minimum((long) (-10086), (long) (byte) 100, (long) (byte) 100);
        int int13 = numberHandler2.compare((float) ' ', (float) 100);
        int int17 = numberHandler2.maximum(1, 32, (int) (short) 0);
        boolean boolean19 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10086L) + "'", long10 == (-10086L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(1L, (-1L), 0L);
        long long11 = numberHandler3.minimum((-10086L), (long) 52, (long) (byte) 0);
        long long15 = numberHandler3.maximum((long) (short) 0, (long) (short) -1, (long) 52);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-10086L) + "'", long11 == (-10086L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.isMapped("hi!");
        java.lang.String str7 = taskHandler1.findNext("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test218");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        long long12 = numberHandler2.maximum((long) 0, (long) 'a', 0L);
        long long16 = numberHandler2.minimum((long) 'a', 1L, (long) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test219");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getKey("hi!");
        java.lang.String str8 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test220");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        boolean boolean7 = numberHandler2.isDigits("hi!");
        int int11 = numberHandler2.maximum(100, 35, 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test221");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.isMapped("hi!");
        java.lang.String str18 = taskHandler2.findNext("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test222");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        java.lang.String str18 = taskHandler2.getProperty("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test223");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject((int) (byte) 100, 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + true + "'", boolean64, true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test224");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler55 = subject53.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray62 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray65 = textHandler56.toUpperCase(charArray62, 100, (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap66 = parameterHandler1.parse("", charArray62);
        java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject(35, (int) (short) 1, 35, 32);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertEquals("'" + boolean71 + "' != '" + false + "'", boolean71, false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test225");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        int int3 = taskHandler1.getIndex("hi!");
        boolean boolean5 = taskHandler1.isIndexed("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10086) + "'", int3 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.remove("hi!");
        java.lang.String str5 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test227");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.string2char("");
        java.lang.String str7 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools22 = subject21.new SortTools();
        int[] intArray29 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray33 = sortTools22.rotate(intArray29, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray37 = sortTools20.rotate(intArray29, 10, 0, 1);
        int[] intArray41 = sortTools1.siftDown(intArray37, (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools45 = subject44.new SortTools();
        int[] intArray52 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray56 = sortTools45.rotate(intArray52, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray60 = sortTools43.rotate(intArray52, 10, 0, 1);
        int[] intArray65 = new int[] { (-1), (byte) 1, '#', (short) 100 };
        int[] intArray68 = sortTools43.swap(intArray65, 52, 100);
        int[] intArray71 = sortTools1.swap(intArray68, (-10086), (int) ' ');
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNull(intArray60);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-1, 1, 35, 100]");
        org.junit.Assert.assertNull(intArray68);
        org.junit.Assert.assertNull(intArray71);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        char[] charArray2 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap4 = parameterHandler1.parse(charArray2, '4');
        java.lang.Boolean boolean9 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass10 = parameterHandler1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test230");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test231");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.remove("hi!");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        java.lang.Class<?> wildcardClass15 = taskHandler2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test232");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler15 = subject13.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler16 = subject13.new TextHandler();
        char[] charArray18 = textHandler16.newTextBuffer((-10086));
        char[] charArray22 = new char[] { 'a', '#', 'a' };
        char[] charArray25 = textHandler16.toUpperCase(charArray22, (int) (short) 0, (int) (byte) 100);
        char[] charArray28 = textHandler3.toUpperCase(charArray22, 0, (int) (byte) 1);
        java.lang.String str32 = textHandler3.escapeJavaStyleString("hi!", false, false);
        char[] charArray34 = textHandler3.newTextBuffer((int) (byte) 0);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "A#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "A#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[A, #, a]");
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "A#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "A#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[A, #, a]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(charArray34);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test233");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        boolean boolean4 = numberHandler2.isNumber("hi!");
        boolean boolean6 = numberHandler2.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test234");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((-1), (-10086), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test235");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test236");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray13 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray17 = sortTools6.rotate(intArray13, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        int[] intArray28 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray32 = sortTools21.rotate(intArray28, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray36 = sortTools19.rotate(intArray28, 10, 0, 1);
        comp5111.assignment.cut.Subject subject37 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools38 = subject37.new SortTools();
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools40 = subject39.new SortTools();
        int[] intArray47 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray51 = sortTools40.rotate(intArray47, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject52 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools53 = subject52.new SortTools();
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools55 = subject54.new SortTools();
        int[] intArray62 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray66 = sortTools55.rotate(intArray62, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray70 = sortTools53.rotate(intArray62, 10, 0, 1);
        int[] intArray73 = sortTools40.insertionSort(intArray62, (int) (short) 100, (int) (byte) 1);
        int[] intArray76 = sortTools38.swap(intArray62, (int) (byte) 10, (int) (byte) 1);
        int int80 = sortTools19.lower(intArray62, 0, (int) 'a', (int) (short) -1);
        int[] intArray87 = new int[] { (byte) 1, 0, (short) 100, (byte) 100, 0, (short) 1 };
        int[] intArray90 = sortTools19.reverse(intArray87, (int) (byte) 0, 1);
        int[] intArray93 = sortTools6.swap(intArray87, 0, (int) (short) 100);
        int[] intArray96 = sortTools4.reverse(intArray87, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray66);
        org.junit.Assert.assertNull(intArray70);
        org.junit.Assert.assertNull(intArray73);
        org.junit.Assert.assertNull(intArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-10086) + "'", int80 == (-10086));
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[1, 0, 100, 100, 0, 1]");
        org.junit.Assert.assertNull(intArray93);
        org.junit.Assert.assertNull(intArray96);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test237");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        int int16 = taskHandler2.getIndex("hi!");
        java.lang.String str18 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("hi!");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        java.lang.String str14 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test239");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject3.new SortTools();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools6 = subject5.new SortTools();
        int[] intArray13 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray17 = sortTools6.rotate(intArray13, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject18.new SortTools();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools21 = subject20.new SortTools();
        int[] intArray28 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray32 = sortTools21.rotate(intArray28, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray36 = sortTools19.rotate(intArray28, 10, 0, 1);
        int[] intArray39 = sortTools6.insertionSort(intArray28, (int) (short) 100, (int) (byte) 1);
        int[] intArray42 = sortTools4.swap(intArray28, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject43 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools44 = subject43.new SortTools();
        comp5111.assignment.cut.Subject subject45 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools46 = subject45.new SortTools();
        int[] intArray53 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray57 = sortTools46.rotate(intArray53, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray61 = sortTools44.rotate(intArray53, 10, 0, 1);
        int[] intArray64 = sortTools4.reverse(intArray53, 1, (int) (byte) 0);
        int int68 = sortTools2.lower(intArray53, (-1), (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray32);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNull(intArray42);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray57);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-10086) + "'", int68 == (-10086));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.hasNested("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test241");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.findNext("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getKey("");
        java.lang.String str12 = taskHandler2.remove("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test242");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray7 = textHandler3.string2char("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test243");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("", true, true);
        char[] charArray9 = textHandler3.string2char("");
        java.lang.String str13 = textHandler3.escapeJavaStyleString("", false, true);
        char[] charArray15 = textHandler3.newTextBuffer((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray9 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, 100, (-1));
        java.lang.String str14 = textHandler3.unescapeJava("hi!");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test245");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.isMapped("hi!");
        boolean boolean7 = taskHandler1.isMapped("");
        boolean boolean9 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test246");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isMapped("hi!");
        boolean boolean12 = taskHandler2.hasNested("");
        int int14 = taskHandler2.getIndex("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test247");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((float) 100L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        long long10 = numberHandler2.minimum((long) (-10086), (long) (byte) 100, (long) (byte) 100);
        boolean boolean12 = numberHandler2.isDigits("");
        boolean boolean14 = numberHandler2.isNumber("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10086L) + "'", long10 == (-10086L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum((int) '4', (int) ' ', (int) (short) -1);
        boolean boolean8 = numberHandler2.isNumber("");
        int int12 = numberHandler2.maximum(10, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test250");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.remove("hi!");
        java.lang.String str14 = taskHandler2.findNext("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test251");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        long long12 = numberHandler2.maximum((long) 0, (long) 'a', 0L);
        int int16 = numberHandler2.maximum(97, (int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test252");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.findNext("hi!");
        int int8 = taskHandler2.getIndex("hi!");
        java.lang.String str10 = taskHandler2.getKey("");
        boolean boolean12 = taskHandler2.isMapped("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test253");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum(0, 0, 52);
        int int9 = numberHandler2.compare((double) (short) 0, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test254");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((int) '4');
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools4 = subject0.new SortTools();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test256");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler5 = subject0.new TextHandler();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test257");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((-10086));
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(charArray13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test258");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) 100, (int) ' ');
        boolean boolean9 = numberHandler3.isDigits("");
        boolean boolean11 = numberHandler3.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        boolean boolean10 = taskHandler2.isMapped("");
        java.lang.String str12 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test260");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        char[] charArray16 = textHandler3.string2char("");
        char[] charArray18 = textHandler3.string2char("");
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools20 = subject19.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler21 = subject19.new ParameterHandler();
        java.lang.Boolean boolean26 = parameterHandler21.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray37 = new char[] { 'a', '#', 'a' };
        char[] charArray40 = textHandler31.toUpperCase(charArray37, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = parameterHandler21.parse("", charArray37);
        char[] charArray44 = textHandler3.toUpperCase(charArray37, (int) ' ', 52);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, #, a]");
        org.junit.Assert.assertNull(charArray40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(charArray44);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        java.lang.String str12 = taskHandler2.getProperty("hi!");
        java.lang.String str14 = taskHandler2.getKey("");
        java.lang.String str16 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test262");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray8 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray12 = sortTools1.rotate(intArray8, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools14 = subject13.new SortTools();
        int[] intArray21 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray25 = sortTools14.rotate(intArray21, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        int[] intArray36 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray40 = sortTools29.rotate(intArray36, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray44 = sortTools27.rotate(intArray36, 10, 0, 1);
        int[] intArray47 = sortTools14.insertionSort(intArray36, (int) (short) 100, (int) (byte) 1);
        int[] intArray50 = sortTools1.insertionSort(intArray36, (int) ' ', 10);
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools52 = subject51.new SortTools();
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        int[] intArray61 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray65 = sortTools54.rotate(intArray61, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools67 = subject66.new SortTools();
        comp5111.assignment.cut.Subject subject68 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools69 = subject68.new SortTools();
        int[] intArray76 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray80 = sortTools69.rotate(intArray76, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray84 = sortTools67.rotate(intArray76, 10, 0, 1);
        int[] intArray87 = sortTools54.insertionSort(intArray76, (int) (short) 100, (int) (byte) 1);
        int[] intArray90 = sortTools52.swap(intArray76, (int) (byte) 10, (int) (byte) 1);
        int int94 = sortTools1.upper(intArray76, 0, 100, (int) ' ');
        boolean boolean97 = sortTools1.checkRange(1, 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray25);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray40);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNull(intArray50);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray65);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray80);
        org.junit.Assert.assertNull(intArray84);
        org.junit.Assert.assertNull(intArray87);
        org.junit.Assert.assertNull(intArray90);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-10086) + "'", int94 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        int int12 = numberHandler2.minimum((int) (byte) 0, (int) (byte) 0, 100);
        long long16 = numberHandler2.maximum(97L, (long) (byte) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test264");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        java.lang.String str9 = textHandler3.escapeJavaStyleString("", false, false);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test265");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        boolean[] booleanArray7 = new boolean[] { false, true, false, false, true };
        boolean boolean8 = parameterHandler1.hasOneTrue(booleanArray7);
        java.lang.Boolean boolean10 = parameterHandler1.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test266");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.isIndexed("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test267");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray21 = new char[] { 'a', '#', 'a' };
        char[] charArray24 = textHandler15.toUpperCase(charArray21, (int) (short) 0, (int) (byte) 100);
        char[] charArray26 = textHandler15.newTextBuffer((int) (short) 1);
        java.lang.String str28 = textHandler15.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject29.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray47 = new char[] { 'a', '#', 'a' };
        char[] charArray50 = textHandler41.toUpperCase(charArray47, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler31.parse("", charArray47);
        char[] charArray54 = textHandler15.toLowerCase(charArray47, 1, (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse(charArray54, '#');
        comp5111.assignment.cut.Subject subject58 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools59 = subject58.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler60 = subject58.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler61 = subject58.new TextHandler();
        char[] charArray63 = textHandler61.newTextBuffer((-10086));
        char[] charArray65 = textHandler61.newTextBuffer((int) (byte) 100);
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools67 = subject66.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler68 = subject66.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler69 = subject66.new TextHandler();
        char[] charArray71 = textHandler69.newTextBuffer((-10086));
        char[] charArray73 = textHandler69.newTextBuffer((int) (byte) 100);
        char[] charArray76 = textHandler61.toUpperCase(charArray73, (-10086), (-10086));
        java.util.Map<java.lang.String, java.lang.String> strMap77 = parameterHandler1.parse("", charArray73);
        java.lang.Boolean boolean79 = parameterHandler1.toBooleanObject("");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a]");
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, #, a]");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, #, a]");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(charArray63);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray71);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(charArray76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNull(boolean79);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test268");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        java.lang.Number number4 = numberHandler2.parseNumber("");
        boolean boolean6 = numberHandler2.isNumber("hi!");
        long long10 = numberHandler2.minimum((long) (short) 10, (long) 35, 0L);
        org.junit.Assert.assertNull(number4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test269");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        boolean boolean10 = taskHandler2.isIndexed("hi!");
        boolean boolean12 = taskHandler2.hasNested("");
        java.lang.String str14 = taskHandler2.remove("");
        java.lang.String str16 = taskHandler2.getKey("");
        java.lang.String str18 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
        boolean boolean6 = sortTools3.checkRange((int) ' ', (int) '4');
        int[] intArray12 = new int[] { 97, 'a', 97, 97, 0 };
        int[] intArray15 = sortTools3.insertionSort(intArray12, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[97, 97, 97, 97, 0]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test271");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler55 = subject53.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray62 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray65 = textHandler56.toUpperCase(charArray62, 100, (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap66 = parameterHandler1.parse("", charArray62);
        java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        comp5111.assignment.cut.Subject subject72 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools73 = subject72.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler74 = subject72.new TextHandler();
        char[] charArray76 = textHandler74.newTextBuffer((int) (byte) 0);
        java.lang.String str80 = textHandler74.escapeJavaStyleString("", false, false);
        char[] charArray82 = textHandler74.newTextBuffer((int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = parameterHandler1.parse(charArray82, 97, (int) (short) 1, '4');
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(boolean71);
        org.junit.Assert.assertNull(charArray76);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(strMap86);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        char[] charArray13 = textHandler3.newTextBuffer((int) (byte) -1);
        char[] charArray15 = textHandler3.string2char("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[h, i, !]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test273");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler3 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler4 = subject0.new NumberHandler();
        int int8 = numberHandler4.minimum(100, 1, (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test274");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum((long) 'a', (-1L), (long) 52);
        long long11 = numberHandler3.minimum((long) (short) 10, (long) (short) -1, (-1L));
        boolean boolean13 = numberHandler3.isDigits("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = numberHandler3.parseNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test275");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        int[] intArray45 = new int[] { (short) 1, (byte) -1, (short) -1, 1, 1 };
        int[] intArray48 = sortTools1.insertionSort(intArray45, (int) (byte) -1, (int) (byte) 0);
        boolean boolean51 = sortTools1.checkRange((int) ' ', 97);
        boolean boolean54 = sortTools1.checkRange((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, -1, -1, 1, 1]");
        org.junit.Assert.assertNull(intArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test276");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "hi!", "", "hi!");
        java.lang.Boolean boolean11 = parameterHandler1.toBooleanObject("", "", "", "hi!");
        java.lang.Boolean boolean16 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + true + "'", boolean11, true);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + true + "'", boolean16, true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test277");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.remove("");
        boolean boolean12 = taskHandler2.hasNested("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test278");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        java.lang.String str7 = textHandler3.escapeJavaStyleString("", true, true);
        char[] charArray9 = textHandler3.string2char("");
        java.lang.String str13 = textHandler3.escapeJavaStyleString("", false, true);
        char[] charArray15 = textHandler3.newTextBuffer((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(charArray15);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test279");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getKey("");
        boolean boolean5 = taskHandler1.hasNested("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test280");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray7 = textHandler3.string2char("");
        java.lang.String str9 = textHandler3.unescapeJava("");
        java.lang.String str11 = textHandler3.unescapeJava("");
        java.lang.String str13 = textHandler3.unescapeJava("hi!");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test281");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject((int) (byte) 100, 10, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test282");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        int int7 = numberHandler3.minimum((-1), (int) (short) -1, (int) (byte) 1);
        boolean boolean9 = numberHandler3.isDigits("");
        long long13 = numberHandler3.minimum((long) 'a', (-10086L), (long) 100);
        long long17 = numberHandler3.maximum((long) 32, 52L, (long) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10086L) + "'", long13 == (-10086L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        java.lang.String str6 = taskHandler2.getKey("");
        java.lang.String str8 = taskHandler2.findNext("");
        java.lang.Class<?> wildcardClass9 = taskHandler2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test284");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.maximum(0, 52, (int) (short) 10);
        boolean boolean8 = numberHandler2.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("");
        boolean boolean6 = taskHandler2.hasNested("hi!");
        java.lang.String str8 = taskHandler2.getKey("");
        java.lang.String str10 = taskHandler2.findNext("hi!");
        java.lang.String str12 = taskHandler2.findNext("");
        boolean boolean14 = taskHandler2.isIndexed("hi!");
        int int16 = taskHandler2.getIndex("hi!");
        java.lang.String str18 = taskHandler2.remove("");
        boolean boolean20 = taskHandler2.hasNested("");
        java.lang.Class<?> wildcardClass21 = taskHandler2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10086) + "'", int16 == (-10086));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test286");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools16 = subject15.new SortTools();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        int[] intArray25 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray29 = sortTools18.rotate(intArray25, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray33 = sortTools16.rotate(intArray25, 10, 0, 1);
        int[] intArray36 = sortTools3.insertionSort(intArray25, (int) (short) 100, (int) (byte) 1);
        int[] intArray39 = sortTools1.swap(intArray25, (int) (byte) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools43 = subject42.new SortTools();
        int[] intArray50 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray54 = sortTools43.rotate(intArray50, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray58 = sortTools41.rotate(intArray50, 10, 0, 1);
        int[] intArray61 = sortTools1.reverse(intArray50, 1, (int) (byte) 0);
        boolean boolean64 = sortTools1.checkRange((int) '4', 52);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNull(intArray33);
        org.junit.Assert.assertNull(intArray36);
        org.junit.Assert.assertNull(intArray39);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray54);
        org.junit.Assert.assertNull(intArray58);
        org.junit.Assert.assertNull(intArray61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test287");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        boolean boolean12 = taskHandler2.isIndexed("hi!");
        java.lang.String str14 = taskHandler2.getProperty("hi!");
        boolean boolean16 = taskHandler2.hasNested("hi!");
        boolean boolean18 = taskHandler2.isMapped("");
        java.lang.String str20 = taskHandler2.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test288");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools19 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler20 = subject17.new TextHandler();
        java.lang.String str24 = textHandler20.escapeJavaStyleString("", true, true);
        char[] charArray26 = textHandler20.string2char("");
        char[] charArray29 = textHandler3.toUpperCase(charArray26, 0, 1);
        char[] charArray31 = textHandler3.string2char("");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test289");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject2.new SortTools();
        int[] intArray10 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray14 = sortTools3.rotate(intArray10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray18 = sortTools1.rotate(intArray10, 10, 0, 1);
        boolean boolean21 = sortTools1.checkRange(97, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean76 = parameterHandler1.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        java.lang.Boolean boolean78 = parameterHandler1.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertEquals("'" + boolean69 + "' != '" + false + "'", boolean69, false);
        org.junit.Assert.assertNull(boolean71);
        org.junit.Assert.assertEquals("'" + boolean76 + "' != '" + true + "'", boolean76, true);
        org.junit.Assert.assertNull(boolean78);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test291");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        int[] intArray8 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray12 = sortTools1.rotate(intArray8, (int) (byte) 10, (int) (byte) 1, (int) '4');
        boolean boolean15 = sortTools1.checkRange(1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test292");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.getProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test293");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.findNext("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test294");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        boolean boolean7 = taskHandler1.isMapped("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test295");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test296");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.findNext("hi!");
        int int6 = taskHandler2.getIndex("");
        int int8 = taskHandler2.getIndex("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10086) + "'", int8 == (-10086));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test297");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int6 = numberHandler2.minimum((int) (short) -1, 0, (int) (byte) 0);
        int int10 = numberHandler2.maximum(100, (int) '#', (-1));
        long long14 = numberHandler2.maximum((long) (short) 0, (long) 1, (-1L));
        int int17 = numberHandler2.compare((double) (byte) 1, (double) (-1));
        long long21 = numberHandler2.minimum((-1L), 1L, (long) 35);
        long long25 = numberHandler2.minimum((long) (short) 1, (-1L), 100L);
        int int29 = numberHandler2.minimum((int) (short) 100, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test298");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(boolean64);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test299");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject((-1), (int) ' ', (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject((int) (short) 0, (-1), 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        boolean boolean8 = taskHandler2.hasNested("");
        java.lang.String str10 = taskHandler2.getProperty("");
        java.lang.String str12 = taskHandler2.getProperty("");
        boolean boolean14 = taskHandler2.hasNested("");
        java.lang.String str16 = taskHandler2.findNext("");
        java.lang.String str18 = taskHandler2.findNext("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        int int6 = taskHandler2.getIndex("hi!");
        boolean boolean8 = taskHandler2.isMapped("hi!");
        java.lang.String str10 = taskHandler2.getKey("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10086) + "'", int6 == (-10086));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler55 = subject53.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray62 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray65 = textHandler56.toUpperCase(charArray62, 100, (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap66 = parameterHandler1.parse("", charArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray65);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test303");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler3 = subject0.new NumberHandler();
        long long7 = numberHandler3.maximum(1L, (-1L), 0L);
        boolean boolean9 = numberHandler3.isNumber("");
        boolean boolean11 = numberHandler3.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test304");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        char[] charArray27 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = parameterHandler1.parse(charArray27, 0, (int) (byte) 10, 'a');
        java.lang.Boolean boolean33 = parameterHandler1.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test305");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        int int4 = taskHandler2.getIndex("hi!");
        java.lang.String str6 = taskHandler2.getProperty("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10086) + "'", int4 == (-10086));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test306");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        comp5111.assignment.cut.Subject subject53 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools54 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools55 = subject53.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler56 = subject53.new TextHandler();
        char[] charArray58 = textHandler56.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap59 = parameterHandler1.parse("", charArray58);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[]");
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test307");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getKey("hi!");
        java.lang.String str6 = taskHandler2.remove("");
        boolean boolean8 = taskHandler2.isIndexed("hi!");
        java.lang.String str10 = taskHandler2.remove("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test308");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        long long12 = numberHandler2.minimum(1L, (long) '#', 0L);
        boolean boolean14 = numberHandler2.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test309");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.SortTools sortTools2 = subject0.new SortTools();
        int[] intArray3 = null;
        int int7 = sortTools2.upper(intArray3, (int) (byte) -1, (int) (short) 1, (int) '4');
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools9 = subject8.new SortTools();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools11 = subject10.new SortTools();
        int[] intArray18 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray22 = sortTools11.rotate(intArray18, (int) (byte) 10, (int) (byte) 1, (int) '4');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools26 = subject25.new SortTools();
        int[] intArray33 = new int[] { (byte) -1, 100, ' ', (short) 0, (byte) -1, (-1) };
        int[] intArray37 = sortTools26.rotate(intArray33, (int) (byte) 10, (int) (byte) 1, (int) '4');
        int[] intArray41 = sortTools24.rotate(intArray33, 10, 0, 1);
        int[] intArray44 = sortTools11.insertionSort(intArray33, (int) (short) 100, (int) (byte) 1);
        int[] intArray47 = sortTools9.swap(intArray33, (int) (byte) 10, (int) (byte) 1);
        int[] intArray53 = new int[] { (short) 1, (byte) -1, (short) -1, 1, 1 };
        int[] intArray56 = sortTools9.insertionSort(intArray53, (int) (byte) -1, (int) (byte) 0);
        int[] intArray61 = new int[] { '#', (short) 1, '4', (byte) 1 };
        int[] intArray64 = sortTools9.insertionSort(intArray61, (-10086), 0);
        int[] intArray68 = sortTools2.doRotate(intArray61, (int) (short) 10, 52, (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10086) + "'", int7 == (-10086));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 100, 32, 0, -1, -1]");
        org.junit.Assert.assertNull(intArray37);
        org.junit.Assert.assertNull(intArray41);
        org.junit.Assert.assertNull(intArray44);
        org.junit.Assert.assertNull(intArray47);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, -1, -1, 1, 1]");
        org.junit.Assert.assertNull(intArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, 1, 52, 1]");
        org.junit.Assert.assertNull(intArray64);
        org.junit.Assert.assertNull(intArray68);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test310");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.NumberHandler numberHandler2 = subject0.new NumberHandler();
        int int5 = numberHandler2.compare((double) '4', (double) (byte) -1);
        int int8 = numberHandler2.compare((double) 10L, 0.0d);
        long long12 = numberHandler2.minimum(1L, (long) '#', 0L);
        int int15 = numberHandler2.compare((float) 100L, 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test311");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler1 = subject0.new TaskHandler();
        java.lang.String str3 = taskHandler1.getProperty("hi!");
        boolean boolean5 = taskHandler1.hasNested("");
        boolean boolean7 = taskHandler1.isMapped("");
        java.lang.String str9 = taskHandler1.getKey("hi!");
        java.lang.String str11 = taskHandler1.remove("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test312");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray21 = new char[] { 'a', '#', 'a' };
        char[] charArray24 = textHandler15.toUpperCase(charArray21, (int) (short) 0, (int) (byte) 100);
        char[] charArray26 = textHandler15.newTextBuffer((int) (short) 1);
        java.lang.String str28 = textHandler15.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools30 = subject29.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler31 = subject29.new ParameterHandler();
        java.lang.Boolean boolean36 = parameterHandler31.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools39 = subject38.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler40 = subject38.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler41 = subject38.new TextHandler();
        char[] charArray43 = textHandler41.newTextBuffer((-10086));
        char[] charArray47 = new char[] { 'a', '#', 'a' };
        char[] charArray50 = textHandler41.toUpperCase(charArray47, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler31.parse("", charArray47);
        char[] charArray54 = textHandler15.toLowerCase(charArray47, 1, (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse(charArray54, '#');
        char[] charArray61 = new char[] { '4', '#', '4' };
        java.util.Map<java.lang.String, java.lang.String> strMap62 = parameterHandler1.parse("hi!", charArray61);
        java.lang.Boolean boolean67 = parameterHandler1.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 35);
        java.lang.Boolean boolean72 = parameterHandler1.toBooleanObject("", "", "", "");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a]");
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
        org.junit.Assert.assertNull(charArray43);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, #, a]");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[a, #, a]");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4, #, 4]");
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + boolean67 + "' != '" + true + "'", boolean67, true);
        org.junit.Assert.assertEquals("'" + boolean72 + "' != '" + true + "'", boolean72, true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test313");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        java.lang.Boolean boolean26 = parameterHandler1.toBooleanObject(0, (int) (short) 0, (int) (short) -1, 0);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools29 = subject28.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler30 = subject28.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler31 = subject28.new TextHandler();
        char[] charArray33 = textHandler31.newTextBuffer((-10086));
        char[] charArray35 = textHandler31.string2char("");
        java.lang.String str37 = textHandler31.unescapeJava("");
        java.lang.String str39 = textHandler31.unescapeJava("");
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools41 = subject40.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler42 = subject40.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler43 = subject40.new TextHandler();
        char[] charArray49 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray52 = textHandler43.toUpperCase(charArray49, 100, (-1));
        char[] charArray55 = textHandler31.toUpperCase(charArray49, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = parameterHandler1.parse("hi!", charArray55);
        boolean[] booleanArray58 = new boolean[] { true };
        boolean boolean59 = parameterHandler1.hasOneTrue(booleanArray58);
        java.lang.Boolean boolean64 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        java.lang.Boolean boolean69 = parameterHandler1.toBooleanObject("", "hi!", "", "");
        java.lang.Boolean boolean71 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean76 = parameterHandler1.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1);
        java.lang.Boolean boolean81 = parameterHandler1.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) (-10086), (java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass82 = parameterHandler1.getClass();
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + true + "'", boolean26, true);
        org.junit.Assert.assertNull(charArray33);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNull(charArray55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + boolean64 + "' != '" + false + "'", boolean64, false);
        org.junit.Assert.assertEquals("'" + boolean69 + "' != '" + false + "'", boolean69, false);
        org.junit.Assert.assertNull(boolean71);
        org.junit.Assert.assertEquals("'" + boolean76 + "' != '" + true + "'", boolean76, true);
        org.junit.Assert.assertNull(boolean81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test314");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        java.lang.Boolean boolean6 = parameterHandler1.toBooleanObject("", "", "hi!", "hi!");
        boolean[] booleanArray11 = new boolean[] { true, false, false, true };
        boolean boolean12 = parameterHandler1.hasOneTrue(booleanArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = parameterHandler1.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No match.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test315");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        java.lang.String str4 = taskHandler2.getProperty("hi!");
        boolean boolean6 = taskHandler2.isIndexed("hi!");
        java.lang.String str8 = taskHandler2.getProperty("");
        java.lang.String str10 = taskHandler2.getKey("");
        java.lang.String str12 = taskHandler2.remove("hi!");
        java.lang.String str14 = taskHandler2.getKey("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test316");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        java.lang.Class<?> wildcardClass2 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test317");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler1 = subject0.new ParameterHandler();
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler3 = subject2.new ParameterHandler();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, true };
        boolean boolean10 = parameterHandler3.hasOneTrue(booleanArray9);
        boolean boolean11 = parameterHandler1.hasOneTrue(booleanArray9);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools13 = subject12.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler14 = subject12.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler15 = subject12.new TextHandler();
        char[] charArray17 = textHandler15.newTextBuffer((-10086));
        char[] charArray19 = textHandler15.string2char("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = parameterHandler1.parse(charArray19, ' ');
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools24 = subject23.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler25 = subject23.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler26 = subject23.new TextHandler();
        char[] charArray28 = textHandler26.newTextBuffer((-10086));
        char[] charArray30 = textHandler26.string2char("");
        java.lang.String str32 = textHandler26.unescapeJava("");
        java.lang.String str34 = textHandler26.unescapeJava("");
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools36 = subject35.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler37 = subject35.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler38 = subject35.new TextHandler();
        char[] charArray44 = new char[] { '#', '#', '4', '#', ' ' };
        char[] charArray47 = textHandler38.toUpperCase(charArray44, 100, (-1));
        char[] charArray50 = textHandler26.toUpperCase(charArray44, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = parameterHandler1.parse("hi!", charArray44);
        java.lang.Boolean boolean53 = parameterHandler1.toBooleanObject("");
        java.lang.Boolean boolean55 = parameterHandler1.toBooleanObject("hi!");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #,  ]");
        org.junit.Assert.assertNull(charArray47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(boolean53);
        org.junit.Assert.assertNull(boolean55);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test318");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TextHandler textHandler2 = subject0.new TextHandler();
        comp5111.assignment.cut.Subject.SortTools sortTools3 = subject0.new SortTools();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Subject_randoop990021_RegressionTest0.test319");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools1 = subject0.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler2 = subject0.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler3 = subject0.new TextHandler();
        char[] charArray5 = textHandler3.newTextBuffer((-10086));
        char[] charArray9 = new char[] { 'a', '#', 'a' };
        char[] charArray12 = textHandler3.toUpperCase(charArray9, (int) (short) 0, (int) (byte) 100);
        char[] charArray14 = textHandler3.newTextBuffer((int) (short) 1);
        java.lang.String str16 = textHandler3.unescapeJava("hi!");
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools18 = subject17.new SortTools();
        comp5111.assignment.cut.Subject.ParameterHandler parameterHandler19 = subject17.new ParameterHandler();
        java.lang.Boolean boolean24 = parameterHandler19.toBooleanObject("", "", "", "");
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.SortTools sortTools27 = subject26.new SortTools();
        comp5111.assignment.cut.Subject.TaskHandler taskHandler28 = subject26.new TaskHandler();
        comp5111.assignment.cut.Subject.TextHandler textHandler29 = subject26.new TextHandler();
        char[] charArray31 = textHandler29.newTextBuffer((-10086));
        char[] charArray35 = new char[] { 'a', '#', 'a' };
        char[] charArray38 = textHandler29.toUpperCase(charArray35, (int) (short) 0, (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = parameterHandler19.parse("", charArray35);
        char[] charArray42 = textHandler3.toLowerCase(charArray35, 1, (int) (short) 0);
        java.lang.String str44 = textHandler3.unescapeJava("hi!");
        java.lang.String str48 = textHandler3.escapeJavaStyleString("hi!", false, false);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a]");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + boolean24 + "' != '" + true + "'", boolean24, true);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, #, a]");
        org.junit.Assert.assertNull(charArray38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, #, a]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }
}

