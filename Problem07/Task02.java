public class Task02 {
    public static void main (String[] args){
        int[] marks = new int[] {10,30,25,50,40};
        
        //AVERAGE:
        int sum = 0;
        for (int location = 0; location < marks.length; ++location){
            sum = sum + marks[location];
        }
        
        int average = sum/marks.length-1;
        
        //COUNTING THE NUMBER OF STUDENTS:
        int studentCount = 0;
        for (int location = 0; location < marks.length; ++location){
            if (marks[location] > average){
                ++studentCount;
            }
        }
        System.out.println (studentCount + " students are better than average.");
        
        //CALCULATING MARKS:
        System.out.println ("They received the following marks:");
        for (int location = 0; location < marks.length; ++location){
            if (marks[location] > average){
                System.out.println (marks[location] + "  ");
            }
        }
    }
}
