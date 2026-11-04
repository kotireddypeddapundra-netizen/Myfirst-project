package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Elements You Wanna Add : ");
		int n = sc.nextInt();

		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("Add Elements Into Array List : ");

		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}
		System.out.println("Array List : " + numbers);

		ArrayList<Integer> visited = new ArrayList<>();
		for (int num1 : numbers) {
			int count = 0;
			if (visited.contains(num1)) {
				continue;
			}
			for (int num2 : numbers) {
				if (num1 == num2) {
					count++;
				}
			}
			System.out.println(num1 + " Frequency Is " + count);
			visited.add(num1);

		}

	}

}
