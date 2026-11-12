package com.arrays;

import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 2, 4, 9, 7, 3 };

		System.out.println("Enter K Value");
		int k = sc.nextInt();

		if (k > arr.length || k <= 0) {
			System.out.println("Entered Index Doesn't Exists");
		} else {
			int max = Integer.MAX_VALUE;

			for (int i = 1; i <= k; i++) {
				int tempMax = Integer.MIN_VALUE;

				for (int j = 0; j < arr.length; j++) {

					if (arr[j] < max && arr[j] > tempMax) {
						tempMax = arr[j];
					}
				}
				max = tempMax;

			}
			System.out.println("Kth Largest Element Is : " + max);
		}

	}

}
