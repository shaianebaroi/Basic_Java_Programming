public class Task04 {
    public static void main (String[] args){
        int[] a = new int[] {10,30,20,50,40};
        
        //SORTING:
        
        int max = a[0];
        int maxLocation = 0;
        for (int location = 0; location < a.length; ++location){
            if (a[location] > max){
                max = a[location];
                maxLocation = location;
            }
        }
        int temp = a[0];
        a[0] = max;
        a[maxLocation] = temp;
        
        //PRINTING:
        
        for (int location = 0; location < a.length; ++location){
            System.out.print (a[location] + "  ");
        }
    }
}