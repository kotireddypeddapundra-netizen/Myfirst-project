package com.arrays;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows You Wanna Print : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			int value = 1;

			for (int k = 1; k <= i; k++) {
				System.out.print(value + " ");
				value = value * (i - k) / k;
			}
			System.out.println();
		}
		sc.close();
	}

}
