package com.logicalstatements.forloop;

import java.util.Scanner;

public class PrintRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number");
		int n = sc.nextInt();
		recursion(n);
	}

	public static void recursion(int n) {

		if (n>100) {
			return;
		}
		System.out.println(n);
		recursion(n+1);
	}

}
