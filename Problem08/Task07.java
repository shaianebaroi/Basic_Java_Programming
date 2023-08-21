import java.util.Scanner;

public class Task07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int diff = 0;
        
        if (num1 > num2){
            diff = num1 - num2;
        }
        else if (num2 > num1) {
            diff = num2 - num1;
        }
        
        System.out.println (diff);
    }
}
