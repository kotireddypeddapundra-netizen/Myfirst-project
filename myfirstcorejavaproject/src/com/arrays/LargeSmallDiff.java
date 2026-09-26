package com.arrays;

import java.util.Scanner;

public class LargeSmallDiff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		int difference = largest - smallest;
		System.out.println("Smallest = " + smallest);
		System.out.println("Largest = " + largest);
		System.out.println("Difference = " + difference);

	}

}
