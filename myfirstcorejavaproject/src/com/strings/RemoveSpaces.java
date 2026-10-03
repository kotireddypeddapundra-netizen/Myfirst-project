package com.strings;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str = sc.nextLine();

		str = str.replace(" ", "");
		System.out.println("Withot Spaces : "+str);

	}

}
