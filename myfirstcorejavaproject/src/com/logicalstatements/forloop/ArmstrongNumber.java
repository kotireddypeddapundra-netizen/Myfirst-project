package com.logicalstatements.forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;

		for (; temp != 0; temp = temp / 10) {
			count++;
		}

		temp = num;
		int sum = 0;

		for (; temp != 0; temp = temp / 10) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum = sum + power;
		}
		if (sum == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
