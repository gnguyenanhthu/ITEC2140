package ClassAssignment_4;

import java.util.ArrayList;

public class GrizzlyTest {

    public static void main(String[] args) {
        Faculty alice = new Faculty("Alice", "ITEC", 100000);
        Staff bob = new Staff("Bob", "Registrar", 70000);

        Grizzly grizzly;

        grizzly = alice;
        System.out.println(grizzly);
        grizzly = bob;
        System.out.println(grizzly);
        System.out.println();

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(alice);
        employees.add(bob);
        employees.add(new Staff("Carol", "Financial Services", 80000));
        employees.add(new Faculty("Daniel", "Business", 110000));

        System.out.println(employees);
        System.out.println();

        Student emily = new Student("Emily", "ITEC");
        ArrayList<Grizzly> grizzlies = new ArrayList<>(employees);
        grizzlies.add(emily);
        grizzlies.add(new Student("Fred", "Math"));
        grizzlies.add(new Student("Greg", "ITEC"));

        System.out.println(grizzlies);
        System.out.println();

        raiseAll(employees, 0.1);
        System.out.println(employees);

        System.out.println(itecGrizzlies(grizzlies));
        System.out.println(numItecGrizzlies(grizzlies));


    }

    public static void raise(Employee employee, double rate) {
        double newSalary = employee.getSalary() * (1 + rate);
        employee.setSalary(newSalary);
    }

    public static void raiseAll(ArrayList<Employee> employees, double rate) {
        for (Employee employee : employees) {
            raise(employee, rate);
        }
    }

    public static ArrayList<Grizzly> itecGrizzlies(ArrayList<Grizzly> grizzlies) {
        ArrayList<Grizzly> itecGrizzlies = new ArrayList<>();

        for (Grizzly grizzly : grizzlies) {
            if ((grizzly instanceof Student && ((Student) grizzly).getMajor().equals("ITEC")) ||
                    (grizzly instanceof Faculty && ((Faculty) grizzly).getDepartment().equals("ITEC"))) {
                itecGrizzlies.add(grizzly);
            }
        }

        return itecGrizzlies;
    }

    public static int numItecGrizzlies(ArrayList<Grizzly> grizzlies) {
        return itecGrizzlies(grizzlies).size();
    }

    public static int numItecGrizzlies_2(ArrayList<Grizzly> grizzlies) {
        int count = 0;

        for (Grizzly grizzly : grizzlies) {
            if ((grizzly instanceof Student && ((Student) grizzly).getMajor().equals("ITEC")) ||
                    (grizzly instanceof Faculty && ((Faculty) grizzly).getDepartment().equals("ITEC"))) {
                count += 1;
            }
        }

        return count;
    }

}
