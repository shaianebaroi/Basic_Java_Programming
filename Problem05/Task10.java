import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[10];
        
        //INPUT:
        for (int count = 0; count < 10; ++count){
         a[count] = scanner.nextInt();
        }
        
        //FOR CALCULATING THE SUM: 
        int sum = 0; 
        int oddcount = 0;
        for (int count = 0; count < 10; ++count){
            if (!(a[count]%2==0)) {
            sum = sum + a[count]; 
            ++oddcount;
            } 
        }
        
        int average = sum/oddcount;
        
        //PRINTING:
        System.out.println("The sum of the odd numbers is " + sum + ".");
        System.out.println("The average of the odd numbers is " + average + ".");
    }
}

