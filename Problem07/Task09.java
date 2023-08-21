import java.util.Scanner;

public class Task09 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Please enter the number of students:");
        int quantity = scanner.nextInt();
        
        int[] a = new int[quantity]; //IDS
        String[] b = new String[quantity]; //NAME        
        double[] c = new double[quantity]; //MARKS        
        
        for (int location = 0; location < a.length; ++location){
            System.out.println ("Please enter the ID of students:");
            a[location] = scanner.nextInt();       
            
            System.out.println ("Please enter the name of students:");
            b[location] = scanner.next();
            
            System.out.println ("Please enter the marks of students:");
            c[location] = scanner.nextDouble();
        }
        
        //FOR CALCULATING AVERAGE MARKS:
        double sum = 0;
        for (int location = 0; location < c.length; ++location){
            sum = sum + c[location];
        }
        double average = sum/quantity;
        
        //FOR PRINTING:
        System.out.println ("Average mark: " + average);
        for (int location = 0; location < a.length; ++location){
            System.out.println (b[location] + " : " + c[location]);
        }
    }
}
