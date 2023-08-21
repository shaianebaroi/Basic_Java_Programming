import java.util.Scanner;

public class TaskJPE03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        float num1 = scanner.nextInt();
        float num2 = scanner.nextInt();
        
        float sum = num1 + num2;
        
        float product = num1 * num2;
        
        float difference = 0;
        if (num1 > num2){
            difference = num1 - num2;
        }
        
        else if (num2 > num1){
            difference = num2 - num1;
        }
        
        System.out.println ("Sum = " + sum);
        System.out.println ("Product = " + product);
        System.out.println ("Difference = " + difference);
    }
}