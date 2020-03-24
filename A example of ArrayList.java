/* A example of an ArrayList */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList {
    
    public static void main(String[] args) {
         
        ArrayList <String> studentNameList = new ArrayList<String> ();
        String studentName;
        
        System.out.println("Please enter four names of student.");
        
        for (int a = 0; a < 4; a++) 
        {
            System.out.print("Number" + (a+1) + ": ");
            Scanner input = new Scanner(System.in); 
            studentName = input.nextLine(); 
            studentNameList.add(studentName);
        }
        
        System.out.println("The four names of students are: ");
        
        for(String name: studentNameList)           
            System.out.println(name);  

        System.exit(0);
       
    } 
}
