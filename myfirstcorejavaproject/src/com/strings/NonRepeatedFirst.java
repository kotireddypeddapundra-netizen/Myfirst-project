package com.strings;

import java.util.Scanner;

public class NonRepeatedFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		boolean isFound = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				isFound = true;
				System.out.println("Non Repeating First Character Is : " + ch);
				break;
			}
		}
		if (!isFound) {
			System.out.println("No Non Repeating Characters Found");
		}

	}

}
