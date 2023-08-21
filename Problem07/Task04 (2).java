//FORMALITIES

public class Task04 {
    public static void main (String [] args) {
        
        //DECLARING ARRAY
        int []marks = new int [] {10,30,20,50,40}; 
        
        //FINDING MAX AND LOCATION
        int maxLocation = 0; 
        int location = 0;
        int max = marks[0];
        for (int i = 0; i < marks.length; ++i){
            if (marks[i] > max) {
                max = marks[i];
                maxLocation = i; 
            }
        } 
        //SWAPPING
        marks[maxLocation] = marks[0];
        marks[0] = max;        
        
        //DISPLAY
        for (int i = 0; i < marks.length; ++i){
            System.out.print (marks[i] + ", ");
        }
    }
}
