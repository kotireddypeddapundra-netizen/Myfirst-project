package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Enter Number Of Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter Elements : ");
		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}

		System.out.println("Array List : " + numbers);

		System.out.println("Element At Index : " + numbers.get(3));

		int largest = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}

		}
		System.out.println("Largest : " + largest);
		
		int sum=0;
		
		for(int i=0;i<numbers.size();i++) {
			sum = sum + numbers.get(i);	
		}
		int average = sum/numbers.size();
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
		
		System.out.println("Even Numbers Removed : ");
		for(int i=0;i<numbers.size();i++) {
			
			if(numbers.get(i)%2!=0) {
				System.out.println(numbers.get(i));
			}
			
		}
		
		
		

	}

}
