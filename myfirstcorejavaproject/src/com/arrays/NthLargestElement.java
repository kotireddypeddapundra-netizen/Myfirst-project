package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 2, 16, 5, 8, 7, 45, 3, 5 };
		
		System.out.println("Enter Which Largest Element You Wanna Find : ");
		int n = sc.nextInt();
		
		if(n<1 || n>arr.length) {
			System.out.println("Invalid Element Entered");
		}

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println("Sorted Array : "+Arrays.toString(arr));
		int result = arr.length-n;
		
		System.out.println(n+"th Largest Element : "+arr[result]);

	}

}
