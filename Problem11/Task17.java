import java.util.Scanner;

public class Task17 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            if (rowCount < 3 || rowCount == rowQuantity) {
                for (int starCount = 1; starCount <= rowCount; ++starCount){
                    System.out.print (starCount);
                }
            }
            if (rowCount >= 3 && rowCount != rowQuantity) {
                System.out.print ("1");
                for (int spaceCount = 1; spaceCount <= rowCount - 2; ++spaceCount){
                    System.out.print (" ");
                }
                System.out.print (rowCount);
            }
            System.out.println (" ");
        }
    }
}