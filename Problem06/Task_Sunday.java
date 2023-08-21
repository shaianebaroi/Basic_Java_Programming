import java.util.Scanner;

public class Sunday {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
        
        int count = 0; 
        
        while (!(num == 0)) {
            int num2 = num/10;
            ++count;
        }
        System.out.println ("The number of digits is " + count);
        
        int product = 10;
        while (!(count == 2)) {
            product = product * 10;
            --count;
        }        
        System.out.println ("The product of digits is " + product);                 
    }
}














