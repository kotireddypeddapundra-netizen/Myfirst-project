package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRightLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Rotation : " + Arrays.toString(arr));

		System.out.println("Enter How Many Times You Wanna Rotate : ");
		int r = sc.nextInt();

//		rotateRight(arr, r);
//		System.out.println("After Right Rotation : " + Arrays.toString(arr));

		rotateLeft(arr, r);
		System.out.println("After Left Rotation : " + Arrays.toString(arr));

	}

	static void rotateRight(int[] arr, int r) {

		int start = 0, end = arr.length - 1;
		r = r % arr.length;
//		Total Reverse
		reverse(arr, start, end);
//		First Half Rotate
		reverse(arr, start, r - 1);
//		Second Half Rotate
		reverse(arr, r, end);

	}

	static void rotateLeft(int[] arr, int r) {

		int start = 0, end = arr.length - 1;
		r = r % arr.length;

//		First Half Rotate
		reverse(arr, start, r - 1);
//		Second Half Rotate
		reverse(arr, r, end);
//		Total Reverse
		reverse(arr, start, end);

	}

	static void reverse(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
