package com.arrays;

import java.util.Scanner;

public class SumArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[i][j];
				
			}
		}
		System.out.println("Sum Of Elements In Matrix Is : "+sum);
		
	}

}
