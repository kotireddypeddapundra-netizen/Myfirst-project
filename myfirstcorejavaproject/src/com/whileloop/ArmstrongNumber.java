package com.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		if (num == armstrong(num)) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}

	}

	static int armstrong(int num) {

		int temp = Math.abs(num);
		int count = 0;
		int temp2 = temp;
		int sum = 0;

		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		while (temp2 > 0) {
			int digit = temp2 % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product * digit;
			}
			sum = sum + product;
			temp2 = temp2 / 10;
		}
		return sum;

	}

}
