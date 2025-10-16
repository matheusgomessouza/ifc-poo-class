package math;

public class Division extends MathOperation implements InterfaceBasicOperation {
    @Override
    public double calculate(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x / y;
    }

    @Override
    public float calculate(int num1, int num2) {
        return (float) num1 / num2;
    }
}