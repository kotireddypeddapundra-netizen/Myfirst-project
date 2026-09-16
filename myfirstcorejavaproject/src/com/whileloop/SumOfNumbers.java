package com.whileloop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		sumOfNumbers(n1, n2);

	}

	static void sumOfNumbers(int n1, int n2) {

		int sum = 0;
		while (n1 <= n2) {
			sum = sum + n1;
			n1++;
		}

		System.out.println("The Sum Of Numbers Is : " + sum);

	}

}
