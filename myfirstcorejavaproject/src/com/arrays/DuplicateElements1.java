package com.arrays;
import java.util.Scanner;
public class DuplicateElements1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Elements in Array :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate values");
		boolean duplicate=false;

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					duplicate=true;
					break;
				}
			}
		}
		if(!duplicate) {
			System.out.println("No Duplicate Elements");
		}

		sc.close();
	}
}
