import java.util.Scanner;

public class TaskJPE04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the radius of the circle:");
        double radius = scanner.nextInt();
        
        double area = Math.PI * radius * radius; 
        
        double circumference = 2 * Math.PI * radius; 
        
        System.out.println ("Area = " + area);
        System.out.println ("Circumference = " + circumference);
    }
}