import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
                
        for (int count = 40; count <= 50; ++ count){
            int divCount = 0;
            for (int count2 = 1; count2 <= count; ++count2 ){
                if (count%count2 == 0) {
                    ++divCount;
                }
            }
            if (divCount == 2){
                System.out.print (count + "  ");
            }            
        }
    }
}