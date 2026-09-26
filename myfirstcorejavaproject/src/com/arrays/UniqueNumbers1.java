package com.arrays;

import java.util.Scanner;

public class UniqueNumbers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of An Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		unique(arr);

	}

	static void unique(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			boolean unique = true;
			for (int j = 0; j < i; j++) {

				if (arr[j] == arr[i]) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
