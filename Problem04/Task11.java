import java.util.Scanner;

public class Task11 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the first number:");
        int a = sc.nextInt ();
        
        System.out.println ("Please enter the second number:");
        int b = sc.nextInt ();
        
        int x = a;
        a = b;
        b = x;
        
        System.out.println (a + b);
    }
}
