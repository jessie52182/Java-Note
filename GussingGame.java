//Guessing a number game.
//while loop + Math.random()+ if..else..if Statement

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        int randNumber;
        int guessNumber;
        
        // generate random numbers within 1 to 10 
        // java.lang.Math.random() method 
        //(int)(Math.random() * range) + min 
        randNumber = (int) (Math.random() * 10) + 1 ;  
                   
            //Asking user for a guess
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Please enter a guessing number(1~10): ");
            
        while (true)
        {
            guessNumber = keyboard.nextInt();
 
            if (guessNumber > randNumber)
            {
                System.out.println("Your guessing number is greater than the random number.");
                System.out.print("Your next guessing number: " );
            }
            else if (guessNumber < randNumber)
            {   
                System.out.println("Your guessing number is smaller than the random number.");
                System.out.print("Your next guessing number: " );
            }
            else
            {
                System.out.println("BINGO. Your guessing number is equal to the random number.");
                System.exit(0);
            }
              
        }                           
    }
    
}