import java.util.Scanner;

public class Task05 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the limit of the equation:");
        int quantity = scanner.nextInt();
        
        double sum = 0;
        for (int count = 1; count <= quantity; ++count){
            sum = sum + Math.pow(count,3);
        }
        
        double y = Math.cbrt(sum);
        
        //PRINTING:
        System.out.println("The sum of y is " + sum + ".");
        System.out.println("The value of y is " + y + ".");
    }
}

