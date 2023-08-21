import java.util.Scanner;

public class Task05 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter the number of seconds:");
        int num = sc.nextInt ();
                
        int hour = (num/3600);
        int min = ((num%3600)/60);
        int sec = ((num%3600)%60);
            
        System.out.println (hour + "hr " + min + "min " + sec + "sec.");
        }
}
       