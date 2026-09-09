package com.logicalstatements.forloop;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();

//		boolean isPrime = primeNumbersSum(num);
		int sum=0;

		for(int i=2;i<=num;i++) {
			
			if(primeNumbersSum(i)) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("The Sum Of Prime Numbers Is : "+sum);
	}

	public static boolean primeNumbersSum(int num) {
		boolean isPrime = true;
		
		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;

	}

}
