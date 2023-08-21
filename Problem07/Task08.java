import java.util.Scanner;

public class Task08 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Please enter the quantity of the numbers to be entered:");
        int quantity = scanner.nextInt();
        int[] a = new int[quantity];
        
        System.out.println ("Please enter the numbers:");
        for (int location = 0; location < a.length; ++location){
            a[location] = scanner.nextInt();
        }
        
        //SORTING:        
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
        }    
       
        /*for (int location = 0; location < a.length; ++location){
        System.out.println (a[location] + "  "); 
        }*/
        
        //QUANTITY IS EVEN:
        if (quantity%2 == 0){
            int count = quantity/2;
            int calc = a[count] + a[count-1];
            int median = calc/2;
            System.out.println ("The median is " + median + ".");
        }
        
        //QUANTITY IS ODD:
        else {
            int count = quantity/2;
            int median = a[count];
            System.out.println ("The median is " + median + ".");
        }
    }
}
