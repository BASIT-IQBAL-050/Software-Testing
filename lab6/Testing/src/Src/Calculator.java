package Src;

public class Calculator {
    // Information Expert Principle
    // The Calculator class holds the necessary information and operations for calculations

    // Creator Principle
    // Calculator class is responsible for creating instances of itself
    public Calculator() {
    }

    // Addition operation
    public int addition(int a, int b) {
        return a + b;
    }

    // Subtraction operation
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication operation
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division operation
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
}
