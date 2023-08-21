//FORMALITIES

public class Task01 {
    public static void main (String [] args) {
        
        //DECLARING ARRAY
        int []marks = new int [] {10,30,20,50,40}; 
        
        int max = marks[0];
        int min = marks[0];
        
        //FINDING MAXIMUM
        int sum = 0;
        for (int i = 0; i < marks.length; ++i){
            if (marks[i] > max){
                max = marks[i];
            }
            else if (marks[i] < min){
                min = marks[i];
            }
            sum = sum + marks[i];
        }
        
        int average = sum/marks.length;
        System.out.println ("Highest mark is " + max);
        System.out.println ("Lowest mark is " + min);
        System.out.println ("Average is " + average);            
    }
}
