
/* java.lang.Math.random() method */

public class  MathRandomMethod {

    public static void main(String[] args) {
        int number;
        
        for (int i = 0; i < 10; i++) 
        {
            // generate random numbers within 1 to 10 
            //(int)(Math.random() * range) + min 
            number = (int) (Math.random() * 10) + 1 ;  
            
            System.out.println(number);
        }       
    }
    
}

