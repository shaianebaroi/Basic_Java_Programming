import java.util.Scanner;

public class Task15 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the range of number.");
        int num1 = sc.nextInt ();
        int num2 = sc.nextInt ();
        int count = 0;
        while (count >= num1 || count <=num2) {
            int count2 = 1;
            int sum = 0; 
            int factorcount = 0;
            int num = 0;
            while (factorcount < num) {
                if (num%count == 0) {
                    sum = sum + count;
                }
                ++count;
            }
            
            if (sum == num){
                System.out.println ("The number is a Perfect Number");
            }
        }
    }
}