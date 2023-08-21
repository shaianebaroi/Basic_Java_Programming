import java.util.Scanner;

public class Task01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the student's mark:");
        int mark = sc.nextInt ();
        
        if (mark > 50) {
            System.out.println ("Pass.");
        }
        else {
            System.out.println ("You shall not pass.");
        }
            
    }
}
    