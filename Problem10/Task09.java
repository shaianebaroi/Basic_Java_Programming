import java.util.Scanner;

public class Task09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number:");
        int quantity = scanner.nextInt();
        
        int sum = 0;
        for (int count = 1; count < quantity; ++ count){
            if (quantity%count == 0) {
                sum = sum + count;
            }
        }
        
        if (sum == quantity){
            System.out.println ("The number you entered is a Perfect Number.");
        }
        
        else {
            System.out.println ("The number you entered is not a Perfect Number.");
        }
        
    }
}