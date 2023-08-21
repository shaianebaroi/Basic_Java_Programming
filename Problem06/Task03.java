import java.util.Scanner;

public class Task03 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number.");
        int num = sc.nextInt ();
                
        int count = 0; 
        
        while (num > 0) {
            num = num/10;
            ++count;
        }
        
    System.out.println (count);
}
}
