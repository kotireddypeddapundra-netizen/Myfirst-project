package com.arrays;
import java.util.Scanner;
public class SearchElement1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter an Element to Search :");
		int search = sc.nextInt();
		
		boolean found=false;

		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.println("Element Found at :"+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element Not Found ");
		}
		sc.close();
	}
}