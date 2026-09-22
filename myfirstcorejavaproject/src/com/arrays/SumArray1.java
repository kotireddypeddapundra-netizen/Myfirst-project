package com.arrays;
import java.util.Scanner;
public class SumArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter Array Elements :");
		int sum=0;
		int product=1;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println("Sum of Array Elements : "+sum);
		System.out.println("Product Of Array Elements : "+product);
		sc.close();
		
	}

}
