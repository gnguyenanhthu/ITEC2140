package Demo;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        try {
            int z = divide(x, y);
            System.out.printf("%d / %d = %d\n", x, y, z);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Execution continues here...");

    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            // ArithmeticException exception = new ArithmeticException("Cannot divide by 0");
            // throw exception;

            throw new ArithmeticException("Cannot divide by 0");
        }

        return dividend / divisor;
    }
}
