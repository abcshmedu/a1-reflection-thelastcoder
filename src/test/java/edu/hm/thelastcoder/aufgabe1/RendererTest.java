/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.thelastcoder.aufgabe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.*;
import edu.hm.thelastcoder.aufgabe1.*;

public class RendererTest {

    private SomeClass toRender;
    private Renderer renderer;

    @Before
    public void setUp() {
        toRender = new SomeClass(5);
        renderer = new Renderer(toRender);
    }

    @Test
    public void testRendering() throws Exception {
        assertEquals("Instance of edu.hm.thelastcoder.aufgabe1.SomeClass:\n" +
            "foo (Type int): 5\narray (Type int[]) [1, 2, 3, ]\ndate (Type java.util.Date): Fri Jan 02 11:17:36 CET 1970\n", renderer.render());
    }
    
    
}
