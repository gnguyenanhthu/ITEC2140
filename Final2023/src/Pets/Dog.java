package Pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
