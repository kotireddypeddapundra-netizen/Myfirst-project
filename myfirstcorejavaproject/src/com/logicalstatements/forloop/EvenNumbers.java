package com.logicalstatements.forloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Nth Number");
		int n = sc.nextInt();
		int count = 0;

//		for(int i=0;i<=n;i=i+2) {
//			count++;
//			System.out.println(i);
//		}
//		System.out.println("The Count Is : "+count);

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0 && i != 0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("The Count Is : "+count);
	}

}
