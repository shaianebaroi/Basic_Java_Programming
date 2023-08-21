import java.util.Scanner;

public class Task14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the number of rows:");
        int rowQuantity = scanner.nextInt();
        
        System.out.println ("Please enter the number of columns:");
        int columnQuantity = scanner.nextInt();
        
        for (int rowCount = 1; rowCount <= rowQuantity; ++rowCount){ 
            if (rowCount == 1 || rowCount == rowQuantity){
                for (int starCount = 1; starCount <= columnQuantity; ++starCount){
                    System.out.print ("*");
                }
            }
            else {
                System.out.print ("*");
                for (int spaceCount = 1; spaceCount <= columnQuantity - 2; ++spaceCount){
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            System.out.println(" ");
        }
    }
}
