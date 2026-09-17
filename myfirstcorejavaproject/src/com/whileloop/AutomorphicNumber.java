package com.whileloop;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int original = num;

		if (automorphic(num) == original) {
			System.out.println(original + " Is an Automorphic Number");
		} else {
			System.out.println(original + " Not an Automorphic Number");
		}

	}

	static int automorphic(int num) {

		int square = num * num;
		int divisor = 1;

		while (num > 0) {
			divisor = divisor * 10;
			num = num / 10;
		}

		return square % divisor;

	}

}
