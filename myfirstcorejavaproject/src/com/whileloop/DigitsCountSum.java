package com.whileloop;

import java.util.Scanner;

public class DigitsCountSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int count=countDigits(num);
		System.out.println("The Count Of Digits Is : "+count);
		int sum = digitsSum(num);
		System.out.println("The Sum Of Digits Is : "+sum);
		
		
	}

	static int countDigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	static int digitsSum(int num) {
		int sum=0;
		while(num!=0) {
			int digits = num%10;
			sum=sum+digits;
			num = num/10;
		}
		return sum;
	}

}
