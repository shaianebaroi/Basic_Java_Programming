import java.util.Scanner;

public class Task08 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number of published articles:");
        int articles = sc.nextInt ();
                
        int fees = (articles * 500);
                   
        System.out.println (fees);
        }
}
       