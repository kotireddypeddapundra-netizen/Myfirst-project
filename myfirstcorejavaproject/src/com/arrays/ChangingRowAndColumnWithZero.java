package com.arrays;

import java.util.Arrays;

public class ChangingRowAndColumnWithZero {

	public static void main(String[] args) {

		int[][] matrix = {
				{1,1,0},
				{1,1,1},
				{0,1,1}
		};
		
		System.out.println("Before : ");
		for (int[] array : matrix) {
			System.out.println(Arrays.toString(array));
		}
		
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				
				if(matrix[i][j]==0) {
					rows[i]=1;
					columns[j]=1;
				}
				
			}
		}
		System.out.println("Rows : "+Arrays.toString(rows));
		System.out.println("Columns : "+Arrays.toString(columns));
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				
				if(rows[i]==1 || columns[j]==1) {
					matrix[i][j]=0;
				}
				
			}
		}
		System.out.println("After : ");
		for (int[] array : matrix) {
			System.out.println(Arrays.toString(array));
		}
		
		
	}

}
