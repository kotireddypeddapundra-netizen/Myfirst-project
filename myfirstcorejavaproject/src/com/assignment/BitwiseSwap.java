package com.assignment;

import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping:  a = " + a + ", b = " + b);

	}

}

//01010  -->10
//10100  -->20
//11110  -->30

//11110  -->30
//10100  -->20
//01010  -->10

//11110  -->30
//01010  -->10
//10100  -->20
