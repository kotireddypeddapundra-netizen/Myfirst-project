package com.gut;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };

		System.out.println("Before: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("After:  " + Arrays.toString(arr));
	}
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Find the pivot index so elements smaller are on the left, larger on the right
			int pi = partition(arr, low, high);

			// Recursively sort elements before and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Choosing the last element as the pivot
		int i = low - 1; // Index of smaller element

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// Place the pivot in its correct sorted position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
