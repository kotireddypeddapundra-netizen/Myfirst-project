package com.strings;

import java.util.Scanner;

public class OnlyDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();

		boolean areOnlyDigits = true;

		if (str.isEmpty()) {
			System.out.println("String Is Empty");
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				areOnlyDigits = false;
				break;
			}

		}
		if(areOnlyDigits) {
			System.out.println("Contains Only Digits");
		}else {
			System.out.println("Does Not Contain Only Digits");
		}

	}

}
