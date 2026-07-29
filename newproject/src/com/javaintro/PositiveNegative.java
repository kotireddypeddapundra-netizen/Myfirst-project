package com.javaintro;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		if (num<0) {
			System.out.println("negative number");
		}
		else if (num>0) {
			System.out.println("positive number");
			
		}
		else {
			System.out.println("zero");
		}
		sc.close();
	}

}
