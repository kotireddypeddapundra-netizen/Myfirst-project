package com.arrays;

import java.util.Scanner;

public class InvertedHollowPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2*(n-i)+1; k++) {
				if (i == 1 || k == 1 || k == 2*(n-i)+1) {
					System.out.print("* ");
				} else {

					System.out.print("  ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
