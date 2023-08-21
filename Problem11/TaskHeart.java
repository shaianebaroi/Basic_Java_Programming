import java.util.Scanner;

public class TaskHeart {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter a number:");
        int quantity = scanner.nextInt();
        
        for (int rowCount = 1; rowCount <= quantity; ++rowCount){
            //LINE 1
            if (rowCount == 1){
                System.out.print ("  ");
                for (int starCount = 1; starCount <= quantity - 4; ++starCount){
                    System.out.print ("*");
                }
                System.out.print (" ");
                for (int starCount = 1; starCount <= quantity - 4; ++starCount){
                    System.out.print ("*");
                }
            }
            
            //LINE 2
            else if (rowCount == 2){
                System.out.print (" *");
                for (int spaceCount = 1; spaceCount <= quantity - 4; ++spaceCount){
                    System.out.print (" ");
                }
                System.out.print ("*");
                for (int starCount = 1; starCount <= quantity - 4; ++starCount){
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            
            //LINE 3
            else {
                if (rowCount == quantity){ 
                    int limit2 = quantity - 2;
                    for (int spaceCount = 1; spaceCount <= limit2; ++spaceCount){
                        System.out.print (" ");
                    }
                    System.out.print ("*");
                }
                else {
                    for (int spaceCount = 0; spaceCount <= rowCount - 3; ++spaceCount){
                        System.out.print (" ");
                    }
                    System.out.print ("*");
                    int limit = ((2 * quantity)- 1) - (2 * rowCount);
                    for (int spaceCount2 = 1; spaceCount2 <= limit; ++spaceCount2){
                        System.out.print (" ");
                    }
                    System.out.print ("*");
                }
            }
            System.out.println (" ");
        }
    }
}

