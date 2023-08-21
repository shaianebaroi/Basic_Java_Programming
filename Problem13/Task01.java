import java.util.Scanner;

public class Task01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[5];
        
        //INPUT:
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
        }
        
        //SORTING:
        int temp2 = 0;
        for (int i = 0; i <= a.length - 2; ++i){
            int max = a[i];
            int maxLocation = i;
            for (int location = i + 1; location < a.length; ++location){
                if (a[location] < max){
                    max = a[location];
                    maxLocation = location;
                }
            }
            int temp = a[i];
            a[i] = max;
            a[maxLocation] = temp;
            temp2 = maxLocation; 
        }
        
        //PRINTING:
        System.out.println (a[a.length - 1] + " " + temp2); 
    }
}