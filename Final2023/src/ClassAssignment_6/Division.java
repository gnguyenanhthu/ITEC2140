package ClassAssignment_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        System.out.print("Enter the dividend and divisor: ");
        Scanner input = new Scanner(System.in);

        boolean readInput = true;

        do {
            try {
                int x = input.nextInt();
                int y = input.nextInt();
                int z = divide(x, y);
                System.out.printf("%d / %d = %d\n", x, y, z);
                readInput = false;
            }
            catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
                System.out.print("Enter the dividend and divisor again: ");
            }
            catch (InputMismatchException ex) {
                System.out.println("Inputs must be integers");
                System.out.print("Enter the dividend and divisor again: ");
                input.nextLine();
            }
        } while (readInput);

        System.out.println("Execution continues...");

    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("The divisor cannot be 0");
        }

        return dividend / divisor;
    }
}
