import java.util.Scanner;

public class Task11 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        //FIGURING FACTORS:
        int count2 = 0;
        int count = 1; 
        while (count <= num) {
            if (num%count==0) {
                ++count2; 
            }
            ++count;
        }
        
        //FIGURING WHETHER PRIME NUMBER OR NOT:
        if (count2 == 2){
            System.out.println ("The number is a prime number.");
        } 
        else {
            System.out.println ("The number is not a prime number.");
        }
    }
}
