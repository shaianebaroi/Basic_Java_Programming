import java.util.Scanner;

public class Task01 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the marks of the course.");//
        int num = sc.nextInt (); 
        int sum = num;
        int min = num;
        int max = num;        
        
        for (int count = 0; count < 9; ++count){
            System.out.println ("Please enter the marks of the course.");
            int num2 = sc.nextInt (); 
            
            if (num2 > max) {
                max = num2;
            }
            else if (num2 < min) {
                min = num2;
            }
            
            sum += num2;
        }
        int quantity = 10;
        int average = (sum / quantity); 
        
        System.out.println (average);
        System.out.println (min);
        System.out.println (max);
        System.out.println (sum);//
    }
}
