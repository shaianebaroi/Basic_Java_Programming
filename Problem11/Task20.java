import java.util.Scanner;

public class Task20 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();  
        int temp = rowQuantity;
        
        int count = 0; 
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){
            if (rowCount == 1 || rowCount == rowQuantity){
                for (int spaceCount = temp - 1; spaceCount > 0; --spaceCount){
                    System.out.print(" ");
                }
                for (int starCount = 1; starCount <= rowCount + count; ++starCount){
                    System.out.print("*");
                }
            }
            else {
                for (int spaceCount = temp - 1; spaceCount > 0; --spaceCount){
                    System.out.print(" ");
                }
                System.out.print ("*");
                for (int spaceCount2 = 1; spaceCount2 <= rowCount + count - 2; ++spaceCount2){
                    System.out.print(" ");
                }
                System.out.print ("*");
            }
            System.out.println (" ");
            ++count;
            --temp;
        }
    }
}
