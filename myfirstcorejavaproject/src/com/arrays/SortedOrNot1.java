package com.arrays;
import java.util.Scanner;
public class SortedOrNot1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Elements in Array :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean sorted=true;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
		}
		if(sorted) {
			System.out.println("Array is Sorted in Ascending Order");
		}
		else {
			System.out.println("Array is Not Sorted");
		}
		sc.close();
	}
}
