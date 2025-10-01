package math.geometry;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (int) Math.round(Math.PI * radius * radius);
    }
}