package com.whileloop;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();

		happy(num);
		sc.close();

	}

	static void happy(int num) {

		int sum = 0;

		while (sum != 1 && sum != 4) {
			sum = 0;
			while (num > 0) {
				int digit = num % 10;
				sum = sum + digit * digit;
				num=num/10;
			}
			num = sum;
		}
		if (sum == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Sad Number");
		}

	}

}
