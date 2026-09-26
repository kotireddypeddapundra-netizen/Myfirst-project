package com.arrays;

import java.util.Scanner;

public class MissingNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Missing Number Using Formula : ");
		missing1(arr);

	}

	static void missing1(int arr[]) {

		int expectedSum = arr.length * (arr.length + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int result = expectedSum - sum;

		System.out.println(result);
	}
	
}
