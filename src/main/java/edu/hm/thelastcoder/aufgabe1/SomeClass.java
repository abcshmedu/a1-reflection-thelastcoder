package edu.hm.thelastcoder.aufgabe1;

/**
 * Created by isigoing on 03.04.2017.
 */
        import java.util.*;
public class SomeClass {
    @RenderMe
    private int foo;

    @RenderMe(with = "edu.hm.thelastcoder.aufgabe1.ArrayRenderer")
    int[] array = {1, 2, 3, };

    @RenderMe
    private Date date = new Date(123456789);
    public SomeClass(int foo) {
        this.foo = foo;
    }
}
