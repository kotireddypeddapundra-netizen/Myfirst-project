package com.javaintro;
import java.util.Scanner;
public class ArrayEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("Enter 10 Numbers:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even Numbers are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
		
		}

}
