import java.util.Scanner;

public class Task05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if (num1 > num2){
            System.out.println ("First");
        }
        else {
            System.out.println ("First is not greater.");
        }
    }
}
