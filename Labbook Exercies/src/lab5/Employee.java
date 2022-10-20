package lab5;

public class Employee {
	 int EmpId;
	    String name;
	    double salary;
	    public Employee(){}


	    public double getSalary() {
	        return salary;
	    }


	    public void setSalary(double salary) {
	        this.salary = salary;
	    }


	    public void checkSalary(double sal) throws EmployeeException {
	        if(sal<3000) {
	            throw new EmployeeException("Salary is below 3000");
	        }else {
	            System.out.println("Salary above 3000");
	        }
	    }
}
