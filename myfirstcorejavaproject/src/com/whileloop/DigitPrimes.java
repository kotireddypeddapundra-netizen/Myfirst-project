package com.whileloop;

import java.util.Scanner;

public class DigitPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int original = num;
		int temp = num;
		int divisor = 1;

		while (num > 0) {
			divisor = divisor * 10;
			while (temp > 0) {
				int digit = temp % divisor;
				if (singleDigit(digit)) {
					System.out.print(digit + " ");
				}
				temp = temp / divisor;
			}
			temp = original;
			num = num / divisor;
		}

	}

	static boolean singleDigit(int digit) {
		boolean isPrime = true;

		if (digit <= 1) {
			return false;
		} else {
			for (int i = 2; i <= digit / 2; i++) {
				if (digit % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
