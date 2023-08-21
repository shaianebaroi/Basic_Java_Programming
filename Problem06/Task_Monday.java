import java.util.Scanner;

public class Monday {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int count = 0; 
        System.out.println ("Please enter a number.");
        int num = sc.nextInt ();
                
        while (!(num == 0)) {
            int num2 = num/10;
            ++count;
        }
        
        System.out.println ("The number of digits are" + count);
        
    }
}

