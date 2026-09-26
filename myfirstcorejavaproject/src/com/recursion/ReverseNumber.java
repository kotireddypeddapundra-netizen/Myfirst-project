package com.recursion;

import java.util.Scanner;

public class ReverseNumber {

	static void numberReverse(int num) {

		if (num == 0) {
			return;
		}
		System.out.print(num % 10);
		numberReverse(num / 10);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println("The Reverse Of "+num+" Is : " );
		numberReverse(num);

	}

}
