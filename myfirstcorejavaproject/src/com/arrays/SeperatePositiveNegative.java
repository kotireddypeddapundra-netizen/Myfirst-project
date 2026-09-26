package com.arrays;

import java.util.Scanner;

public class SeperatePositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Positive Elements : ");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 0) {
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println("Negative Elements : ");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				System.out.println(arr[i] + " ");
			}
		}

	}

}
