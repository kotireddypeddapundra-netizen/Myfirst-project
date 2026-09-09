package com.logicalstatements.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		boolean result = isPalindrome(num);
		if(result) {
			System.out.println("The Number Is Palindrome");
		}else {
			System.out.println("The Number Is Not A Palindrome");
		}
		
		
	}

	public static boolean isPalindrome(int num) {
		
		boolean isPalindrome=false;
		int reverse=0;
		int original=num;

		for(;num!=0;num=num/10) {
			int digit=num%10;
			reverse=reverse*10+digit;
		}
		if(original==reverse) {
			isPalindrome=true;
		}
		 return isPalindrome;
	}

}
