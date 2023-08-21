import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the quantity.");
        int quantity = scanner.nextInt();
        
        int[] a = new int[quantity];
        
        //INPUT:
        System.out.println ("Please enter the numbers.");
        for (int location = 0; location < quantity; ++location){
            a[location] = scanner.nextInt();
        }
        
        //FOR CALCULATING THE PRODUCT: 
        int product = 1;
        for (int location = 0; location < quantity; ++location){
            product = product * a[location];
        }
        
        //PRINTING:
        System.out.println("The product of the numbers is " + product + ".");
    }
}

