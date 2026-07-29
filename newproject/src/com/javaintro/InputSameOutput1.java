package com.javaintro;

public class InputSameOutput1 {

	public static void main(String[] args) {
		
		int arr1[][] = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		int arr2[][] = {
				{1,6,1},
				{0,7,3},
				{1,6,4}

	};
		int[][] output = new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("   ");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"   ");
			}
			System.out.println();
			
		}
		System.out.println("   ");
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					output[i][j]=1;
				}
				else {
					output[i][j]=0;
				}
				System.out.print(output[i][j] +"   ");
			}
			System.out.println();
		}

}
}