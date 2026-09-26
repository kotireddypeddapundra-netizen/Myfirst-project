package com.arrays;

import java.util.Scanner;

public class CommonElements2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of First Array : ");
		int s1 = sc.nextInt();

		int[] arr1 = new int[s1];
		System.out.print("Enter Elements In First Array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.print("Enter Size Of Second Array : ");
		int s2 = sc.nextInt();

		int[] arr2 = new int[s2];
		System.out.print("Enter Elements In Second Array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Common Elements : ");
		for (int i = 0; i < arr1.length; i++) {
			boolean common = false;

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}

		}
		sc.close();

	}

}
