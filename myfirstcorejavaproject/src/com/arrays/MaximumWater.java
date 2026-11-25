package com.arrays;

public class MaximumWater {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int width = 1;
			for (int j = i + 1; j < arr.length; j++) {
				int currentWater;

				if (arr[i] <= arr[j]) {
					currentWater = arr[i] * width;
				} else {
					currentWater = arr[j] * width;
				}

				if (currentWater > max) {
					max = currentWater;
				}
				width++;

			}

		}
		System.out.println("Maximum Volume In A Container : "+max);
	}

}
