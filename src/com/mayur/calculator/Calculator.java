package com.mayur.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return (double) a / b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		int num1 = 10;
		int num2 = 5;

		System.out.println("Addition: " + cal.add(num1, num2));
		System.out.println("Subtraction: " + cal.subtract(num1, num2));
		System.out.println("Multiplication: " + cal.multiply(num1, num2));
		System.out.println("Division: " + cal.divide(num1, num2));

	}
}
