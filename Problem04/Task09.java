import java.util.Scanner;

public class Task09 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the first number:");
        int num1 = sc.nextInt ();
        
        System.out.println ("Please enter the second number:");
        int num2 = sc.nextInt ();
        
        System.out.println ("Please enter the third number:");
        int num3 = sc.nextInt ();
        int largest = 0 ;
        {        
            if (num1 > num2 && num1 > num3) {
                largest = num1;
            } 
            else if(num2 > num1 && num2 > num3) {
                largest = num2;
            }
            else if (num3 > num1 && num3 > num2) {
                largest = num3;
            }
            System.out.println(largest); 
        }
    }
}

