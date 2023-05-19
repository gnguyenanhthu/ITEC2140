package Pets;

public abstract class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void talk();
}
