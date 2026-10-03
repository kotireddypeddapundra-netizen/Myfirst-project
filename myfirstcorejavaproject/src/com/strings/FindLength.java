package com.strings;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		
		System.out.println(name.length());
		
		sc.close();
	}

}
