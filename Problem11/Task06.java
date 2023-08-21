import java.util.Scanner;

public class Task06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            for (int columnCount = 1; columnCount <= rowCount; ++columnCount){
                System.out.print (columnCount);
            }
            System.out.println (" ");
        }
    }
}