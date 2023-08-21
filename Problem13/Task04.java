import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5]; 
        
        //INPUT:
        for (int location = 0; location < a.length; ++location){
            System.out.println ("Please enter a number.");
            a[location] = scanner.nextInt();
        }
        
        //SORTING:
        for (int count = 0; count <= a.length - 2; ++count) { 
            int min = a[count];
            int minLocation = count;
                        
            for (int location = count + 1; location < a.length; ++location) {
                if (a[location] < min) {
                    min = a[location];
                    minLocation = location;
                }
            }          
            int temp = a[count];
            a[count] = min;  
            a[minLocation] = temp;
        }
               
        for (int location = 0; location < a.length; ++location) {
            System.out.print(a[location] + ", ");
        }
    }
}
