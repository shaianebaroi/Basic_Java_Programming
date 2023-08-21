import java.util.Scanner;

public class Task05{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        
        //INPUT:
        for (int count = 0; count < a.length; ++count){
            System.out.println ("Please enter a number.");
            a[count] = scanner.nextInt();
        } 
        
        //SORTING:
        for (int count = 0; count <= a.length - 2; ++count){
            int max = a[count];
            int maxLocation = count;
            
            for (int location = count+1; location < a.length; ++location){
                if (a[location] > max){
                    max = a[location];
                    maxLocation = location;
                }
            }
            
            int temp = a[count];
            a[count] = max;
            a[maxLocation] = temp;
        }
        
        //DISPLAY:
        for (int count = 0; count < a.length; ++count){
            System.out.println (a[count]);
        }
    }
}