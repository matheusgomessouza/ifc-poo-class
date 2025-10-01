import math.geometry.Circle;
import math.geometry.Shape;
import math.geometry.Square;
import math.geometry.Triangle;

void main() {
    Shape circle = new Circle(5);
    Shape square = new Square(4);
    Shape triangle = new Triangle(6, 3);

    System.out.println("Circle area: " + circle.calculateArea());
    System.out.println("Square area: " + square.calculateArea());
    System.out.println("Triangle area: " + triangle.calculateArea());

    Shape.showObjectCount();
}


