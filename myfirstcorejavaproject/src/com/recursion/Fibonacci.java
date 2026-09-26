package com.recursion;

import java.util.Scanner;

public class Fibonacci {

	static int fibSeries(int num) {
		
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		
		return fibSeries(num-1) + fibSeries(num-2);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int num = sc.nextInt();
		
		int result = fibSeries(num);
		System.out.println("The "+num+"th Number In Series Is : "+result);
		
		System.out.println("Fibonacci Series");
		for(int i=0;i<=num;i++) {
			System.out.print(fibSeries(i)+" ");
		}
		
		
	}

}
