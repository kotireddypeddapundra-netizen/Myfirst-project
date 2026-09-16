package com.whileloop;

import java.util.Scanner;

public class ReveseAndPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int reverse=reverse(num);
		System.out.println("The Reverse Number Is : "+reverse);
		
		if(reverse==num) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}

	}

	static int reverse(int num) {
		int reverse = 0;

		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num=num/10;
		}
		return reverse;
	}

}
