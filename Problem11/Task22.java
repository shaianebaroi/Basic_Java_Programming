import java.util.Scanner;

public class Task22 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter a number:");
        int quantity = scanner.nextInt();
        
        for (int rowCount = 1; rowCount <= quantity; ++rowCount){ 
            if (rowCount == 1){
                for (int spaceCount = rowCount; spaceCount <= quantity - 1; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = (2 * rowCount) - 1;
                for (int starCount = 1; starCount <= limit; ++starCount){
                    System.out.print ("*");
                }
            }
            else {
                for (int spaceCount = rowCount; spaceCount <= quantity - 1; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = (2 * rowCount) - 1;
                System.out.print ("*");
                for (int spaceCount2 = 1; spaceCount2 <= limit - 2; ++spaceCount2){
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            System.out.println(" ");
        }
        for (int rowCount = 1; rowCount <= quantity - 1; ++rowCount){ 
            if (rowCount == quantity - 1){
                for (int spaceCount = 1; spaceCount <= rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = ((2 * quantity) - 1) - (2 * rowCount);
                for (int starCount = 1; starCount <= limit; ++starCount){
                    System.out.print ("*");
                }
            }
            else {
                for (int spaceCount = 1; spaceCount <= rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = ((2 * quantity) - 1) - (2 * rowCount);
                System.out.print ("*");
                for (int spaceCount2 = 1; spaceCount2 <= limit - 2; ++spaceCount2){
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            System.out.println(" ");
        }
    }
}
