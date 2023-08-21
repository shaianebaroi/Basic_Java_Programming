import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number:");
        int quantity = scanner.nextInt();
        
        int divCount = 0;
        for (int count = 1; count <= quantity; ++ count){
            if (quantity%count == 0) {
                //System.out.print (count + "   ");
                ++divCount;
            }
        }
        
        if (divCount == 2){
            System.out.println ("The number is a prime number.");
        }
        
        else {
            System.out.println ("The number is not a prime number.");
        }
    }
}