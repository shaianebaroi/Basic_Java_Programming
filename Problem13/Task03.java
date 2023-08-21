import java.util.Scanner;
public class Task03{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int[] a = new int [5]; 
        
        System.out.println ("Please enter a number.");
        a[0] = scanner.nextInt();
        int max = a[0]; 
        int min = a[0];
        
        for (int location = 1; location < a.length; ++location){
            System.out.println ("Please enter a number.");
            a[location] = scanner.nextInt();
        }
        int maxLocation = 0; 
        int minLocation = 0;
        for (int location = 1; location < a.length; ++location){
            if (a[location]>max) {
                max = a[location];
                maxLocation = location;
            }
            else if (a[location]<min){
                min = a[location];
                minLocation = location;
            }
        }
        System.out.println ("Smallest number " + min + " found at location " + minLocation);
        System.out.println ("Largest number " + max + " found at location " + maxLocation);
    }
}