package com.arrays;
import java.util.Scanner;
public class PositiveNegativeCount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter Array Elements :");

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int positiveCount=0;
		int negativeCount=0;
		int zerosCount=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				positiveCount++;
			}
			else if (arr[i]<0){
				negativeCount++;
			}
			else {
				zerosCount++;
			}
		}
		System.out.println("Positive Numbers Count ="+positiveCount);
		System.out.println("Negative Numbers Count ="+negativeCount);
		System.out.println("Zeros Count ="+zerosCount);
		sc.close();
	}
}