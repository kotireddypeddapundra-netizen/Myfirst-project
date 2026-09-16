package com.whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		if (num == perfect(num)) {
			System.out.println(num + " Is a Perfect Number");
		} else {
			System.out.println(num + " Is Not a Perfect Number");
		}

		System.out.println("The Factors Of " + num + " Are : ");
		factors(num);

		sc.close();
	}

	static int perfect(int num) {
		int sum = 0;
		int i = 1;

		while (i <= num / 2) {
			if (num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		return sum;
	}

	static void factors(int num) {
		int i = 1;

		while (i <= num / 2) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
