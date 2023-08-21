import java.util.Scanner;

public class Task11 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();
        int temp = rowQuantity;
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            for (int spaceCount = temp - 1; spaceCount > 0; --spaceCount){
                System.out.print (" ");
            }
            for (int columnCount = 1; columnCount <= rowCount; ++columnCount){
                System.out.print (columnCount);
            }            
            System.out.println (" ");
            --temp;
        }
    }
}