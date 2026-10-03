package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {

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
		
		int sum = sum(numbers);
		System.out.println("Sum = "+sum);
		double average = sum/numbers.size();
		System.out.println("Average = "+average);
		
	}
	static int sum(List<Integer>numbers) {
		int sum = 0;
		
		for(int num:numbers) {
			sum=sum+num;
		}
		return sum;
		
	}

}
