import java.util.Scanner;

public class Task07 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[10];
        
        System.out.println ("Please enter the numbers:");
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
        }
        
        for (int location = a.length - 1; location >= 0; --location){
            if (a[location] % 2 == 0){
                System.out.println (a[location]);
                break;
            }
        }
    }
}