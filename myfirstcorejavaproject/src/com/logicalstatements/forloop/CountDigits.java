package com.logicalstatements.forloop;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int number = sc.nextInt();
		int count = 0;
		int num=Math.abs(number);
		
		if (num == 0) {
			count = 1;
		} else {
			for (; num > 0; num = num / 10) {
				count++;
			}
		}
		System.out.println("The Number Of Digits Is : " + count);
		sc.close();
	}

}
