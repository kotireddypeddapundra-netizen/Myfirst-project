package com.logicalstatements.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Which Table You Wanna Print : ");
		int num = sc.nextInt();
		
		multiply(num);
	}

	public static void multiply(int num) {
		
		for(int i=1;i<=num;i++) {
			System.out.println("******************************************");
			for(int j=1;j<=10;j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
		
	}

}
