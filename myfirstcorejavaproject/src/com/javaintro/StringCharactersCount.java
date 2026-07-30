package com.javaintro;
import java.util.Scanner;
public class StringCharactersCount {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter a sentence");
	String input = sc.nextLine();
	
	int characterCount = input.length();
	
	System.out.println("output : " +characterCount);
	
	sc.close();
	
	}

}
