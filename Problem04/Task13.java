import java.util.Scanner;

public class Task13 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the first number:");
        int a = sc.nextInt ();
        
        System.out.println ("Please enter the second number:");
        int b = sc.nextInt ();
        
        System.out.println ("Please enter the third number:");
        int c = sc.nextInt ();
        
         System.out.println ("Please enter the fourth number:");
        int d = sc.nextInt ();
        
        int x = a;
        a = d;
        d = a;
        a = b;
        b = c;
        c = x;
        
        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
    }
}
