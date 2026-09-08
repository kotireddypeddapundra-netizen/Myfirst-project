package com.logicalstatements.forloop;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Nth Digit : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum Is : " + sum);
	}

}
