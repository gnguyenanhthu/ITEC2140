package ClassAssignment_8;

import java.util.ArrayList;
import java.util.Random;

public class FindIndexTest {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Random rand = new Random(2150);
        int n = 10;
        for (int i = 0; i < n; i++) {
            intList.add(rand.nextInt(n));
        }
        System.out.println(intList);

        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + MyGenerics.findIndices(intList, i));
        }
        System.out.println();

        ArrayList<String> strList = new ArrayList<>();
        strList.add(new String("red"));
        strList.add(new String("green"));
        strList.add(new String("blue"));
        strList.add(new String("red"));
        strList.add(new String("green"));
        strList.add(new String("blue"));
        System.out.println(strList);

        System.out.println("red : " + MyGenerics.findIndices(strList, new String("red")));
        System.out.println("green : " + MyGenerics.findIndices(strList, new String("green")));
        System.out.println("blue : " + MyGenerics.findIndices(strList, new String("blue")));
        System.out.println("yellow : " + MyGenerics.findIndices(strList, new String("yellow")));
        System.out.println();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("red", 1));
        shapes.add(new Circle("green", 1));
        shapes.add(new Circle("blue", 1));
        shapes.add(new Rectangle("red", 1, 1));
        shapes.add(new Rectangle("green", 1, 1));
        shapes.add(new Rectangle("blue", 1, 1));
        shapes.add(new Circle("red", 2));
        shapes.add(new Circle("green", 2));
        shapes.add(new Circle("blue", 2));
        shapes.add(new Rectangle("red", 2, 1));
        shapes.add(new Rectangle("green", 2, 1));
        shapes.add(new Rectangle("blue", 2, 1));
        shapes.add(new Circle("red", 1));
        shapes.add(new Circle("green", 1));
        shapes.add(new Circle("blue", 1));
        shapes.add(new Rectangle("red", 1, 1));
        shapes.add(new Rectangle("green", 1, 1));
        shapes.add(new Rectangle("blue", 1, 1));
        shapes.add(new Circle("red", 2));
        shapes.add(new Circle("green", 2));
        shapes.add(new Circle("blue", 2));
        shapes.add(new Rectangle("red", 2, 1));
        shapes.add(new Rectangle("green", 2, 1));
        shapes.add(new Rectangle("blue", 2, 1));
        System.out.println(shapes);

        System.out.println("red circle, radius 1: " + MyGenerics.findIndices(shapes, new Circle("red", 1)));
        System.out.println("green rectangle, 2, 1: " + MyGenerics.findIndices(shapes, new Rectangle("green", 2, 1)));
        System.out.println("blue circle, radius 10: " + MyGenerics.findIndices(shapes, new Circle("blue", 10)));


    }

}
