package com.logicalstatements.forloop;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int temp=Math.abs(num);
		int smallest=9;
		
		for(;temp>0;temp=temp/10) {
			
			int digit = temp%10;
			
			if(digit<smallest) {
				smallest=digit;
			}
		}
		
		System.out.println("The Smallest Digit Is : "+smallest);
		
	}

}
