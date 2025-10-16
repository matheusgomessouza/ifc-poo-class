package math;

public class Multiplication extends MathOperation implements InterfaceBasicOperation {
    @Override
    public double calculate(double x, double y) {
        return x * y;
    }

    @Override
    public float calculate(int num1, int num2) {
        return num1 * num2;
    }
}
