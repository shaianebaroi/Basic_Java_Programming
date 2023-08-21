public class Task01 {
    public static void main (String[] args){
        int[] marks = new int[] {10,30,25,50,40};
        
        //AVERAGE:
        int sum = 0;
        for (int location = 0; location < marks.length; ++location){
            sum = sum + marks[location];
        }
        
        int average = sum/marks.length-1;
        
        //SORTING:
        for (int i = 0; i <= marks.length - 2; ++i){
            int max = marks[i];
            int maxLocation = i;
            for (int location = i + 1; location < marks.length; ++location){
                if (marks[location] >  max){
                    max = marks[location];
                    maxLocation = location;
                }
            }
            int temp = marks[i];
            marks[i] = max;
            marks[maxLocation] = temp;
        }
        
        //PRINTING:
        System.out.println ("Highest Mark is " + marks[0] + ".");
        System.out.println ("Lowest Mark is " + marks[marks.length-1] + ".");
        System.out.println ("Average Mark is " + average + ".");
    }
}