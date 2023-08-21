import java.util.Scanner;

public class Task25 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        //ONE
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            if (rowCount == 1) {
                for (int spaceCount = 1; spaceCount <= rowQuantity - rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                for (int starCount = 1; starCount <= rowCount; ++starCount){
                    System.out.print (starCount); 
                }
            }
            else {
                for (int spaceCount = 1; spaceCount <= rowQuantity - rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                for (int starCount = 1; starCount <= rowCount; ++starCount){
                    System.out.print (starCount); 
                }
                for (int starCount = rowCount - 1; starCount >= 1; --starCount){
                    System.out.print (starCount); 
                }
            }
            System.out.println (" ");
        }
    }
}
