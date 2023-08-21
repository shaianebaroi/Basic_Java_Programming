import java.util.Scanner;

public class Task04 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int count = sc.nextInt ();
        
        int product = 10;
        while (count > 1) {
            product = product * 10;
            --count;
        }
        
        System.out.println (product);
    }
}

