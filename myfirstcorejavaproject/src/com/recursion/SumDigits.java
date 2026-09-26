package com.recursion;

import java.util.Scanner;

public class SumDigits {
	
	static int digitSum(int num) {
		
		if(num==0) {
			return 0;
		}
		return (num%10) + digitSum(num/10);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int sum = digitSum(num);
		System.out.println("Sum Of Digits = "+sum);
		
	}

}
