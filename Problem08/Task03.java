import java.util.Scanner;

public class Task03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the radius of the circle:");
        double radius = scanner.nextInt();
        
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius; 
        
        System.out.println (area);
        System.out.println (circumference);
    }
}
