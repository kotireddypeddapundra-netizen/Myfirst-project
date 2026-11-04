package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArrayLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Elements You Wanna Add In First List : ");
		int n1 = sc.nextInt();

		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println("Add Elements To First List : ");
		for (int i = 0; i < n1; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("How Many Elements You Wanna Add In Second List : ");
		int n2 = sc.nextInt();

		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Add Elements To Second List : ");
		for (int i = 0; i < n2; i++) {
			list2.add(sc.nextInt());
		}
		System.out.println("Array List 1: " + list1);
		System.out.println("Array List 2: " + list1);

		list1.addAll(list2);
		System.out.println("Merged List : " + list1);

	}

}
