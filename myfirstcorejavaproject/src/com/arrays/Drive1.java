package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Drive1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array :");
		int n = sc.nextInt();

		int arr[] = new int[n];
		int[] result = new int[n];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			result[i]=arr[i];

			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					result[i]=arr[i]-arr[j];
					break;
				}
			}
		}
		System.out.println("Result Array :"+Arrays.toString(result));
		
//		for(int i=0;i<n;i++) {
//			System.out.print(result[i] +",");
//		}
		sc.close();
	}
}
