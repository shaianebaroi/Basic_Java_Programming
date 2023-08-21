//FORMALITIES

public class Task05 {
    public static void main (String [] args) {
        
        //DECLARING ARRAY
        int []marks = new int [] {50, 30, 20, 10, 40}; 
        
        //FINDING MAX AND LOCATION
        int maxLocation = 1; 
        int location = 1;
        int max = marks[1];
        for (int i = 1; i < marks.length; ++i){
            if (marks[i] > max) {
                max = marks[i];
                maxLocation = i; 
            }
        } 
        //SWAPPING
        marks[maxLocation] = marks[1];
        marks[1] = max;        
        
        //DISPLAY
        for (int i = 0; i < marks.length; ++i){
            System.out.print (marks[i] + ", ");
        }
    }
}
