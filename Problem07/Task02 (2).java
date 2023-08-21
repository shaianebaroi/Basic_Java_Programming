//FORMALITIES

public class Task02 {
    public static void main (String [] args) {
        
        //DECLARING ARRAY
        int []marks = new int [] {10,30,20,50,40}; 
        
        int max = marks[0];
        int min = marks[0];
        
        //FINDING AVERAGE
        int sum = 0;
        for (int i = 0; i < marks.length; ++i){
            sum = sum + marks[i];
        }
        int average = sum/marks.length;
        
        //FINDING THE NUMBER OF PEOPLE ABOVE AVERAGE
        int count = 0;
        for (int i = 0; i < marks.length; ++i){
            if (marks[i] > average) {
                ++count;
            }
        }
        System.out.println (count + " students are better than average.");
        
        //FINDING THE MARKS ABOVE AVERAGE
        System.out.println ("They received the following marks:");
        for (int i = 0; i < marks.length; ++i){
            if (marks[i] > average) {                
                System.out.println (marks[i]);
            }
        }
        
    }
}
