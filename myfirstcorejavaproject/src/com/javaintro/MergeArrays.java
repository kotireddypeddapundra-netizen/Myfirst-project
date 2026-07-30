package com.javaintro;
//import java.util.Scanner;
public class MergeArrays {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		String[] arr1 = {"chai","coffee"};
		String[] arr2 = {"milk","water","coke"};
		
		String[] arr3 = new String[arr1.length + arr2.length];
		
		int index = 0;
		
		for(int i=0;i<arr1.length;i++) {
			arr3[index]=arr1[i];
			index++;
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[index]=arr2[i];
			index++;
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i] +" ");
		}
	}

}

