package com.whileloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit To Stop");
		int num = sc.nextInt();
		
		fibonacci(num);
		
		sc.close();

	}

	static void fibonacci(int num) {

		int first = 0;
		int second = 1;
		int i = 1;

		while (i <= num) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
			i++;

		}

	}

}
