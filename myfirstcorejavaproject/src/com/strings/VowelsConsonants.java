package com.strings;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();

		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {

				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}

			}

		}
		System.out.println("Vowel Count = " + vowelCount);
		System.out.println("Consonant Count = " + consonantCount);
	}

}
