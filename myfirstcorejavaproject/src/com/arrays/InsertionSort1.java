package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int[]arr = new int[size];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting :"+Arrays.toString(arr));
		
		for(int i=1;i<arr.length;i++) {
			
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("After Sorting :"+Arrays.toString(arr));
		sc.close();
	}
}