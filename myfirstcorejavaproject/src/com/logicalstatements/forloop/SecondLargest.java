package com.logicalstatements.forloop;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int temp = Math.abs(num);
		int largest = 0;
		int secondLargest = 0;

		for (; temp > 0; temp = temp / 10) {
			int digit = temp % 10;

			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
		}
		System.out.println("The Largest Digit is : " + largest);
		System.out.println("The Second Largest Digit Is : " + secondLargest);

	}

}
