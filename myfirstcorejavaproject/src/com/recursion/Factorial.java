package com.recursion;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int num) {
		
		if(num==0 || num==1) {
			return 1;
		}
		return num*fact(num-1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which Factorial You Wanna Find : ");
		int num = sc.nextInt();
		
		int result = fact(num);
		System.out.println("The Factorial Of "+num+" Is : "+result);
		
		
	}

}
