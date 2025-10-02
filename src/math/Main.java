package math;

public class Main {
    static void main() {
        MathOperation add = new Addition();
        MathOperation subtract = new Subtraction();
        MathOperation multiply = new Multiplication();
        MathOperation divide = new Division();

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
        System.out.println("Division: " + divide.calculate(10, 5));

        // Create points using different constructors
        Point2D origin = new Point2D();
        Point2D sameValue = new Point2D(5);
        Point2D custom = new Point2D(3, 4);

        // Show initial states
        System.out.println("Origin: " + origin);
        System.out.println("SameValue: " + sameValue);
        System.out.println("Custom: " + custom);

        // Move point to new coordinates
        custom.movePoint(10, 15);
        System.out.println("Custom moved to: " + custom);

        // Move point to another point
        origin.movePoint(sameValue);
        System.out.println("Origin moved to SameValue: " + origin);

        // Calculate distance between points
        double distance = custom.calculateDistance(origin);
        System.out.println("Distance from Custom to Origin: " + distance);

        // Check equality
        boolean isEqual = origin.isEqual(sameValue);
        System.out.println("Origin equals SameValue? " + isEqual);

        // Clone a point
        Point2D clone = custom.clonePoint();
        System.out.println("Clone of Custom: " + clone);

        // Check overridden equals and clone
        System.out.println("Clone equals Custom? " + clone.equals(custom));
        System.out.println("Clone == Custom? " + (clone == custom)); // should be false
    }
}
