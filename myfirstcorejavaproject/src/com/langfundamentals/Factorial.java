package com.langfundamentals;
import java.util.Scanner;
public class Factorial {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Factorial f = new Factorial();
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int factorial = f.factorial(num);
		System.out.println("The Factorial of "+num+" is "+factorial);
	}
	int factorial(int num) {
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

}
