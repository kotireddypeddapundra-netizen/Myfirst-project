package com.gut;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 23, 89, 54 };
		int[] arr2 = { 10, 5, 10, 3 };
		int arr3[] = { -9, -4, -2 };
		int[] arr4 = { 5, 5, 5 };
		int[] arr5 = { 1, 2, 3 };

		arr(arr);
		arr(arr2);
		arr(arr3);
		arr(arr4);
		arr(arr5);

	}

	public static void arr(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}

		}
		
		System.out.println("Maximum = " + max);
		if(secondMax==Integer.MIN_VALUE) {
			System.out.println("Second MAx Doesn't Exist");
		}else {
			System.out.println("Second Maximum = " + secondMax);
		}

	}
}
