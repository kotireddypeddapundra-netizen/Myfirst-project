package com.arrays;

import java.util.Scanner;

public class SumNextPrevious {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] temp = arr.clone();
		int[] original = arr.clone();

		System.out.println("Array Changed By Adding Previous And Next Values : ");

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			arr = temp;
			if (i == 0) {
				sum = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				sum = arr[i] + arr[i - 1];
			} else {
				sum = arr[i - 1] + arr[i] + arr[i + 1];
			}
			original[i] = sum;
			System.out.print(original[i] + " ");
		}

		sc.close();
	}

}
