import java.util.Scanner;

public class Task06 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the s:");
        int s = sc.nextInt ();
        
        if (s < 100) {
            int l = (3000 - (125 * s * s));
            System.out.println (l);
        }
        else {
            int l = (12000/(4 + ((s * s)/149000)));
            System.out.println (l);
        }
    }
}
