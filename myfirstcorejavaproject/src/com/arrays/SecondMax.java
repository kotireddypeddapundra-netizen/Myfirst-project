package com.arrays;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		secondMax(arr);

	}

	static void secondMax(int arr[]) {
		int max = arr[0];
		int max2 = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max2 = max;
				max = arr[i];
			} else if (arr[i] > max2 && arr[i] != max) {
				max2 = arr[i];
			}

		}
		System.out.println("Max : " + max);
		System.out.println("Second Max : " + max2);
	}

}
