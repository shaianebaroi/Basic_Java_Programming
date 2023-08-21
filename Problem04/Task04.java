import java.util.Scanner;

public class Task04 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter your age:");
        int age = sc.nextInt ();
                
        if (age >= 18) {
            System.out.println ("Please enter your income.");
            int income = sc.nextInt ();
                       
            if (income < 10000) {
                System.out.println ("No tax.");
            } 
            else if (income <= 20000) {
                double tax; 
                tax = ((5.0/100) * income); 
                System.out.println(tax);
            }
            else if (income > 20000) {
                double tax = ((10.0/100) * income); 
                System.out.println(tax);
            }
            
        }
        else {
            System.out.println ("No tax.");
        } 
            
        }
    }
    