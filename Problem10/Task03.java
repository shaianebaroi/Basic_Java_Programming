public class Task03 {
    public static void main (String[] args) {
        int sum = 0;
        for (int count = 1; count <= 600; ++count){   
            if (count%7 == 0 || count%9 == 0){
                //System.out.print (count + "  ");
                sum = sum + count;
            }
        } 
        System.out.println (sum);
    }
}