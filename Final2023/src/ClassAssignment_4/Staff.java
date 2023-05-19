package ClassAssignment_4;

public class Staff extends Employee {
    public Staff(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public String toString() {
        return String.format("Staff{name=%s, department=%s, salary=%.2f}", name, department, salary);
    }
}
