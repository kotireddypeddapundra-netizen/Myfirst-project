package com.assignment;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("FIZZ BUZZ");
		}
		else if(num%3==0) {
			System.out.println("FIZZ");
		}
		else if(num%5==0) {
			System.out.println("BUZZ");
		}

	}

}
