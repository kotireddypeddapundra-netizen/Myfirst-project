package com.logicalstatements.forloop;

import java.util.Scanner;

public class PrintNTo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Nth Value...");
		int n = sc.nextInt();
		int count = 0;

		for (int i = n; i >= 0; i--) {
			count++;
			System.out.println(i);
		}
		System.out.println("The Count Is" + count);
	}

}
