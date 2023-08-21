import java.util.Scanner;

public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number:");
        int quantity = scanner.nextInt();
        
        int divCount = 0;
        for (int count = 1; count <= quantity; ++ count){
            if (quantity%count == 0) {
                System.out.print (count + "   ");
                ++divCount;
            }
        }
        System.out.println ("Total " + divCount + " divisors.");
    }
}