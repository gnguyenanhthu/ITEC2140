package ClassAssignment_6.Shapes;

import java.util.*;

public class CircleTest {

    public static void main(String[] args) {

        ArrayList<Integer> radii = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        Random rand = new Random(2150);
        for (int i = 0; i < 10; i++) {
            radii.add(rand.nextInt(20) - 10);
        }
        System.out.println(radii);
        System.out.println();

        for (int radius : radii) {
            try {
                circles.add(new Circle("red", radius));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println();

        System.out.println(circles);
    }

}
