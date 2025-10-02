package math.geometry;

public class Square extends AbstractShape {
    private final double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
