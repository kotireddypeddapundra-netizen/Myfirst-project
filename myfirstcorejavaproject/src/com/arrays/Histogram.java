package com.arrays;

public class Histogram {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 6, 2, 3 };
		int maxArea = 0;

		for (int i = 0; i < arr.length; i++) {
			int height = arr[i];
			int width = 1;

			for (int left = 0; left < i; left++) {
				if (arr[left] >= arr[i]) {
					width++;
				} else {
					break;
				}

			}
			for (int right = arr.length - 1; right > i; right--) {
				if (arr[right] >= arr[i]) {
					width++;
				} else {
					break;
				}

			}

			int area = height * width;
			if ((area) > maxArea) {
				maxArea = area;
			}

		}
		System.out.println("Max Area Is : " + maxArea);

	}

}
