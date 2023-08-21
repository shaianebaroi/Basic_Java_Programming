import java.util.Scanner;

public class Task23 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter a number:");
        int quantity = scanner.nextInt();
        
        //STEP 1 
        for (int rowCount = 1; rowCount <= quantity; ++rowCount){ 
            //FIRST LINE CONDITION
            if (rowCount == 1){
                for (int spaceCount = rowCount; spaceCount <= quantity - 1; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = (2 * rowCount) - 1;
                for (int starCount = 1; starCount <= limit; ++starCount){
                    System.out.print (starCount);
                }
            }
            //REST CONDITION
            if (rowCount > 1){
                for (int spaceCount = rowCount; spaceCount <= quantity - 1; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = (2 * rowCount) - 1;
                System.out.print ("1");
                for (int spaceCount2 = 1; spaceCount2 <= limit; ++spaceCount2){
                    if (spaceCount2 == limit){
                        System.out.print (spaceCount2);
                    }
                    else if (spaceCount2 < limit - 1) {
                        System.out.print (" ");
                    }
                }
            }
            System.out.println(" ");
        }
        
        //STEP 2
        for (int rowCount = 1; rowCount <= quantity - 1; ++rowCount){ 
            //LAST LINE CONDITION
            if (rowCount == quantity - 1){
                for (int spaceCount = 1; spaceCount <= rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = ((2 * quantity) - 1) - (2 * rowCount);
                for (int spaceCount2 = 1; spaceCount2 <= limit; ++spaceCount2){
                    if (spaceCount2 == limit){
                        System.out.print (spaceCount2);
                    }
                    else if (spaceCount2 < limit - 1) {
                        System.out.print (" ");
                    }
                }
            }
            
            //REST CONDITION
            if (rowCount < quantity - 1){
                for (int spaceCount = 1; spaceCount <= rowCount; ++spaceCount){
                    System.out.print (" ");
                }
                int limit = ((2 * quantity) - 1) - (2 * rowCount);
                System.out.print ("1");
                for (int spaceCount2 = 1; spaceCount2 <= limit; ++spaceCount2){
                    if (spaceCount2 == limit){
                        System.out.print (spaceCount2);
                    }
                    else if (spaceCount2 < limit - 1) {
                        System.out.print (" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}

