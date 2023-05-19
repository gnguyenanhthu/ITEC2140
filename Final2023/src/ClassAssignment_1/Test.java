package ClassAssignment_1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", "Female", 20, 65));
        personList.add(new Person("Bob", "Male", 25, 70));
        personList.add(new Person("Carol", "Female", 40, 63));
        personList.add(new Person("Daniel", "Male", 40, 72));
        personList.add(new Person("Emily", "Female", 20, 64));

        System.out.println(MethodsOnPersons.averageHeight(personList, true));
        System.out.println(MethodsOnPersons.averageHeight(personList, false));
        System.out.println(MethodsOnPersons.eldest(personList));
    }
}
