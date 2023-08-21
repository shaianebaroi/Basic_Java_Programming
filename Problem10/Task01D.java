public class Task01D {
    public static void main (String[] args) {
        for (int count = 2; count <= 7; ++count){   
            int num = 1;
            
            if (count%2 == 0){
                num = count * 9;
            } 
            
            else if (count%2 != 0){
                num = count * -9;
            }
            
            System.out.print (num + "  ");
        } 
    }
}