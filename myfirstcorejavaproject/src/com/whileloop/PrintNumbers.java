package com.whileloop;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Starting Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Ending Number");
		int n2 = sc.nextInt();
		
		print1ToN(n1,n2);
		System.out.println();
		printNTo1(n1,n2);
	}
	static void print1ToN(int n1,int n2) {
		
		while(n1<=n2) {
			System.out.print(n1+" ");
			n1++;
		}
		
	}
	static void printNTo1(int n1,int n2) {
		
		while(n2>=n1) {
			System.out.print(n2+" ");
			n2--;
		}
	}

}
