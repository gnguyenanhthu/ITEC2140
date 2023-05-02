package Pets;

public abstract class Pet {
    private static int numPets;

    protected int id;
    protected String name;
    protected String owner;

    public static int getNumPets() {
        return numPets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Pet(String name, String owner) {
        ++numPets;
        id = numPets;
        this.name = name;
        this.owner = owner;
    }

    public abstract void work(int quantity);
    public abstract void talk();
}
