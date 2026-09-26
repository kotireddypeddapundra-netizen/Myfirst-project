package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Shift Zeroes Right Side : ");
		moveRight(arr);
		System.out.println("Shift Zeroes Left Side : ");
		moveLeft(arr);

	}

	static void moveLeft(int arr[]) {
		int index = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index--;
			}
		}
		while (index >= 0) {
			arr[index] = 0;
			index--;
		}
		System.out.println(Arrays.toString(arr));

	}

	static void moveRight(int arr[]) {
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		while (index < arr.length) {
			arr[index] = 0;
			index++;
		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				int temp = arr[i];//1 0 2 0 3
//				arr[i] = arr[index];//
//				arr[index] = temp;
//				index++;
//			}
//		}
		System.out.println(Arrays.toString(arr));

	}

}
