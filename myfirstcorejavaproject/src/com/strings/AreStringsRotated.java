package com.strings;

import java.util.Scanner;

public class AreStringsRotated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str1 = sc.next().trim();
		System.out.println("Enter a String : ");
		String str2 = sc.next().trim();
		
		if(str1.length()==str2.length() && (str1+str1).contains(str2)) {
			System.out.println("Strings Are Rotated");
		}else {
			System.out.println("Strings Are Not Rotated");
		}
		
		
	}

}
