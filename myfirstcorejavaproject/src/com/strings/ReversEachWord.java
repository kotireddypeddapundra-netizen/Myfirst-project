package com.strings;

import java.util.Scanner;

public class ReversEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = sc.nextLine();

		String[] words = str.split("\\s+");
		String result = "";

		for (int i = 0; i < words.length; i++) {

			for (int j = words[i].length() - 1; j >= 0; j--) {
				result = result + words[i].charAt(j);
			}
			result = result + " ";
		}
		System.out.println(result.trim());

		System.out.println("Reverse Order Of Each Word Is : ");
		reverseOrder(words);

	}

	static void reverseOrder(String[] words) {

		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {

			result = result + words[i] + " ";
		}
		System.out.println(result.trim());
	}

}
