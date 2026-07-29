package com.javaintro;

public class TransposeMatrixArray {

	public static void main(String[] args) {
		
		int[][]arr = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
		};
		int[][] transpose = new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("   ");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				transpose[i][j] = arr[j][i];
				System.out.print(transpose[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

}
