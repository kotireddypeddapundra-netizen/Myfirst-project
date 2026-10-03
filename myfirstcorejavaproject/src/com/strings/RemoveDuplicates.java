package com.strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			boolean isFound = false;
			for (int j = 0; j < i; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					isFound = true;
					break;
				}

			}
			if (!isFound) {
				System.out.print(str.charAt(i));
			}

		}

	}

}
