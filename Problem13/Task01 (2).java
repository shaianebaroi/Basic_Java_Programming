import java.util.Scanner;
public class Task01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        
        System.out.println ("Please enter a number.");
        a[0] = scanner.nextInt();
        int max = a[0]; 
        
        for (int count = 1; count < a.length; ++count){
            System.out.println ("Please enter a number.");
            a[count] = scanner.nextInt();
        }
        
        for (int count = 1; count < a.length; ++count){
            if (a[count] > max){
                max = a[count];
            }
        }
        
        System.out.println (max); 
    }
}