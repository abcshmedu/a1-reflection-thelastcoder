package edu.hm.thelastcoder.aufgabe1;


import java.util.*;

/**
 *
 * @author Mark Tripolt
 * @author Patrick Kuntz
 */

public class SomeClass {
    
    @RenderMe
    private int foo;

    @RenderMe(with = "edu.hm.thelastcoder.aufgabe1.ArrayRenderer")
    int[] array = {1, 2, 3, };

    @RenderMe
    private Date date = new Date(123456789);
    
    @RenderMe
    public static int add() {
        return 3 + 5;
    }
    /**
     * SomeClass Constructor.
     * @param foo test variable
     */
    public SomeClass(int foo) {
        this.foo = foo;
    }
}
