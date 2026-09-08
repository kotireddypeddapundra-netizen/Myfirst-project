package com.logicalstatements.forloop;

import java.util.Scanner;

public class PrintNumbers1ToN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Ending Value...");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= n; i++) {
			count++;
			System.out.println(i);
		}
		System.out.println("The Count Is" + count);
	}

}
