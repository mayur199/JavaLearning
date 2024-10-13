package com.adhoc;

import java.util.Scanner;

public class ScannerEg1 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
        String name = sc.next();  // Read user input
        System.out.println("Hello, " + name); 
        */
		
	/*	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 0; i<= n; i++) {
			System.out.println(i);
		}
	
	*/
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		System.out.println("Hello " + name);
	}		

}
