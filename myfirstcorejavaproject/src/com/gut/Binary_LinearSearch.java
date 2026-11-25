package com.gut;

public class Binary_LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 40;
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				found = true;
				System.out.println("Index Using Linear Search = " + i);
			}
		}
		if(!found) {
			System.out.println("Using Linear Search : "+-1);
		}
		
		int result = binary(arr,target);
		System.out.println("Using Binary Search : "+result);

	}

	public static int binary(int[] arr, int target) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {

			int mid = (right + left) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;

	}

}
