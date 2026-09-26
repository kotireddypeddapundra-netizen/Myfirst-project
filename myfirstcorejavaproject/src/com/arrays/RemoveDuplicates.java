package com.arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					duplicate = true;
				}
			}
			if (!duplicate) {
				System.out.println(arr[i]);
			}
		}
		sc.close();

	}

}
