import java.util.Scanner;

public class Task06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[] {50,30,20,10,40};
        
        //QUANTITY INPUT:
        System.out.println ("Please enter a number.");
        int quantity = scanner.nextInt();
        
        //SORTING:        
        for (int i = 0; i <= a.length - 2; ++i){
            int max = a[i];
            int maxLocation = i;
            for (int location = i + 1; location < a.length; ++location){
                if (a[location] > max){
                    max = a[location];
                    maxLocation = location;
                }
            }
            int temp = a[i];
            a[i] = max;
            a[maxLocation] = temp;
        }    
        
        //PRINTING:        
        System.out.println (a[quantity] + "  ");
    }
}
    
    
    
