package math.geometry;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (int) Math.round(Math.PI * radius * radius);
    }
}