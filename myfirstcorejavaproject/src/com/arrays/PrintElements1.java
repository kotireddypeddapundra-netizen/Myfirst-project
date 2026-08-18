package com.arrays;
import java.util.Scanner;
public class PrintElements1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size : ");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		
		System.out.println("Enter "+number+" Elements");
		
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array Elements Are :");
		
		for(int i=0;i<number;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
