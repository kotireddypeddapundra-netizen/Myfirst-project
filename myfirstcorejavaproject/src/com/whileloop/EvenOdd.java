package com.whileloop;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int n2 = sc.nextInt();
		
		printEven(n1,n2);
		System.out.println();
		printOdd(n1,n2);

	}

	private static void printEven(int n1, int n2) {
		
		while(n1<=n2) {
			if(n1%2==0) {
				System.out.print(n1+" ");
			}
			n1++;
		}
		
	}

	private static void printOdd(int n1, int n2) {
		
		while(n1<=n2) {
			if(n1%2!=0) {
				System.out.print(n1+" ");
			}
			n1++;
		}
	}

}
