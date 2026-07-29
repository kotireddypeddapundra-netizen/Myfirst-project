package com.javaintro;
import java.util.Scanner;
public class StringWordCount {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a sentence");
	String input = sc.nextLine().trim();
	
	if(input.isEmpty()) {
		System.out.println("output: 0");
	}
	else {
		String[] words = input.split("\\s");
		System.out.println("output : "+words.length);
	}
	sc.close();
	}

}