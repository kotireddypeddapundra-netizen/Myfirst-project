package com.gut;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp =  arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;	
		}
		for(int numbers : arr) {
			System.out.print(numbers+" ");
		}	
	}

}
