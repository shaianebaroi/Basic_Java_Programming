import java.util.Scanner;

public class Task07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            
            for (int spaceCount = 1; spaceCount <= rowQuantity - rowCount; ++spaceCount){
                System.out.print (" ");
            }
            for (int starCount = 1; starCount <= rowCount; ++starCount){
                System.out.print ("*"); 
            }
            System.out.println (" ");
        }
    }
}
