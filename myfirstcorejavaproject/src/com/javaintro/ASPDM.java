package com.javaintro;

import java.util.Scanner;

public class ASPDM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int difference = num1-num2;
		int product = num1*num2;
		float division = num1/num2;
		int modulo = num1%num2;
		
		System.out.println("sum =" + sum);
		System.out.println("difference =" + difference);
		System.out.println("product =" + product);
		System.out.println("division =" + division);
		System.out.println("modulo =" + modulo);
		
		sc.close();
	}

}
