/* 
Purpose: A basic example of an Array 
Name: Jessie Chao
*/

import java.util.Scanner;

public class PassArray2 {
    
    
    public static void main(String[] args) {
        
        // size of array
        final int NUMBER_EXAM  = 5 ;
        
        // creat an array
        int [] exam = new int [NUMBER_EXAM];
      
        getScores(exam);
        
        System.out.println("Below are your EXAM SOCRES: ");
        showScores(exam);
        
        System.exit(0);
    }
    
    private static void getScores(int[] exam ) {    
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter" + exam.length + "scores. ");
        
        for (int index = 0; index < exam.length; index++ )
        {
            System.out.print("Exam #" + (index+1) + ": ");
            exam[index] = input.nextInt();
        }
    } 
    
    public static void showScores(int[] exam ) {     
        for(int index = 0 ; index < exam.length; index++)  
        System.out.print( exam[index] + " ");  
    }
   
} 
 