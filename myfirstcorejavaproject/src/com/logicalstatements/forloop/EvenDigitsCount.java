package com.logicalstatements.forloop;

import java.util.Scanner;

public class EvenDigitsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int number = sc.nextInt();
		int count = 0;
		int num = Math.abs(number);

		if (num == 0) {
			count = 0;
		} else {
			for (int i = num; i != 0; i = i / 10) {
				int digit = i % 10;
				if (digit % 2 == 0 && digit != 0) {
					count++;
				}
			}
			System.out.println("The Number Of Even Digits Is : " + count);
		}

		sc.close();
	}

}
