package com.javaintro;
import java.util.Scanner;
public class DigitsProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int product=1;
		
		while (num!=0) {
			int digit = num%10;
			product = product*digit;
			num=num/10;
			
		}
		System.out.println("product of digits = "+product);
		sc.close();

	}

}

