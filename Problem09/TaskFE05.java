public class TaskFE05 {
    public static void main (String[] args) {
        int sum = 0;
        for (int count = 1; count <= 39; ++count){   
            if (!(count%2 == 0 || count%5 == 0)) {
                System.out.print(count + "   ");
            }
        }
    }
}