package math.geometry;

public class Circle extends AbstractShape implements InterfaceCalculateArea {
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (int) Math.round(Math.PI * radius * radius);
    }

    @Override
    public void returnArea() {
        System.out.println("Circle area is: " + Math.round(Math.PI * radius * radius));
    }
}