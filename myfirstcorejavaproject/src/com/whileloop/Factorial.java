package com.whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int fact = findFactorial(num);
		
		if (num < 0) {
			System.out.println("Negative Factorials Doesn,t Exist");
		} else {
			System.out.println("The Factorial Of " + num + " Is : " + fact);
		}
	}

	static int findFactorial(int num) {
		int fact = 1;

		while (num > 0) {
			fact = fact * num;
			num--;
		}

		return fact;
	}

}
