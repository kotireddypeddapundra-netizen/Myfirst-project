package com.whileloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Which Table You Wanna Print");
		int num = sc.nextInt();
		int i = 1;

		while (i<=num) {
			int j = 1;
			System.out.println("****************************************************");
			while (j >= 1 && j <= 10) {
				int product = i * j;
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
			}
			i++;
		}

	}

}
