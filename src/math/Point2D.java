package math;

public class Point2D implements Cloneable {
    private double x;
    private double y;

    // Constructor 1: No parameters (origin)
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor 2: One parameter (same value for x and y)
    public Point2D(double value) {
        this.x = value;
        this.y = value;
    }

    // Constructor 3: Two parameters (x and y)
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Overloaded movePoint() methods
    public void movePoint() {
        this.x = 0;
        this.y = 0;
    }

    public void movePoint(double x) {
        this.x = x;
        this.y = x;
    }

    public void movePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void movePoint(Point2D other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Distance calculation
    public double calculateDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double calculateDistance(Point2D other) {
        return calculateDistance(other.x, other.y);
    }

    // Equality check
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Clone method
    public Point2D clonePoint() {
        return new Point2D(this.x, this.y);
    }

    // Overridden clone()
    @Override
    public Point2D clone() {
        try {
            return (Point2D) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Point2D(this.x, this.y);
        }
    }

    // Overridden equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point2D other)) return false;
        return Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0;
    }

    // Overridden toString()
    @Override
    public String toString() {
        return "Point2D(x=" + x + ", y=" + y + ")";
    }
}


