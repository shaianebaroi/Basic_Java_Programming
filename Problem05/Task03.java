import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[7];
        
        //FOR INPUT: 
        System.out.println ("Please enter the numbers.");
        for (int location = 0; location < a.length; ++location){
            a[location] = scanner.nextInt();
        }         
        
        //FOR SORTING MAXIMUM:
        for (int i = 0; i <= a.length - 2; ++i) {
            int max = a[i];
            int maxLocation = i;
            for (int location = i + 1; location < a.length; ++location) {
                if (a[location] < max) {
                    max = a[location];
                    maxLocation = location;
                }
            }
            int temp = a[i]; 
            a[i] = max;  
            a[maxLocation] = temp;
        }
        
        // FOR CALCULATING AVERAGE:
        int sum = 0;
        for (int location = 0; location < a.length; ++location){
            sum = sum + a[location];
        }
        int average = sum/a.length;
        
        //PRINTING:
        System.out.println("The maximum number is " + a[a.length-1] + ".");
        System.out.println("The average of the numbers is " + average + ".");
    }
}

