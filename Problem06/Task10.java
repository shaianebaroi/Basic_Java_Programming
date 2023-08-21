import java.util.Scanner;

public class Task10 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        int count2 = 0;
        int count = 1; 
        while (count <= num) {
            if (num%count==0) {
                ++count2; 
            }
            ++count;
        }
        System.out.println (count2);
    }
}
