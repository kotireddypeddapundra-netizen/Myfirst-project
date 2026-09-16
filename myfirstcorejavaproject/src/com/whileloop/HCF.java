package com.whileloop;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		num1=Math.abs(num1);
		num2=Math.abs(num2);
		
		int hcf = highest(num1, num2);
		System.out.println("The HCF or GCD Of " + num1 + " , " + num2 + " = " + hcf);

	}

	static int highest(int num1, int num2) {
		int hcf = 1;
		int i = 1;

		while (i <= num1 && i <= num2) {

			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
			i++;
		}

		return hcf;
	}

}
