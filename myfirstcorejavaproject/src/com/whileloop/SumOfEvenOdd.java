package com.whileloop;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		sumEven(num);
		sumOdd(num);

	}

	static void sumEven(int num) {
		
		int i = 1;
		int sum = 0;

		while (i <= num) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println("The Sum Of Even Numbers Is : " + sum);

	}

	static void sumOdd(int num) {
		int i = 1;
		int sum = 0;

		while (i <= num) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;

		}
		System.out.println("The Sum Of Odd Numbers Is : " + sum);

	}

}
