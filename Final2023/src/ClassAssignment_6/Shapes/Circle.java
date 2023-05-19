package ClassAssignment_6.Shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);

        if (radius < 0) {
            String str = String.format("Invalid input %.1f: the radius of a circle cannot be negative", radius);
            throw new IllegalArgumentException(str);
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
