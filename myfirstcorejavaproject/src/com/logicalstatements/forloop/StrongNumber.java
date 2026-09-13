package com.logicalstatements.forloop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int temp = Math.abs(num);
		int sum = 0;
		for (; temp != 0; temp = temp / 10) {
			int digit = temp % 10;
			int digitFact=factorial(digit);
			sum=sum+digitFact;
		}
		if(sum==num) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}

	}

	static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		return fact;

	}

}
