package com.strings;

import java.util.Scanner;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();

		char mostRepeated = '\u0000';
		int maxCount = 0;

		boolean[] checked = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (checked[i]) {
				continue;
			}
			int count = 0;
			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {

				if (ch == str.charAt(j)) {
					count++;
					checked[j] = true;
				}

			}
			if (count > maxCount) {
				maxCount = count;
				mostRepeated = ch;
			}

		}
		System.out.println("Most Repeated Character : "+mostRepeated);
		System.out.println("Count Of Most Repeated Character : "+maxCount);

	}

}
