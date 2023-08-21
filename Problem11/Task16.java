import java.util.Scanner;

public class Task16 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            if (rowCount < 3 || rowCount == rowQuantity) {
                for (int starCount = 1; starCount <= rowCount; ++starCount){
                    System.out.print ("*");
                }
            }
            if (rowCount >= 3 && rowCount != rowQuantity) {
                System.out.print ("*");
                for (int spaceCount = 1; spaceCount <= rowCount - 2; ++spaceCount){
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            System.out.println (" ");
        }
    }
}