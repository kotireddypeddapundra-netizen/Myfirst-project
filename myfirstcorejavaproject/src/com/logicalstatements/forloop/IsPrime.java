package com.logicalstatements.forloop;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		boolean isPrime=isPrime(n);
		if(isPrime) {
			System.out.println(n+" Is a Prime Number");
		}else {
			System.out.println(n+" Is Not a Prime Number");
		}

	}

	public static boolean isPrime(int n) {

		boolean isPrime = true;
		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;

	}
}
