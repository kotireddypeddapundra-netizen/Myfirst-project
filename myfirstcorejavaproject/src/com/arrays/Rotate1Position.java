package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate1Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of An Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		rotateLeft(arr.clone());
		rotateRight(arr.clone());

	}

	static void rotateLeft(int arr[]) {
		int left = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = left;
		System.out.println("Left Rotated By One Position : " + Arrays.toString(arr));
	}

	static void rotateRight(int arr[]) {
		int right = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = right;
		System.out.println("Right Rotated By One Position : " + Arrays.toString(arr));

	}

}
