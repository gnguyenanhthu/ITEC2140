package ClassAssignment_1;

import java.util.ArrayList;

public class MethodsOnPersons {

    public static double averageHeight(ArrayList<Person> personList, boolean female) {
        String gender = female ? "Female" : "Male";
        double totalHeight = 0;
        int numPersons = 0;

        for (Person person : personList) {
            if (person.getGender().equals(gender)) {
                totalHeight += person.getHeight();
                numPersons += 1;
            }
        }

        return totalHeight / numPersons;
    }

    public static ArrayList<Person> eldest(ArrayList<Person> personList) {
        int maxAge = -1;
        ArrayList<Person> eldestPersons = new ArrayList<>();

        for (Person person: personList) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                eldestPersons.clear();
                eldestPersons.add(person);
            }
            else if (person.getAge() == maxAge) {
                eldestPersons.add(person);
            }
        }

        return eldestPersons;

    }
}
