package com.adhoc;

import java.util.Scanner;

public class PrimeNumberEg {
	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of test cases: ");
		int t = scn.nextInt();

		for(int i=0; i<t;i++) {
			System.out.print("Enter the number: ");
			int n = scn.nextInt();

			int count=0;

			for(int div=2; div*div <=n;div++) {
				if(n % div == 0) {//divisible - also checking remainder
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(n+":Prime");
			}
			else {
				System.out.println(n +": Not Prime");
			}


		}
	}

}


