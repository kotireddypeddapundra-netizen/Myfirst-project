package com.whileloop;

import java.util.Scanner;

public class Smallest_SecondSmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		smallest(num);
		
		
	}
	static void smallest(int num) {
		int smallest=9;
		int secondSmallest=9;
		
		while(num!=0) {
			int digit=num%10;
			if(digit<smallest) {
				secondSmallest=smallest;
				smallest=digit;
				
			}else if(digit<secondSmallest && digit!=smallest) {
				secondSmallest=digit;
			}
			num=num/10;
		}
		
		System.out.println("The Smallest Digit In a Given Number Is : "+smallest);
		System.out.println("The Second Smallest Digit In a Given Number Is : "+secondSmallest);

		
	}

}
