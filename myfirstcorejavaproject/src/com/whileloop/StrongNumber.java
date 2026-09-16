package com.whileloop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while(temp>0) {
			int digit = temp%10;
			int digitFact = factorial(digit);
			sum=sum+digitFact;
			temp = temp/10;
		}
		if(sum==num) {
			System.out.println("The Given Number Is a Strong Number");
		}else {
			System.out.println("The Given Number Is Not a Strong Number");
		}
		sc.close();
		
	}
	static int factorial(int num) {
		int fact = 1;
		
		while(num>0) {
			fact=fact*num;
			num--;
		}
		
		return fact;
	}

}
