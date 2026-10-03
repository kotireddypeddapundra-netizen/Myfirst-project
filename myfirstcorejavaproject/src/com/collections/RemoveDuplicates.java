package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

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
		
		ArrayList<Integer>unique = new ArrayList<>();
		
		for(int num:numbers) {
			if(!unique.contains(num)) {
				unique.add(num);
			}
			
		}
		System.out.println("Removed Duplicate : "+unique);
		
		
	}

}
