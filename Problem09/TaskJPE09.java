import java.util.Scanner;

public class TaskJPE09 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num = scanner.nextInt();
        
        if (num%2 == 0){
            System.out.println ("Even.");
        }
        
        else {
            System.out.println ("Odd.");
        }
    }
}