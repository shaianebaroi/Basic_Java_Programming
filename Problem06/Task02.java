public class Task02 {
    public static void main (String [] args){
        
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = 0; 
        
        System.out.println (firstNum);
        System.out.println (secondNum);
        
        while (thirdNum < 1600){
            thirdNum = firstNum + secondNum;
            if (thirdNum > 1600){
                break;
            }
            System.out.println (thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
            ++thirdNum;
            
        } 
    }
}


