package com.whileloop;

import java.util.Scanner;

public class AlternatePrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit");
		int num = sc.nextInt();

//		if(isPrime(num)) {
//			System.out.println("Prime NUmber");
//		}else {
//			System.out.println("Not a Prime Number");
//		}
		int count = 0;
		int i = 2;
		while (i <= num) {
			if (isPrime(i)) {
				count++;
				if (count % 2 == 0) {
					System.out.println(i);
				}
//				if(count%2!=0) {
//				System.out.println(i);
//			}
			}
			i++;
		}

	}

	static boolean isPrime(int num) {
		boolean status = true;
		int i = 2;
		int temp = num;

		if (num <= 1) {
			return false;
		}

		while (i <= num / 2) {
			if (num % i == 0) {
				status = false;
				break;
			}
			i++;

		}
		return status;
	}

}
