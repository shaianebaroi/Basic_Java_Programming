import java.util.Scanner;

public class Task06 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt (); 
        int numsafe = num;
        int numsafe2 = numsafe;
        
        //COUNTING THE NUMBER OF DIGITS
        int count = 0;
        while (num > 0) {
            int num2 = num%10;
            num = num/10;
            ++count;
        }
               
        //CALCULATE POWER 10
        
        int product = 10;
        while (count > 2) {
            product = product * 10;
            --count;
        }
                
        //REPEATING STEPS:
        
        while (product >= 1) {
            numsafe = numsafe/product; 
            System.out.println (numsafe);
            numsafe = numsafe2%product;
            product = product/10;
        }
    }
}


