import java.util.Scanner;

public class Task12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        
        //INPUT:
        int count = 0; 
        int evenCount = 0;
        System.out.println ("Please enter the numbers:");
        for (int location = a.length - 1; location >= 0; --location){
            a[location] = scanner.nextInt();
            if (a[location]%2 == 0) {
                ++evenCount;
                c[count] = a[location];
                b[count] = location;
                ++count;
            }
        }
        
        //FINDING AND PRINTING IN REVERSE ORDER:
        int answer = 0;
        for (int count2 = evenCount - 1; count2 >= 0; --count2){
            answer = a.length - b[count2];
            System.out.println (c[count2] + "  " + answer);
        }
    }
}
