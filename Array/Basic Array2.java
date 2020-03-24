/* 
Description: A basic example of an Array
1) assign values to an array's elements and displayed.
2) with "for loops"
Name: Jessie Chao
*/

import java.util.Scanner;

public class BasicArrayDemo2 {
    
    public static void main(String[] args) {
         
        final int NUM_STUDNETS = 3;
        int sum=0;
        int average;
        int [] scores = new int [ NUM_STUDNETS ];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score got by 3 students.");

        //if you don't want to use for loop:
        //System.out.print("Student 1: ");
        // scores[0]= input.nextInt();
        for (int i = 0; i < scores.length; i++) 
        {   
            System.out.print("Student " +(i+1) + " : ");
            scores[i]= input.nextInt();
            sum += scores[i];
        }
        
        // a average of scores of three students.    
        average = sum/NUM_STUDNETS;
        
        // Display the values entered.
        System.out.println("The scorese that your srudent got are: ");
        
        for (int i = 0; i < scores.length; i++) 
        {   
            System.out.print(scores[i] +" ");   
        }
        // if you don't want to use for loop:
        // System.out.println(scores[0]);

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        System.exit(0);
        
    } 
}