import java.util.Scanner;

public class Task13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[6];
        
        //INPUT:
        System.out.println ("Please enter the numbers:");
        for (int location = 0; location <= a.length - 1; ++location){
            a[location] = scanner.nextInt();
        }
        
        //CALCULATING THE SUM OF THE EVEN NUMBERS:
        int sumEven = 0; 
        int sumOdd = 0;
        int sumDiv = 0;
        for (int location = 0; location <= a.length - 1; ++location){
            if (a[location]%2 == 0){
                sumEven = sumEven + a[location];
            }
            
            if (a[location]%2 != 0){
                sumOdd = sumOdd + a[location];
            }
            
            if (a[location]%5 == 0){
                sumDiv = sumDiv + a[location];
            }
        }
        
        
        //PRINTING:
        System.out.println (sumEven);
        System.out.println (sumOdd);
        System.out.println (sumDiv);
    }
}

