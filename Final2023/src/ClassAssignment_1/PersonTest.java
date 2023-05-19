package ClassAssignment_1;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);
        person1.setName("Alice");
        person1.setGender("Female");
        person1.setAge(-1);
        person1.setAge(0);
        person1.setHeight(0);
        person1.setHeight(20);
        System.out.println(person1);

        Person person2 = new Person("Bob", "Male", 15, 65);
        System.out.println(person2);

        person1.grow(0, 10);
        person2.grow(3, -1);

        person1.grow(1, 10);
        person2.grow(3, 5);
        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.talk());
        System.out.println(person2.talk());
    }
}
