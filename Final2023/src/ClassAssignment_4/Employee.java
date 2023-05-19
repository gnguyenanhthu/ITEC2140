package ClassAssignment_4;

public class Employee extends Grizzly {
    protected String department;
    protected double salary;

    public Employee(String name, String department, double salary) {
        super(name);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
