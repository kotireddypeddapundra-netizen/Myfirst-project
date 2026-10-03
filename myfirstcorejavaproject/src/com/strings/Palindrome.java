package com.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();

		if (isPalindrome(str).equalsIgnoreCase(str)) {
			System.out.println("String Is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	static String isPalindrome(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
