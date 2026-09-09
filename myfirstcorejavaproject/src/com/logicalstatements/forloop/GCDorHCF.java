package com.logicalstatements.forloop;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		hcf(num1, num2);

		sc.close();

	}

	public static void hcf(int num1, int num2) {
		int hcf = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				hcf = i;
		}
		System.out.println("The HCF Of Numbers Is : " + hcf);
	}

}
