/* 
Purpose: A basic example of an Array 
Name: Jessie Chao
*/

import java.util.Scanner;

public class BasicArray {
    
    public static void main(String[] args) {
         
        final int NUM_ELEMENTS = 3;
        
        String [] studentName = new String [ NUM_ELEMENTS ];
        
        studentName[0]= "Jessie";
        studentName[1]= "John";
        studentName[2]= "Wendy";
          
        for (int i = 0; i < studentName.length; i++) 
            System.out.println("index " + i + " : "+ studentName[i]);

        System.exit(0);
       
    } 
}
