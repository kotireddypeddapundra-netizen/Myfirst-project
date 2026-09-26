package com.recursion;

import java.util.Scanner;

public class GCD {
	
	static int gcd(int num1,int num2) {
		
		if(num2==0) {
			return num1;
		}
		return gcd(num2,num1%num2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 =sc.nextInt();
		
		int result = gcd(num1,num2);
		System.out.println("GCD = "+result);
		
	}

}
