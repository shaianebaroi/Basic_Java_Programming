import java.util.Scanner; 

public class Task09 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter number of students."); 
        int quantity = sc.nextInt();  
        
        int []marks = new int [quantity];
        int []id = new int [quantity];
        String []name = new String [quantity];
        
        //INPUT
        int sum = 0;
        for (int count = 0; count < quantity; ++count){
            
            System.out.println ("Please enter the ID of the student.");
            id[count] = sc.nextInt(); 
            
            System.out.println ("Please enter the name of the student.");
            name[count] = sc.next(); 
            
            System.out.println ("Please enter the marks of the student.");
            marks[count] = sc.nextInt(); 
            
            sum += marks[count];
        }
        int average = sum/quantity;
        
        //DISPLAY
        System.out.println("Average mark: " + average);
        for (int count = 0; count < quantity; ++count){
            System.out.println(name[count] + ": " +  marks[count]);
        }     
    }
}
