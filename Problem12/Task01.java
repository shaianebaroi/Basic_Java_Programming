import java.util.Scanner;

public class Task01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the numbers.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2 + num3; 
        
        System.out.print (sum + ", " + num1 + ", " + num2 + ", " + num3 + ".");
    }
}