package com.javaintro;
import java.util.Scanner;

public class GreatestSmallest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("enter third number");
		int num3 = sc.nextInt();
		
		if (num1>=num2 && num1>=num3) {
			System.out.println(num1 + " is greatest");
		}
		else if (num2>=num1 && num2>=num3) {
			System.out.println(num2 + " is greatest");
	}
		else {
			System.out.println(num3 + " is greatest");
		}
		if (num1<=num2 && num1<=num3) {
			System.out.println(num1 + " is smallest");
		}
		else if (num2<=num1 && num2<=num3) {
			System.out.println(num2 + " is smallest");
	}
		else {
			System.out.println(num3 + " is smallest");
		}
		sc.close();
		}

}
