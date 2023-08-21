public class Task08 {
    public static void main(String[] args){ 
        int sum = 0;
        for (int count = 1; count <= 600; ++count){
            if (count%7==0 || count%9==0){
                sum = sum + count;
            }
        }
        
        //PRINTING:
        System.out.println("The sum of y is " + sum + ".");
    }
}

