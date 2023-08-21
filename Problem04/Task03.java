import java.util.Scanner;

public class Task03 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the height of the rectangle:");
        int height = sc.nextInt ();
                
        System.out.println ("Please enter the width of the rectangle:");
        int width = sc.nextInt ();
        
        int area = (height * width);
        
        System.out.println (area);
        }
}
       