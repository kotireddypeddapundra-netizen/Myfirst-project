package com.logicalstatements.forloop;

//Without Method
//import java.util.Scanner;
//
//public class PrimeCount {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter a Number : ");
//		int num = sc.nextInt();
//
//		if (num <= 1) {
//			System.out.println("Invalid Entry");
//		} else {
//			for (int i = 2; i <= num; i++) {
//				boolean isPrime = true;
//				for (int j = 2; j <= i / 2; j++) {
//
//					if (i % j == 0) {
//						isPrime = false;
//						break;
//					}
//				}
//				if (isPrime) {
//					System.out.println(i);
//				}
//			}
//		}
//
//	}
//}

//With Method
import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
//		boolean isPrime = isPrime(num);
		int count=0;
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println("The Count IS : "+count);

	}

	public static boolean isPrime(int num) {

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
