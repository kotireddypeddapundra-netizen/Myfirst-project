package com.javaintro;
import java.util.Scanner;
public class MaxNumIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		System.out.println("enter values : " );
		for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		}
		
//		int[] arr = {20,50,40,80,66,44,88,597,451,487,555};
		
		int max=arr[0];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println("max value = " +max);
		System.out.println("index = " +index);
		sc.close();
	}

}
