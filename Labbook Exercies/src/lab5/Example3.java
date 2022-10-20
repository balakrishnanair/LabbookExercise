package lab5;
import java.util.*;

public class Example3 {
    public static void main(String [] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        emp.setSalary(sal);
        try {
            emp.checkSalary(sal);
        }catch(EmployeeException e){
            System.out.println(e);
        }
    }
}