import java.util.Scanner;

public class Task05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        for (int count = 1; count <= 20; ++count){
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