package com.logicalstatements.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		fibonacci(num);
		
		sc.close();
	}
	public static void fibonacci(int num) {		
		int first=0;
		int second=1;
		
		System.out.println("Fibonacci Series");
		
		for(int i=1;i<=num;i++) {
		System.out.print(first+" ");//0
		int next=first+second;//1
		
		first=second;
		second=next;
		
		}
		
	}
	
}
