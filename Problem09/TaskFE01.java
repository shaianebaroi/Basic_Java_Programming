import java.util.Scanner;

public class TaskFE01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num = scanner.nextInt();
        
        if (num%2 == 0 && num > 10){
            System.out.println ("An even number greater than 10.");
        }
        
        else if (num%2 == 0 && num <= 10) {
            System.out.println ("An even number not greater than 10.");
        }
        
        else if (num%2 != 0 && num > 10) {
            System.out.println ("An odd number greater than 10.");
        }
        
        else if (num%2 != 0 && num <= 10) {
            System.out.println ("An odd number not greater than 10.");
        }
    }
}