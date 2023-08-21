import java.util.Scanner;

public class Task19 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();      
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            if (rowCount < 3 || rowCount == rowQuantity){
                for (int spaceCount = 1; spaceCount <= rowQuantity - rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                for (int starCount = 1; starCount <= rowCount; ++starCount){
                    System.out.print (starCount); 
                }
            }  
            if (rowCount >= 3 && rowCount != rowQuantity){
                for (int spaceCount = 1; spaceCount <= rowQuantity - rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                System.out.print ("1");
                for (int spaceCount2 = 1; spaceCount2 <= rowCount - 2; ++spaceCount2){
                    System.out.print (" "); 
                }
                System.out.print (rowCount);
            }  
            System.out.println (" ");
        } 
    }
}
