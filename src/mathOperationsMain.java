import math.*;

void main(String[] args) {
    MathOperation add = new Addition();
    MathOperation subtract = new Subtraction();
    MathOperation multiply = new Multiplication();
    MathOperation divide = new Division();

    System.out.println("Addition: " + add.calculate(10, 5));
    System.out.println("Subtraction: " + subtract.calculate(10, 5));
    System.out.println("Multiplication: " + multiply.calculate(10, 5));
    System.out.println("Division: " + divide.calculate(10, 5));
}

