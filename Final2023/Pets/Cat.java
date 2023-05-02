package Pets;

public class Cat extends Pet{
    private int miceCaught;
    public Cat(String name, String owner) {
        super(name, owner);
        miceCaught = 0;
    }

    public int getMiceCaught() {
        return miceCaught;
    }

    @Override
    public void work(int quantity) {
        try {
            if (quantity < 0)
            {
                throw new  IllegalArgumentException();
            }
            else
                miceCaught += quantity;
        }
        catch (RuntimeException ex){
            System.out.println("Illegal argument " + quantity + ": quantity cannot be negative");
        }
    }

    @Override
    public void talk() {
        System.out.println("Meow! I am " + name + "!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name=" + name +
                ", owner=" + owner +
                ", miceCaught=" + miceCaught +
                '}';
    }
}
