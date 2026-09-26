package com.recursion;

import java.util.Scanner;

public class SumNatural {

	static int addition(int num) {

		if (num == 0) {
			return 0;
		}
		return num + addition(num - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Numbers You Wanna Add : ");
		int num = sc.nextInt();

		int result = addition(num);
		System.out.println("Sum of Natural Numbers Is : " + result);

	}

}
