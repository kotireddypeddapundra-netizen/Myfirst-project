package com.logicalstatements.forloop;

import java.util.Scanner;

public class MaxFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();

		findMaxFactor(num);
	}

	public static void findMaxFactor(int n) {

		int maxFactor=0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				if (i > maxFactor) {
					maxFactor = i;
				}
			}
			
		}
		System.out.println("The Max Factor Is : "+maxFactor);

		

	}

}
