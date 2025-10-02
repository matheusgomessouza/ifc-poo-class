package math.geometry;

public class Triangle extends AbstractShape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}

