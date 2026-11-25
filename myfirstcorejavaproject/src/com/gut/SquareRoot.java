package com.gut;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int result = method1(num);
		if(result== -1) {
			System.out.println("Negative Integers are not allowed");
		}else
		System.out.println("Result : " + result);
	}

	public static int method1(int num) {

		int result = 0;
		if(num<0) {
			result = -1;
		}
		else if (num == 1 || num == 1) {
			result = num;
		}

		for (int i = 0; i <= num; i++) {

			if (i * i == num) {
				result = i;
				break;
			} else if (i * i > num) {
				result = i - 1;
				break;
			}

		}
		return result;

	}

}
