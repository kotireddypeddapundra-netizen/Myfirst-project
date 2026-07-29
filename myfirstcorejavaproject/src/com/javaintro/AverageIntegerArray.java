package com.javaintro;
import java.util.Scanner;
public class AverageIntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum=0;
		
		System.out.println("enter 5 integers");
		for(int i=0;i<arr.length;i++) {
//			System.out.println("enter number");
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
			
			
		}
		double average = (double)sum/arr.length;
		System.out.println("average of integers = " +average);
		sc.close();
	}

}
