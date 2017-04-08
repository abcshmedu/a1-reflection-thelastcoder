/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.thelastcoder.aufgabe1;

/**
 * Class to render an Array.
 * @author Mark Tripolt
 * @author Patrick Kuntz
 */
public class ArrayRenderer {

    /**
     * Default Constructor.
     */
    public ArrayRenderer() {
    }

    /**
     *  Method to render int arrays.
     * @param array with int values.
     * @return the values of the array.
     */
    public String render(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ", ";
        }
        result += "]";
        return result;

    }
}
