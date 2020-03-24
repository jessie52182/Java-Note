/* 
Purpose: A basic example of an Array 
1) array initialization
Name: Jessie Chao
*/

import java.util.Scanner;

public class ArrayInitialization {
    
    public static void main(String[] args) {
         
        int sum=0;

        int [] number = { 20, 30, 40, 32, 25 };

        System.out.println("The English courses have four classes.");
        System.out.println("Below is the student nuber of each class:");
      
        for (int i = 0; i < number.length; i++) 
        {   
            System.out.println("Class " +(i+1) + " : " + number[i]);
            sum += number[i];
        }
        
        System.out.println();
        System.out.println("Total student number: " + sum);
       
        
        System.exit(0);
        
    } 
}
