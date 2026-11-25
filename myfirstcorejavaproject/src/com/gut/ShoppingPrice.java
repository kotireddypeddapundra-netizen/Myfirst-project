package com.gut;

import java.util.Scanner;

public class ShoppingPrice {

	public static void main(String[] args) {

		int[] arr = { 5, 7, 7, 8, 8, 10 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Target Element : ");
		int target = sc.nextInt();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				int nextIndex = i + 1;

				if (nextIndex < arr.length && arr[nextIndex] == target) {
					System.out.println(i + " , " + nextIndex);
					break;
				}else {
					System.out.println(i + " , " + i);
				}

			} else if (arr[i] != target) {
				count++;
			}

		}
		if (count == arr.length) {
			System.out.println("[-1,-1]");
		}

	}

}
