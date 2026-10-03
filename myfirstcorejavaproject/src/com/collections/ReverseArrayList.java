package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

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

		int first = 0;
		int last = numbers.size() - 1;

		System.out.println("Reversed Array : ");
		while (first < last) {
			int temp = numbers.get(first);
			numbers.set(first, numbers.get(last));
			numbers.set(last, temp);
			first++;
			last--;
		}
		
		System.out.println(numbers);

	}

}
