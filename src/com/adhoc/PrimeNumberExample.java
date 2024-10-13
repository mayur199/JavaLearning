package com.adhoc;

import java.util.Scanner;

public class PrimeNumberExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the low number: ");
		int low = scn.nextInt();
		System.out.print("Enter the high number: ");
		int high = scn.nextInt();

		for(int n=low; n<=high; n++) {
			int count = 0;

			for(int div = 2; div * div <=n; div++) {
				if(n% div == 0) {
					count++;
					break;
				}
			}

			if(count ==0) {
				System.out.println(n);
			}
		}
	}

}
