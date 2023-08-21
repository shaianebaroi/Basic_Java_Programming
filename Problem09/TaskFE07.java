import java.util.Scanner;

public class TaskFE07{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        
        if (marks > 50){
            System.out.println ("Pass.");
        }
        else {
            System.out.println ("You shall not pass.");
        }        
    }
}