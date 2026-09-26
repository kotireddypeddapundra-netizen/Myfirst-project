package com.recursion;

import java.util.Scanner;

public class CountDigits {

	static int digitsCount(int num) {

		if (num == 0) {
			return 0;
		}

		return 1 + digitsCount(num/10);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int count = digitsCount(num);
		System.out.println("Count = " + count);

	}

}
