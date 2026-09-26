package com.arrays;

import java.util.Scanner;

public class Merge2Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of First Array : ");
		int s1 = sc.nextInt();
		
		int[] arr1 = new int[s1];
		System.out.print("Enter Elements In First Array : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter Size Of Second Array : ");
		int s2 = sc.nextInt();
		
		int[] arr2 = new int[s2];
		System.out.print("Enter Elements In Second Array : ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[]result = new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			result[s1+i]=arr2[i];
		}
		System.out.println("Merged Array : ");
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
