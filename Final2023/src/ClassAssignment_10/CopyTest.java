package ClassAssignment_10;

import java.util.ArrayList;

public class CopyTest {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            intList.add(i);
        }
        System.out.println(intList);

        ArrayList<Integer> intListCopy = MyGenerics.shallowCopy(intList);
        System.out.println(intListCopy);
        System.out.println();

        for (int i = 0; i < n; i++) {
            intListCopy.set(i, 2 * intListCopy.get(i));
        }

        System.out.println(intList);
        System.out.println(intListCopy);
        System.out.println();

        ArrayList<Circle> circles = new ArrayList<>();
        for (int i = 0; i < n/2; i++) {
            circles.add(new Circle("red", i));
        }
        System.out.println(circles);

        ArrayList<Circle> circlesCopy = deepCopy(circles);
        System.out.println(circlesCopy);
        System.out.println();

        for (int i = 0; i < n/2; i++) {
            circlesCopy.get(i).setColor("blue");
            circlesCopy.get(i).setRadius(2*i);
        }

        System.out.println(circles);
        System.out.println(circlesCopy);
        System.out.println();
    }

    public static ArrayList<Circle> deepCopy(ArrayList<Circle> original) {
        ArrayList<Circle> copy = new ArrayList<>();
        for (Circle circle : original) {
            Circle newCircle = new Circle(circle.getColor(), circle.getRadius());
            copy.add(newCircle);
        }

        return copy;
    }
}
