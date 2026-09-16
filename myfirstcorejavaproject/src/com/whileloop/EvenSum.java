package com.whileloop;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int result = evenSum(num);
		System.out.println("The Even Position Sum Is : " + result);
		count(num);
		sc.close();
	}

	static int evenSum(int num) {

		int sum = 0;
		int count = 0;
		while (num != 0) {
			int digit = num % 10;

			if (count % 2 == 0) {
				sum = sum + digit;
			}
			count++;
			num = num / 10;
		}

		return sum;

	}

	static void count(int num) {
		int evenCount = 0;
		int oddCount = 0;

		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}
		System.out.println("The Even Digits Count In Given Number Is : " + evenCount);
		System.out.println("The Odd Digits Count In Given Number Is : " + oddCount);

	}
}
