import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[10];
        
        //INPUT:
        for (int count = 0; count < 10; ++count){
         a[count] = scanner.nextInt();
        }
        
        //FOR CALCULATING THE SUM: 
        int sum = 0; 
        int evencount = 0;
        for (int count = 0; count < 10; ++count){
            if (a[count]%2==0) {
            sum = sum + a[count]; 
            ++evencount;
            } 
        }
        
        int average = sum/evencount;
        
        //PRINTING:
        System.out.println("The sum of the even numbers is " + sum + ".");
        System.out.println("The average of the even numbers is " + average + ".");
    }
}

