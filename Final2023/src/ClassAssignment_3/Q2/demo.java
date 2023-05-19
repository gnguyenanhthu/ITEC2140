package ClassAssignment_3.Q2;


import java.util.Random;

public class demo {
    public static void main(String[] args) {
        Random rand = new Random(2150);
        System.out.println(rand.nextDouble() * 1000000);
        System.out.println(rand.nextDouble() * 1000000);
    }
}
