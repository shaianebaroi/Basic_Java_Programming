import java.util.Scanner;

public class Task09 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        for (int count = 1; count <= num; ++count) {
            System.out.println (count); 
        }
    }
}
