import java.util.Scanner;

public class Task06 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the limit of the equation:");
        int quantity = scanner.nextInt();
        
        double sum = 0;
        for (int count = 1; count <= quantity; ++count){
            if (count%2==0){
                sum = sum - Math.pow(count,2);
            }
            else if (!(count%2==0)){
                sum = sum + Math.pow(count,2);
            }
        }
        
        //PRINTING:
        System.out.println("The sum of y is " + sum + ".");
    }
}

