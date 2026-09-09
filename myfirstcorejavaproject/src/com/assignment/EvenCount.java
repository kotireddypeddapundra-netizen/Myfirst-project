package com.assignment;

import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		
		for(int i=200;i<=n;i++) {
			if(i%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count = "+evenCount);
		System.out.println("Odd Count = "+oddCount);

	}

}
