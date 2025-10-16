package math.geometry;

public class Triangle extends AbstractShape implements InterfaceCalculateArea {
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

    @Override
    public void returnArea() {
        System.out.println("Triangle area is: " + (base * height) / 2);
    }
}

