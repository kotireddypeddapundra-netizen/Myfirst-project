package com.whileloop;

import java.util.Scanner;

public class AlternateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 65;
		charCount(ch);

	}

	static void charCount(char ch) {
		int count = 0;

		while (ch >= 65 && ch <= 90) {
//			System.out.print(ch+" ");
			count++;
			if (count % 2 == 0) {
				System.out.print(ch + " ");
			}
			ch++;
		}

	}

}
