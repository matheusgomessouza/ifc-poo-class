package math.geometry;

public abstract class AbstractShape {
    private static int objectCount = 0;

    public AbstractShape() {
        objectCount++;
    }

    public abstract double calculateArea();

    public static void showObjectCount() {
        System.out.println("Total number of shape objects created: " + objectCount);
    }
}