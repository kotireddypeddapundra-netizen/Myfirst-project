package com.logicalstatements.forloop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number You Wanna Find Factorial : ");
		long num = sc.nextLong();
		long factorial = 1;

		if (num < 0) {
			System.out.println("Factorial Is Undefined");
		} else {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
		}
		System.out.println("The Factorial Of " + num + " is " + factorial);
	}
}
