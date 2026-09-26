package com.recursion;

import java.util.Scanner;

public class PowerOfNumber {
	
	static int exponent(int base,int power) {
		
		if(power==0) {
			return 1;
		}
		return base*exponent(base,power-1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base To Calculate : ");
		int base = sc.nextInt();
		
		System.out.println("Enter Power To Calculate : ");
		int power = sc.nextInt();
		
		int result = exponent(base,power);
		System.out.println(base+" ^ "+power+" = "+result);
		
		
	}

}
