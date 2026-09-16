package com.whileloop;

import java.util.Scanner;

public class Largest_SecondLargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		largest(num);
		secondLargest(num);

	}

	static void largest(int num) {
		int largest = 0;

		while (num != 0) {
			int digit = num % 10;
			if (digit > largest) {
				largest = digit;
			}
			num = num / 10;
		}
		System.out.println("The Largest Digit In a Given Number Is : " + largest);
	}

	static void secondLargest(int num) {
		int largest = 0;
		int secondLargest = 0;

		while (num != 0) {
			int digit = num % 10;
			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
			num = num / 10;
		}

		System.out.println("The Second Largest Digit In a Given Number Is : " + secondLargest);
	}

}
