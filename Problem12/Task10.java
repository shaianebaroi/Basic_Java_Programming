import java.util.Scanner;

public class Task10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[10];
        
        System.out.println ("Please enter the numbers:");
        //INPUT:
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
            //PRINT:
            for (int location2 = 0; location2 <= location; ++location2){
                System.out.print (a[location2] + "  ");
            }
            System.out.println (" ");
        }
    }
}
