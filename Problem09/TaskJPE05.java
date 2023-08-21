import java.util.Scanner;

public class TaskJPE05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if (num1 > num2){
            System.out.println ("First."); 
        }        
    }
}