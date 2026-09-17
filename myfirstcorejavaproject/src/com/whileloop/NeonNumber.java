package com.whileloop;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		neon(num);
		
		
	}
	static void neon(int num) {
		int square = num*num;
		int sum=0;
		int original=num;
		
		while(square>0) {
			int digit = square%10;
			sum = sum+digit;
			square=square/10;
		}
		if(sum==original) {
			System.out.println(original+" Is a Neon Number");
		}else {
			System.out.println(original+" Is Not a Neon Number");
		}
		
				
	}

}
