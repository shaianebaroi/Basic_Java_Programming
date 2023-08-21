import java.util.Scanner;

public class Task13 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        //FIGURING FACTORS:
        int count = 1;
        int sum = 0; 
        while (count <= num) {
            if (num%count == 0) {
                sum = sum + count;
            }
            ++count;
        }
        
        System.out.println (sum);
    }
}