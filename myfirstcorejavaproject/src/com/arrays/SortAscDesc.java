package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAscDesc {

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

		Collections.sort(numbers);
		System.out.println("Ascending : " + numbers);

		int start = 0;
		int end = numbers.size() - 1;
		while (start < end) {
			int temp = numbers.get(start);
			numbers.set(start, numbers.get(end));
			numbers.set(end, temp);
			start++;
			end--;
		}

//		numbers.sort(Collections.reverseOrder());
		System.out.println("Descending : " + numbers);

	}

}
