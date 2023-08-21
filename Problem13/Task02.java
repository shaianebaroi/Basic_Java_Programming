import java.util.Scanner;
public class Task02{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int[] a = new int [5]; 
        
        System.out.println ("Please enter a number.");
        a[0] = scanner.nextInt();
        int max = a[0]; 
        
        for (int location = 1; location < a.length; ++location){
            System.out.println ("Please enter a number.");
            a[location] = scanner.nextInt();
        }
        int maxLocation = 0; 
        for (int location = 1; location < a.length; ++location){
            if (a[location]>max) {
                max = a[location];
                maxLocation = location;
            }
        }
        System.out.println (max);
        System.out.println (maxLocation);
    }
}