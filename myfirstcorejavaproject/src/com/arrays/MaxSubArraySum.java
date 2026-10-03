package com.arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = arr[0];
		int sum = arr[0];
		int start = 0, end = 0, tempStart = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > sum + arr[i]) {
				sum = arr[i];
				tempStart = i;
			} else {
				sum = sum + arr[i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				start=tempStart;
				end = i;
			}

		}
		System.out.println("Maximum Sub Array Sum = " + maxSum);
		System.out.println("Max Sub Array Indexed From "+tempStart+" To "+end);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
