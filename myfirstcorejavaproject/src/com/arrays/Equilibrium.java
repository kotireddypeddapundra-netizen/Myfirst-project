package com.arrays;

public class Equilibrium {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 2, 2 };

		for (int i = 0; i < arr.length; i++) {
			int leftSum = 0;
			int rightSum = 0;

			for (int left = 0; left < i; left++) {
				leftSum += arr[left];
			}
			for (int right = arr.length - 1; right > i; right--) {
				rightSum += arr[right];
			}
			if (leftSum == rightSum) {
				System.out.println("Index Is : " + i + " And Element Is : " + arr[i]);
			}

		}

	}

}
