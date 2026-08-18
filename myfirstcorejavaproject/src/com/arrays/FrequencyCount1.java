package com.arrays;
import java.util.Scanner;
public class FrequencyCount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a Number to Search");
		int search = sc.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				count++;
			}
		}
		System.out.println("Frequency of "+search+" = " +count);
		sc.close();
	}
}
