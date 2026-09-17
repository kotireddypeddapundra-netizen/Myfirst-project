package com.whileloop;

import java.util.Scanner;

public class DecimalToBinary {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Decimal To Binary");
		binary();
		System.out.println("Binary To Decimal");
		decimal();
		sc.close();

	}

	static void binary() {

		System.out.print("Enter Decimal Number : ");
		int num = sc.nextInt();

//		String binaryResult = "";
		int binaryResult = 0;
		int place = 1;

		while (num > 0) {
			
			int digit = num % 2;// 18%2-->0,9%2-->1,4%2-->0,2%2-->0,1%2-->1------->01001
//			binaryResult = digit + binaryResult;
			binaryResult = binaryResult + digit * place;
			place = place * 10;

			num = num / 2;// 18/2-->9,9/2-->4,4/2-->2,2/2-->1,1/2-->0
		}
		System.out.println("Binary = " + binaryResult);
	}

	static void decimal() {
		System.out.print("Enter Binary Number : ");
		int num = sc.nextInt();

		int decimalresult = 0;
		int base = 1;

		while (num > 0) {
			int digit = num % 10;
			decimalresult = decimalresult + digit * base;
			base = base * 2;
			num = num / 10;
		}
		System.out.println("Decimal = " + decimalresult);
	}

}
