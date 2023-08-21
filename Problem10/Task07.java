import java.util.Scanner;

public class Task07 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the quantity of the numbers to be enterred:");
        int quantity = scanner.nextInt();
        
        int[] a = new int[quantity];
        
        //INPUT:
        System.out.println ("Please enter the numbers:");
        for (int count = 0; count < quantity; ++count){
            a[count] = scanner.nextInt();
        } 
        
        //SORTING STARTS:
        for (int i = 0; i <= a.length - 2; ++ i){
            int max = a[i];
            int maxLocation = i;
            for (int location = i + 1; location < a.length; ++location){
                if (a[location] > max){
                    max = a[location];
                    maxLocation = location;
                }
            }
            //SWAPPING:
            int temp = a[i];
            a[i] = max;
            a[maxLocation] = temp;
        }
        
        //PRINTING THE MAXIMUM AND MINIMUM:
        System.out.println ("The maximum number is " + a[0]);
        System.out.println ("The maximum number is " + a[a.length-1]);
        
        //FOR CALCULATING AVERAGE:
        int sum = 0;
        for (int location = 0; location < a.length; ++location){
            sum = sum + a[location];
        }
        int average = sum / quantity;
        System.out.println ("The average is " + average);
    }
}