import java.util.Scanner;

public class Task02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();
        
        System.out.println ("Please enter the number of rows:");
        int columnQuantity = scanner.nextInt();        
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            for (int columnCount = 1; columnCount <= columnQuantity; ++columnCount){
                System.out.print ("*");
            }
            System.out.println (" ");
        }
    }
}