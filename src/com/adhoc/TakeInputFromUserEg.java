package com.adhoc;

import java.util.Scanner;

public class TakeInputFromUserEg {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		String name = scn.nextLine();
		System.out.println("dear " + name + " this is the numbers list");
		for(int i = 0; i<=n; i++) {
			System.out.println(i);
		}
	}

}
