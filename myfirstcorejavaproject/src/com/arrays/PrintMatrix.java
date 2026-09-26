package com.arrays;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Rows Of Matrix : ");
		int rows = sc.nextInt();
		System.out.print("Enter Columns Of Matrix : ");
		int columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		System.out.println("Enter Matrix Elements : ");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Matrix Is : ");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
