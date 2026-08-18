package com.arrays;
import java.util.Scanner;
public class AverageArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		double average = (double)sum/n;
		System.out.println("The Average of the Array Elements is :"+average);
		sc.close();
	}

}
