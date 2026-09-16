package com.whileloop;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.print("Enter a Number To Search : ");
		int search = sc.nextInt();
		int temp=num;
		
		int count = 0;

		while (num != 0) {
			int digit = num % 10;
			if (search == digit) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("The Frequency Of " + search + " Is : " + count);
		
		firstDigit(temp);
	}

	static void firstDigit(int num) {

		while (num >= 10) {
			num = num / 10;
		}

		System.out.println("First digit = " + num);
	}

}
