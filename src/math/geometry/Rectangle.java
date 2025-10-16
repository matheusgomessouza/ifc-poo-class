package math.geometry;

public class Rectangle implements InterfaceCalculateArea {
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void returnArea() {
        System.out.println("Rectangle area is: " + base * height);
    }
}
