package com.arrays;
import java.util.Scanner;
public class GreaterThanNumberCount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Elements in Array :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>num) {
				count++;
			}
		}
		System.out.println("Numbers Greater Than "+num+ " are " +count);
		sc.close();
	}
}
