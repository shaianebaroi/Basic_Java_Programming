import java.util.Scanner;

public class Task10 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the name of your favorite car:");
        String name = sc.next();
        
        System.out.println (name + " "  + name + " " + name + " " + name);
    }
}
