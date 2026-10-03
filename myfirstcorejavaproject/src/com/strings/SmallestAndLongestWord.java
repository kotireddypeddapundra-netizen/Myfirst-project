package com.strings;

import java.util.Scanner;

public class SmallestAndLongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = sc.nextLine();

		String[] words = str.split("\\s+");
		int longestLength = words[0].length();
		String longestWord = "";
		int smallestLength = words[0].length();
		String smallestWord = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longestLength) {
				longestLength = words[i].length();
				longestWord = words[i];
			} else if (words[i].length() < smallestLength) {
				smallestLength = words[i].length();
				smallestWord = words[i];
			}

		}
		System.out.println("Smallest Word Is : " + smallestWord);
		System.out.println("Smallest Word Length Is : " + smallestLength);
		System.out.println("Largest Word Is : " + longestWord);
		System.out.println("Longest Word Length Is : " + longestLength);

	}

}
