package com.javaintro;

public class AddingArrays {

	public static void main(String[] args) {
		
		int arr1[][] = new int[3][3];
		arr1[0] = new int[] {1,2,1};
		arr1[1] = new int[] {9,7,2};
		arr1[2] = new int[] {7,6,4};
		
		int arr2[][] = new int[3][3];
		arr2[0] = new int[] {2,6,8};
		arr2[1] = new int[] {0,1,3};
		arr2[2] = new int[] {1,2,4};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("    ");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("    ");
		int[][] output = new int[3][3];
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				output[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(output[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
