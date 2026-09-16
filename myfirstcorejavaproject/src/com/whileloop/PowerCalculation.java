package com.whileloop;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base To Calculate : ");
		int base = sc.nextInt();

		System.out.print("Enter Exponent Or Power To Calculate : ");
		int power = sc.nextInt();
		
		int result = power(base,power);
		System.out.println(base+" Raised To The Power "+power+" Is : "+result);

	}
	static int power(int base,int power) {
		int result=1;
		while(power>0) {
			result=result*base;
			power--;
		}
		
		return result;
	}
}
