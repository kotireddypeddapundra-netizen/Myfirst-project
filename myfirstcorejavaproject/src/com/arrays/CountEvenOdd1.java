package com.arrays;
import java.util.Scanner;
public class CountEvenOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Numbers Count ="+evenCount);
		System.out.println("Odd Numbers Count ="+oddCount);
		sc.close();
	}
}