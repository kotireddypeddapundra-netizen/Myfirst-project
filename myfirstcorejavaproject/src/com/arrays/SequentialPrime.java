package com.arrays;

public class SequentialPrime {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 0, 0 }, 
				{ 0, 1, 0 }, 
				{ 0, 0, 1 } };

		int num2 = 2;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				int num = i + j;
				if (isPrime(num)) {
					arr[i][j] = num2;
					num2 = printPrime(num2+1);
				}

			}

		}
			for (int[] elements : arr) {
				for(int element : elements) {
					System.out.print(element + " ");
				}
				System.out.println();
			}

	}

	static boolean isPrime(int num) {
		boolean status = true;
		if (num <= 1) {
			status = false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	static int printPrime(int num2) {

		while (!isPrime(num2)) {
			num2++;
		}
		return num2;

	}

}
