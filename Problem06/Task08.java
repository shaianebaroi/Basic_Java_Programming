import java.util.Scanner;

public class Task08 {
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
            if (numsafe == 1) {
                System.out.println ("one");
            } 
            
            else if (numsafe == 2) {
                System.out.println ("two");
            } 
            
            else if (numsafe == 3) {
                System.out.println ("three");
            } 
            
            else if (numsafe == 4) {
                System.out.println ("four");
            } 
            
            else  if (numsafe == 5) {
                System.out.println ("five");
            } 
            
            else if (numsafe == 6) {
                System.out.println ("six");
            } 
            
            else if (numsafe == 7) {
                System.out.println ("seven");
            } 
            
            else if (numsafe == 8) {
                System.out.println ("eight");
            } 
            
            else if (numsafe == 9) {
                System.out.println ("nine");
            } 
            
            else if (numsafe == 0) {
                System.out.println ("zero");
            }
            numsafe = numsafe2%product;
            product = product/10;
        }
    }
}


