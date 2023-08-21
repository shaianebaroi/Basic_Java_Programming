import java.util.Scanner;

public class TaskJPE08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int difference = 0;
        if (num1 > num2){
            difference = num1 - num2;
        }
        
        else if (num2 > num1){
            difference = num2 - num1;
        }
       
        System.out.println ("Difference = " + difference);
    }
}