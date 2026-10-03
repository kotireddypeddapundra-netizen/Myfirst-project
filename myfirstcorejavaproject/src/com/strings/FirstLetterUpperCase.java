package com.strings;

import java.util.Scanner;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = sc.nextLine().toLowerCase();
		
		String[] words = str.split("\\s+");
		String result = "";
		
		for(int i=0;i<words.length;i++) {
			
			result=result+words[i].toUpperCase().charAt(0)+words[i].substring(1)+" ";
			
		}
		System.out.println(result);
		
	}

}
