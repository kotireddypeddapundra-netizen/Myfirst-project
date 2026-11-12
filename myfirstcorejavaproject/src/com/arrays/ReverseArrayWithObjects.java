package com.arrays;

import java.util.Arrays;

public class ReverseArrayWithObjects {

	public static void main(String[] args) {

		Object[] arr = { 10, new Object[] { 10, 20, 30 }, 20, new Object[] { 70, 50, 40 }, 70 };
//		OUTPUT : 70,40,50,70,20,30,20,10,10

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			Object temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] instanceof Object[]) {

				Object[] internalArray = (Object[]) arr[i];

				int l = 0;
				int r = internalArray.length - 1;

				while (l < r) {
					Object temp = internalArray[l];
					internalArray[l] = internalArray[r];
					internalArray[r] = temp;
					l++;
					r--;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
