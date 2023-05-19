package Demo;

import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(x);

        System.out.println("Execution continues here...");
    }
}
