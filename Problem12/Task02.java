import java.util.Scanner;

public class Task02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[10];
        
        System.out.println ("Please enter the numbers:");
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
        }
        
        System.out.println ("Please enter the number to be displayed:");
        int viewLocation = scanner.nextInt();
        
        System.out.print (a[viewLocation]);
    }
}