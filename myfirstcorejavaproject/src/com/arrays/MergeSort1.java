package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MergeSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int[]arr = new int[size];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting :"+Arrays.toString(arr));

		divide(arr);

		System.out.println("After Sorting :"+Arrays.toString(arr));
		sc.close();
	}
	public static void divide(int[]arr){
		if(arr.length==1) {
			return;
		}
		int i;
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length-left.length];

		for(i=0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j] = arr[i];
			i++;
		}
		divide(left);
		System.out.println("Left Sort Array :"+Arrays.toString(left));
		divide(right);
		System.out.println("Right Sort Array :"+Arrays.toString(right));
		merge(arr,left,right);

	}
	public static void merge(int[]arr,int[]left,int[]right) {

		int i=0;
		int j=0;
		int k=0;

		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}

}
