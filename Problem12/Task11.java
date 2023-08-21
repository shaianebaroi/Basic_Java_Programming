import java.util.Scanner;

public class Task11{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[10];
        
        System.out.println ("Please enter the numbers:");
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
            
            //VERIFICATION:
            for (int location2 = 0; location2 < location; ++location2){
                if (a[location] == a[location2]){
                    --location;
                    System.out.println ("Duplicate is found. Please enter another number.");
                }
            }
        }
    }
}