package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZerosLeftRight {

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

//		MOVE ZEROS TO LEFT
//		10 0 20 0 0 30
//		0 0 0 10 20 30

		int index = numbers.size() - 1;
		for (int i = numbers.size() - 1; i >= 0; i--) {

			if (numbers.get(i) != 0) {
				numbers.set(index, numbers.get(i));
				index--;
			}

		}
		while (index >= 0) {
			numbers.set(index, 0);
			index--;
		}
		System.out.println("Moved Zeros To Left End" + numbers);

//		MOVE ZEROS TO RIGHT
//		10 0 20 0 0 30
//		10 20 30 0 0 0

		int index2 = 0;
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) != 0) {
				numbers.set(index2, numbers.get(i));
				index2++;
			}

		}
		while (index2 < numbers.size()) {
			numbers.set(index2, 0);
			index2++;
		}
		System.out.println("Moved Zeros To Right End" + numbers);

//		ArrayList<Integer> moved = new ArrayList<>();
//		int index = 0;
//
//		for (int num : numbers) {
//			if (num != 0) {
//				moved.add(num);
//				index++;
//			}
//
//		}
//		while(index<numbers.size()) {
//			moved.add(0);
//			index++;
//		}
//		System.out.println("Moved Zeroes To End : "+moved);

	}

}
