import java.util.Scanner;

public class Task01{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Please enter the name of your favorite car:");
        String name = scanner.nextLine();
        
        System.out.println ("Please enter a number:");
        int quantity = scanner.nextInt();
        
        for (int count = 1; count <= quantity; ++count){
            System.out.println (name);
        }
    }
}