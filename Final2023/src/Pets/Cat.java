package Pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
