package com.arrays;

import java.util.Scanner;

public class LeaderElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of An Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter Array Elements : ");

		for (int i = 0; i < arr.length; i++) {// 12 3 7 9 6 3 1
			arr[i] = sc.nextInt();
		}
		System.out.println("Leader Elements Are : ");

		for (int i = 0; i < arr.length; i++) {
			boolean isLeader=true;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					isLeader=false;
					break;
				}
				
			}
		if(isLeader) {
			System.out.println(arr[i]);
		}
		}

	}

}
