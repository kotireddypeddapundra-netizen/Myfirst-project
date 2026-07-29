package com.javaintro;

public class SquareArray {

	public static void main(String[] args) {
		
		int arr[][] = {
				{2,3,5},
				{0,1,3},
				{1,2,4}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("   ");
		int square[][] = new int[3][3];
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++){
				square[i][j] = arr[i][j]*arr[i][j];
				System.out.print(square[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

}
