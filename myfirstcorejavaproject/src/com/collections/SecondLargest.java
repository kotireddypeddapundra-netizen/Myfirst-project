package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Enter Number Of Elements You Wanna Insert : ");
		int n = sc.nextInt();
		System.out.println("Enter Elements : ");

		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}
		System.out.println("Array List : " + numbers);

		Integer largest = null;
		Integer second = null;

		for (int num : numbers) {

			if (largest == null || num > largest) {
				second = largest;
				largest = num;
			} else if ((second == null || num > largest) && num != second) {
				second = num;
			}

		}
		if (second == null) {
			System.out.println("Second largest does not exist.");
		} else {
			System.out.println("Second largest: " + second);
		}

	}

}
