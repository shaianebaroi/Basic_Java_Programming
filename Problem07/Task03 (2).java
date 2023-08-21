//FORMALITIES

public class Task03 {
    public static void main (String [] args) {
        
        //DECLARING ARRAY
        int []marks = new int [] {10,30,20,50,40}; 
        
        //FINDING MAX AND LOCATION
        int location = 0;
        int max = marks[0];
        for (int i = 0; i < marks.length; ++i){
            if (marks[i] > max) {
                max = marks[i];
                location = i; 
            }
        } 
        System.out.println ("Largest number is " + max);
        System.out.println ("Largest number was found at location " + location); 
    }
}
