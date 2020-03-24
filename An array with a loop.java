// A Java program to add four scores into an array with a loop method

import javax.swing.*;
public class ArrayAndLoop {
    
    public static void main(String[] args) {
        
        int [] scores = new int [4];
        String response;
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
     
        JOptionPane.showMessageDialog(null, "Please enter 4 scores.");   
        
        for (int a = 0; a < 4; a++) 
        {
            response = JOptionPane.showInputDialog(null, "Enter score" + (a+1));
            scores[a] = Integer.parseInt(response);
            
            sum = sum + scores[a];
            
            if (scores[a] > largest) 
            {    
                largest = scores[a];
            }
            
            if (scores[a] < smallest) 
            {
                smallest = scores[a];   
            }       
        }
        
        System.out.println("The four scores: ");
        System.out.println( "N1: " + scores [0]);
        System.out.println( "N2: " + scores [1]);
        System.out.println( "N3: " +scores [2]);
        System.out.println( "N3: " +scores [3]);
        System.out.println( "Smallest score: " + smallest);
        System.out.println( "Largest score: " + largest);
       
    } 
}

    
