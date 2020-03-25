/* 
Purpose: A basic example of an Array 
Name: Jessie Chao
*/

import java.util.Scanner;

public class PassArray {
    
    public static void main(String[] args) {
         
        int numExam;
        int [] exam;

        Scanner input = new Scanner(System.in);
        System.out.print("How many exams do you have? ");
        numExam = input.nextInt();
        
        exam = new int [numExam];
        
        for (int index=0; index<  exam.length; index++ )
        {
            System.out.print("Exam #" + (index+1) + ": ");
            exam[index] = input.nextInt();
        }
         
        System.out.println("Below are your EXAM SOCRES: ");
        showScores(exam);
        
        System.exit(0);
    }
      
    public static void showScores(int[] exam ) {     
        for(int index = 0 ; index < exam.length; index++)  
        System.out.print( exam[index] + " ");  
    }
   
}
        
 