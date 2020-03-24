/* 
Purpose: A basic example of an Array 
Name: Jessie Chao
*/

import java.util.Scanner;

public class ScoreArray {
    
    public static void main(String[] args) {
         
        final int NUMBER = 5;
        int [] scores = new int[NUMBER] ;
        double average;
        int sum = 0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your five EXAM SCORES this semester: ");
        
        for (int index=0; index< scores.length; index++ )
        {
            System.out.print("Exam #" + (index+1) + " :");
            scores[index] = input.nextInt();
            sum += scores[index];
        }
        
        average = sum / NUMBER;
               
        System.out.println("Below is your five EXAM SCORES: ");
        for(int val: scores)           
            System.out.println(val); 
        
        System.out.println();
        System.out.println("Average score is " + average);
        
        System.exit(0);
        
    } 
}