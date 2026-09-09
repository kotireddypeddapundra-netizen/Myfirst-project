package com.logicalstatements.forloop;

import java.util.Scanner;

public class PerfectNumber1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (perfectNumber(i)) {
				System.out.println(i + " ");
			}
		}

	}

	public static boolean perfectNumber(int num) {
		boolean isPerfect = false;
		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			isPerfect = true;
		}
		return isPerfect;
	}

}
