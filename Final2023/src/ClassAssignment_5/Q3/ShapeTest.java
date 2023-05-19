package ClassAssignment_5.Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShapeTest {

    public static void main(String[] args) {
        Circle circle = new Circle("red", 10);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle("green", 20, 10);
        System.out.println(rectangle);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println();

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        Random rand = new Random(2150);

        shapes.add(new Circle("red", rand.nextInt(20) + 1));
        shapes.add(new Circle("green", rand.nextInt(20) + 1));
        shapes.add(new Circle("blue", rand.nextInt(20) + 1));
        shapes.add(new Rectangle("red", rand.nextInt(60) + 1, rand.nextInt(30) + 1));
        shapes.add(new Rectangle("green", rand.nextInt(60) + 1, rand.nextInt(30) + 1));
        shapes.add(new Rectangle("blue", rand.nextInt(60) + 1, rand.nextInt(30) + 1));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
            System.out.println();
        }

        Shape maxAreaShape = maxAreaShape(shapes);
        System.out.println(maxAreaShape);
        System.out.println(maxAreaShape.area());
        System.out.println();

        maxAreaShape = maxAreaShape2(shapes);
        System.out.println(maxAreaShape);
        System.out.println(maxAreaShape.area());
        System.out.println();

        Collections.sort(shapes);

        System.out.println(shapes);
    }

    public static Shape maxAreaShape(ArrayList<Shape> shapes) {
        Shape maxAreaShape = null;
        double maxArea = 0;

        for (Shape shape : shapes) {
            double area = shape.area();
            if (area > maxArea) {
                maxArea = area;
                maxAreaShape = shape;
            }
        }

        return maxAreaShape;
    }

    public static Shape maxAreaShape2(ArrayList<Shape> shapes) {
        Shape maxAreaShape = new Circle("red", 0);

        for (Shape shape : shapes) {
            if (shape.compareTo(maxAreaShape) > 0) {
                maxAreaShape = shape;
            }
        }

        return maxAreaShape;
    }

}
