import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner (System.in);
        int[] marks = {30, 50, 20, 10, 40};
        
        //SORTING CODE: 
        for (int i = 0; i <= marks.length - 2; ++i) { 
            int max = marks[i];
            int maxLocation = i;
            
            //CALCULATING MAX AND MAX LOCATION
            for (int location = i + 1; location < marks.length; ++location) {
                if (marks[location] > max) {
                    max = marks[location];
                    maxLocation = location;
                }
            }
            //SWAPPING
            int temp = marks[i];
            marks[i] = max;  
            marks[maxLocation] = temp;
        }
        
        //DISPLAY
        System.out.println("Please enter the number.");
        int num = sc.nextInt();
        System.out.println(marks[num]);
    }
}

