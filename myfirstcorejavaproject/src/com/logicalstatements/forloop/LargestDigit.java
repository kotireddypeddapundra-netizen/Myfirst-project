package com.logicalstatements.forloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int temp = Math.abs(num);
		int largest = 0;

		for (; temp > 0; temp = temp / 10) {
			int digit = temp % 10;
			if (digit > largest) {
				largest = digit;
			}

		}
		System.out.println(largest);

	}

}
