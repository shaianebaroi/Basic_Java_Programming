import java.util.Scanner;

public class Task07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the length of the first side of the triangle:");
        int x = sc.nextInt ();
                
        System.out.println ("Please enter the length of the second side of the triangle:");
        int y = sc.nextInt ();
        
        System.out.println ("Please enter the length of the third side of the triangle:");
        int z = sc.nextInt ();
        
        double s = ((x + y + z)/2.0);
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
                       
        System.out.println (area);
    }
}
    