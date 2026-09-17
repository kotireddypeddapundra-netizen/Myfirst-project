package com.whileloop;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		if(spy(num)) {
			System.out.println(num+" Is a Spy Number");
		}else {
			System.out.println(num+" Is Not a Spy Number");
		}

	}

	static boolean spy(int num) {
		int sum = 0;
		int product = 1;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			product = product * digit;
			num = num / 10;
		}
		return sum == product;

	}

}
