package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest_SmallestInArrayList {

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
		System.out.println("Elements : ");
		for (int num : numbers) {
			System.out.println(num);
		}
		largest(numbers);
		smallest(numbers);
	}

	static void largest(List<Integer> numbers) {
		int largest = numbers.get(0);

		for (int num : numbers) {
			if (num > largest)
				largest = num;
		}
		System.out.println("Largest = " + largest);
	}

	static void smallest(List<Integer> numbers) {
		int smallest = numbers.get(0);

		for (int num : numbers) {
			if (num < smallest)
				smallest = num;
		}
		System.out.println("Smallest = " + smallest);
	}
}
