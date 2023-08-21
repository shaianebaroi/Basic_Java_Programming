import java.util.Scanner;

public class Task10 { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        
        System.out.println("Enter the quantity of numbers you want to enter");
        int quantity = sc.nextInt();
        
        int[]a = new int[quantity];
        
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the numbers into array");
            a[i] = sc.nextInt(); 
        }
        
        for (int j = 1; j < quantity; j++){
            if (a[j - 1] < a[j]){
            }
            else {
                x = 1;
                System.out.println("NO");
                break;
            }
        }
        
        if (x==0) {
            System.out.println("YES"); 
        }
    }
}