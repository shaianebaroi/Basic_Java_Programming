public class Employee{
    String name;
    double salary;
    //METHOD:
    double increaseSalary(int percentage){
        double temp = (percentage/100) * salary;
        double temp2 = temp + salary;
        salary = temp2;
        return salary;
    }
}
