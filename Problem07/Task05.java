import java.util.Scanner;

public class Task05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int[] a = new int[] {50,30,20,10,40};
                
        //SORTING:               
            int max = a[1];
            int maxLocation = 1;
            for (int location = 1; location < a.length; ++location){
                if (a[location] > max){
                    max = a[location];
                    maxLocation = location;
                }
            }
            int temp = a[1];
            a[1] = max;
            a[maxLocation] = temp;
                        
        //PRINTING:        
        for (int location = 0; location < a.length; ++location){
            System.out.print (a[location] + "  ");
        }
    }
}