import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the quantity.");
        int quantity = scanner.nextInt();
        
        //FOR CALCULATING THE SUM:
        int sum = 0;
        for (int count = 1; count <= quantity; ++count){
            if (!(count%2==0)){
                sum = sum + count;
            }
        }
        
        //PRINTING:
        System.out.println("The sum of the even numbers is " + sum + ".");
    }
}

