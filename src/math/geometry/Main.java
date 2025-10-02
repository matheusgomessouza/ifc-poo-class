package math.geometry;

public class Main {
    static void main() {
        AbstractShape circle = new Circle(5);
        AbstractShape square = new Square(4);
        AbstractShape triangle = new Triangle(6, 3);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());

        AbstractShape.showObjectCount();
    }
}
