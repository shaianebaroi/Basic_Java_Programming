import java.util.Scanner;

public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the quantity of the numbers to be enterred:");
        int quantity = scanner.nextInt();
        
        for (int count = 1; count <= quantity; ++count){
            System.out.println ("Please enter a number:");
            int num = scanner.nextInt();
            if (num%2 == 0){
                System.out.println("even");
            }
            else if (num%2 != 0){
                System.out.println("odd");
            }
        } 
    }
}