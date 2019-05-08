/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.io.IOException;

/**
 *
 * @author Nikhil
 */
public class Main {
        
    public static void main(String[] args) throws IOException {
        int array[]= {0,1,2,3,4,5,6,7,8,9};
        int num;
        BinarySearch bs = new  BinarySearch(10, array);
        
        System.out.println("enter element to search");
        num = System.in.read();
        
        
        
        if(bs.binarySearch(num,0,array.length-1))
            System.out.print("Element found");
        else
            System.err.println("Element not found");
        
    }
    
}
