/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.thelastcoder.aufgabe1;


import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Boettcher
 */
public class RendererTest {

    private static final int FIVE = 5;
    
    private SomeClass toRender;
    private Renderer renderer;

    /**
     * TestCase.
     * @throws java.lang.Exception throws exceptions if occures
     */
    @Test
    public void testRendering() throws Exception {
        toRender = new SomeClass(FIVE);
        renderer = new Renderer(toRender);
        assertEquals("Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n" 
                + "foo (Type int): 5\n"
                + "array (Type int[]) [1, 2, 3, ]\n"
                + "date (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n"
                + "add (Type int) 8\n",
                renderer.render());
    }


}
