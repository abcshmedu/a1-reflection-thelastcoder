package edu.hm.thelastcoder.aufgabe1;

import static org.junit.Assert.assertEquals;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Mark Tripolt
 * @author Patrick Kuntz
 */
@RunWith(Parameterized.class)
public class ParameterTest {

    private int actual;
    private String expected;


    private static final int MAGIC_NUMBER = 42;
    private static final int RND_NUMBER = (int) (Math.random() * 100000);
    private static final int LEET = 1337;
    private static final int WEIRD_NUMBER = 70;
    private static final int KATUN_NUMBER = 7200;

    /**
     * ParameterTest Constructor.
     * @param actual value.
     * @param expected result.
     */
    public ParameterTest(int actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }
    /**
     * Test cases.
     * @return a number of test cases.
     */
    @Parameterized.Parameters
    public static Collection test() {
        return Arrays.asList(new Object[][]{

                {MAGIC_NUMBER, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + MAGIC_NUMBER + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},

                {Integer.MAX_VALUE, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + Integer.MAX_VALUE + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},
                
                {WEIRD_NUMBER, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + WEIRD_NUMBER + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},

                {Integer.MIN_VALUE, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + Integer.MIN_VALUE + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},

                {LEET, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + LEET + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},

                {RND_NUMBER, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + RND_NUMBER + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},

                {KATUN_NUMBER, "Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n"
                        + "foo (Type int): " + KATUN_NUMBER + "\n"
                        + "array (Type int[]) [1, 2, 3, ]\n"
                        + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                        + "add (Type int) 8\n"},
        });
    }

    /**
     * Method for testing purpose.
     * @throws ClassNotFoundException when an application tries to load in a class through its sting name.
     * @throws NoSuchMethodException when a particular method cannot be found.
     * @throws SecurityException when a security violation occurred.
     * @throws IllegalAccessException when an application tries to reflectively access a field or method without having access.
     * @throws NoSuchFieldException when there is no field with that name.
     * @throws IllegalArgumentException when a illegal argument was passed.
     * @throws InvocationTargetException when an exception is thrown my invoking a method or constructor.
     * @throws InstantiationException when an application tries to create an instance of a class using the newInstance method.
     */
    @Test
    public void testRenderAll() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        assertEquals(new Renderer(new SomeClass(actual)).render(), expected);
    }
}