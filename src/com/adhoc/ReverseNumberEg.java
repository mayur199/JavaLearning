package com.adhoc;

import java.util.Scanner;

public class ReverseNumberEg {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
		while (n>0) {
			int dig = n % 10;
			n = n / 10;
			System.out.println(dig);
		}
	}

	
}
