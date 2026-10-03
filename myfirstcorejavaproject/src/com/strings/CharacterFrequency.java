package com.strings;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		System.out.println("Enter a Character To Find It's Frequency : ");
		char ch = sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Frequency Of "+ch+" Is "+count);
		
		System.out.println("Frequency Of All Characters In String Is : ");
		frequency(str);
		
	}
	static void frequency(String str) {
		boolean[] isVisited = new boolean[str.length()];
		
		for(int i=0;i<str.length();i++) {
			if(isVisited[i]) {
				continue;
			}
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				if(str.charAt(i)==ch) {
					count++;
					isVisited[j]=true;
				}
			}
//			if(count>1)
			System.out.println("Frequency Of "+str.charAt(i)+" is : "+count);
		}
		
	}

}
