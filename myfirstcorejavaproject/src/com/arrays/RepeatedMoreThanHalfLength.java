package com.arrays;

public class RepeatedMoreThanHalfLength {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 0, 0, 1, 0 };

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
				visited[j] = true;
			}
			if (count > arr.length / 2) {
				System.out.println(arr[i]);
			} else {
				System.out.println("No Elements Frequency Greater Than Half The Array Length");
			}
		}

	}

}
