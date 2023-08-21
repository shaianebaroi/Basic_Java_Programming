public class Task07 {
    public static void main(String[] args) { 
        int[]marks = {30, 50, 20, 10, 40};
        
        //SORTING:          
        for (int i = 0; i <= marks.length - 2; ++i) { 
            int max = marks[i];
            int maxLocation = i;
            
            //MAX AND MAX LOCATION
            for (int location = i + 1; location < marks.length; ++location) {
                if (marks[location] > max) {
                    max = marks[location];
                    maxLocation = location;
                }
            }
            
            //SWAPPING
            int temp = marks[i];
            marks[i] = max;  
            marks[maxLocation] = temp;
        }
        
        int location = 0;
        while (location < marks.length) {
            System.out.print(marks[location] + ", ");
            ++location;
        }
    }
}
