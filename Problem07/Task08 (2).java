import java.util.Scanner; 

public class Task08 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter number of students."); 
        int quantity = sc.nextInt();  
        
        int []a = new int [quantity];
        
        //INPUT
        for (int count = 0; count < a.length; ++count){
            System.out.println ("Please enter a number.");
            a[count] = sc.nextInt(); 
        }
        
        //SORTING
        for (int j = 0; j <= a.length - 2; ++j) {
            int min = a[j];
            int minLocation = j;
            
            for (int location = j + 1;location < a.length; ++location) {
                if (a[location] < min) {
                    min = a[location];
                    minLocation = location;
                }
            }
            
            a[minLocation] = a[j];
            a[j] = min;
        }
        
        //ODD OR EVEN
        
        if (a.length%2==0){
            int u = (a.length/2);
            int l = (a.length/2) - 1;
            int median = (a[u] + a[l])/2; 
            System.out.println(median);
        }
        
        else if (a.length%2==1) {
            int median = (a.length/2);
            System.out.println(a[median]);
        }     
    }
}
