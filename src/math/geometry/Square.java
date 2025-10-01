package math.geometry;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
