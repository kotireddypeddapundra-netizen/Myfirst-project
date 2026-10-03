package com.strings;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = sc.nextLine().trim();

		int count = 0;

		if (str.isEmpty()) {
			count = 0;
		} else {
			String[] words = str.split("\\s+");
			count = words.length;
		}
		System.out.println("Words Count = " + count);
	}

}
