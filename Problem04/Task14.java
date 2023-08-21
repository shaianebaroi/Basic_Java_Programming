import java.util.Scanner;

public class Task14 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter your number:");
        int num = sc.nextInt ();
        
        if (num >= 0) {
            System.out.println (num);
        }
        else {
            num = (num * (-1));
            System.out.println (num);
        }
        
    }
}
