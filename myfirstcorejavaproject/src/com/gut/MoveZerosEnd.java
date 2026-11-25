package com.gut;

import java.util.Arrays;

public class MoveZerosEnd {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };
		
		System.out.println("Move Zeros Right : ");
		moveRight(arr);
		System.out.println("Move Zeros Left : ");
		moveLeft(arr);
		
	}
	public static void moveRight(int[] arr) {
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void moveLeft(int[] arr) {
		
		int index = arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
