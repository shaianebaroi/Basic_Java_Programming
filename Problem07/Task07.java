public class Task07 {
    public static void main (String[] args){
        int[] marks = new int[] {10,30,25,50,40};
        
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
        for (int location = 0; location < marks.length; ++location){
            System.out.print(marks[location] + "  "); 
            
        }
    }
}