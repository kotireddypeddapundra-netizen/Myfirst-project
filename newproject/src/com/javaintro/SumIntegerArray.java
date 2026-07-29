package com.javaintro;
import java.util.Scanner;
public class SumIntegerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]numbers = new int[5];
		int sum=0;
		
		System.out.println("enter 5 integers:");
		for(int i=0;i<numbers.length;i++) {
			System.out.println("enter number" + (i+1) + ": ");
			numbers[i]=sc.nextInt();
			sum = sum+numbers[i];
		}
//		for(int i=0;i<numbers.length;i++) {
//			sum = sum+numbers[i];
//		}
		System.out.println("sum of integers = " + sum);
		sc.close();

	}

}
