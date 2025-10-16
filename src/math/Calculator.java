package math;

public class Calculator {
    private final int num1;
    private final int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int multi() {
        return this.num1 * this.num2;
    }

    public float div() {
        if (this.num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (float) this.num1 / this.num2;
    }
}
