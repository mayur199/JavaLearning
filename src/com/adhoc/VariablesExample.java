package com.adhoc;

public class VariablesExample {
	public static void main(String[] args) {
		
		int x = 15;
		int y = 10;
		int sum = x + y;
		System.out.println("Sum of " + x + " and " + y + " is "+ sum);
		
		int xy = x * y;
		System.out.println(xy);
		
		int a = x / y;
		int b = y / x;
		int c = x % y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int exp = (x * y) / (x + y);
		System.out.println(exp);
	}
}
