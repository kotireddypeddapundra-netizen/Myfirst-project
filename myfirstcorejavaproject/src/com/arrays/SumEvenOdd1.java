package com.arrays;
import java.util.Scanner;
public class SumEvenOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Elements in Array :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				sumEven=sumEven+arr[i];
			}
			else if(arr[i]%2!=0) {
				sumOdd=sumOdd+arr[i];
			}
		}
		System.out.println("The Sum of All Even Elements in Array are :"+sumEven);
		System.out.println("The Sum of All Odd Elements in Array are :"+sumOdd);
		sc.close();
	}
}
