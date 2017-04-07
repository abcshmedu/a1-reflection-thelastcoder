/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.thelastcoder.aufgabe1;

/**
 *
 * @author soich
 */
public class ArrayRenderer {
    
    public Object object;
    public String type = "";
    
    public ArrayRenderer(){
    }
    
    public String render(int[] array){
        String result = "[";
        for(int i = 0; i < array.length; i++){
            
            result += array[i] + ", ";
        }
        return result += "]";

    }
}
