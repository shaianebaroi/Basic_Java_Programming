import java.util.Scanner;

public class Task08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num = scanner.nextInt();
        
        if (num%2==0){
            System.out.println ("The number is even.");
        }
        else {
            System.out.println ("The number is odd.");
        }
    }
}
