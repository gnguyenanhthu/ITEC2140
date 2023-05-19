package ClassAssignment_5.Q2;

public abstract class Shape implements Comparable<Shape> {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public int compareTo(Shape o) {
        if (this.area() < o.area()) {
            return -1;
        }
        else if (this.area() > o.area()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
