//Formalities
import java.util.*;

public class Double_Row_Array_User_Input {
    public static void main (String [] args){
        int [][]a = new int [2][2]; 
        
        //FOR USER INPUT:
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < 2; ++i){
            for (int j = 0; j < 2; ++j){
                a[i][j] = sc.nextInt();
            }
        }
        
        //FOR DISPLAY:
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j){ 
                System.out.print (a[i][j] + "    ");
            }
            System.out.println ();
        }
    }
}