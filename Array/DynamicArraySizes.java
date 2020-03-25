/* 
Purpose: Letting the user can decide a size of array
Name: Jessie Chao
*/

import java.util.Scanner;

public class  DynamicArraySizes {
    
    public static void main(String[] args) {
         
        int numExam;
        int [] exam;
        double average;
        int sum = 0 ;

        Scanner input = new Scanner(System.in);
        System.out.print("How many exams do you have? ");
        numExam = input.nextInt();
        
        exam = new int [numExam];
        
        for (int index=0; index<  exam.length; index++ )
        {
            System.out.print("Exam #" + (index+1) + ": ");
            exam[index] = input.nextInt();
            sum +=  exam[index];
        }
        
        average = sum / numExam;
               
        System.out.println("Below are your EXAM SOCRES: ");
        for(int val: exam)           
            System.out.print(val + " "); 
        
        System.out.println();
        System.out.println("Average score is " + average);
        
        System.exit(0);
        
    } 
}