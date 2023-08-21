import java.util.Scanner;

public class Task05 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        int count = 0;
        while (num > 0) {
            int num2 = num%10;
            System.out.println (num2);
            num = num/10;
            ++count;
            
        }
    }
}


