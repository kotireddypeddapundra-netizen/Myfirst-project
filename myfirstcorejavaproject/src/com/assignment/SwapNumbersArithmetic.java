package com.assignment;

import java.util.Scanner;

public class SwapNumbersArithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		
		int temp;

		System.out.println(a);
		System.out.println(b);
		System.out.println("**********************************");

//		temp=a;
//		a=b;
//		b=temp;

//		temp=a+b;//30
//		a=temp-a;//20
//		b=temp-b;//10

		a = a + b;// 30
		b = a - b;// 10
		a = a - b;// 20

		System.out.println(a);
		System.out.println(b);
	}

}
