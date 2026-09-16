package com.whileloop;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int result = isMagic(num);
		if(result==1) {
			System.out.println("The Given Number Is Magic Number");
		}else {
			System.out.println("The Given Number Is Not a Magic Number");
		}
		
	}
	static int isMagic(int num) {
		int sum = 0;
		while(num>9) {
			sum = 0;
			while(num>0) {
				int digit = num%10;
				sum=sum+digit;
				num=num/10;
			}
			num=sum;
		}
		return sum;
		
	}
}
