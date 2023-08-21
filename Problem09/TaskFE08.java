import java.util.Scanner;

public class TaskFE08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter the marks:");
        int marks = scanner.nextInt();
        
        if (marks >= 0 && marks <= 100){
            if (marks >= 90){
                System.out.println ("A");
            }
            if (marks >= 80 && marks <= 89){
                System.out.println ("B");
            }
            if (marks >= 70 && marks <= 79){
                System.out.println ("C");
            }
            if (marks >= 60 && marks <= 69){
                System.out.println ("D");
            }
            if (marks >= 50 && marks <= 59){
                System.out.println ("E");
            }
            if (marks < 50){
                System.out.println ("F");
            }
        } 
        else {
            System.out.println ("Wrong input.");
        }
    }
}