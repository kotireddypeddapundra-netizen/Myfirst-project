package com.arrays;

public class PairIntegersSum {

	public static void main(String[] args) {

		int[] arr = { 7, 0, 1, 4, 3, 6, 5 };
		int target = 7;

		for (int i = 0; i < arr.length; i++) {
//			int p1=arr[0];
//			int p2=arr[0];

			for (int j = i+1; j < arr.length - 1; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " , " + arr[j]);
				}

			}

		}

	}

}
