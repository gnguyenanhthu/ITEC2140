package ClassAssignment_7;

public class Division {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        int z;

        try {
            z = x / y;
            System.out.println(z);
        }
        catch (ArithmeticException ex) {
            ex.printStackTrace();
        }

        System.out.println("Execution continues...");
    }
}
