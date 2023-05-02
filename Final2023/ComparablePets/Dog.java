package ComparablePets;

public class Dog extends Pet {
    private int sheepHerded;
    public Dog(String name, String owner) {
        super(name, owner);
        sheepHerded = 0;
    }

    public int getSheepHerded() {
        return sheepHerded;
    }

    @Override
    public void work(int quantity) {
        try {
            if (quantity < 0)
            {
                throw new  IllegalArgumentException();
            }
            else
                sheepHerded += quantity;
        }
        catch (RuntimeException ex){
            System.out.println("Illegal argument " + quantity + ": quantity cannot be negative");
        }
    }

    @Override
    public void talk() {
        System.out.println("Woof! I am " + name + "!");
    }

    @Override
    public int getWork() {
        return getSheepHerded();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name=" + name +
                ", owner=" + owner +
                ", sheepHerded=" + sheepHerded +
                '}';
    }
}
