package com.javaintro;

public class SumMultidimensionalArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		arr[0][1]=8;
		arr[0][2]=4;
		
		arr[1][0]=9;
		arr[1][1]=7;
		arr[1][2]=2;
		
		arr[2][0]=7;
		arr[2][1]=6;
		arr[2][2]=4;
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + "   ");
				sum=sum+arr[i][j];
			}
//			System.out.println();
			
		}
		System.out.println(sum);
		
	}
}
