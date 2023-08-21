public class Task12 {
    public static void main (String [] args){
        
        //FIGURING FACTORS:
        int n = 2;
        int count = 0; 
        int m = 1;
        int num = n;
        
        while (n < 1000) {
            while (m <= num){
                if (num % m ==0) {
                    ++count;
                }
                else {
                    ++m; 
                }
            }
            if (count == 2) {
                System.out.println (num);
            }
            else {
                ++n;
            }
            
        }
    }
}