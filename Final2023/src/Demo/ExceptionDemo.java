package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.printf("%d / %d = %d\n", x, y, x / y);

        System.out.println("Execution continues here...");
    }
}
