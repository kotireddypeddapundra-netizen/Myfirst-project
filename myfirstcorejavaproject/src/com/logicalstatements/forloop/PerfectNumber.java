package com.logicalstatements.forloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		perfectNumber(num);
		
	}
	public static void perfectNumber(int n){
		
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("The Number Is A Perfect Number");
		}else {
			System.out.println("The Number Is Not A Perfect Number");
		}
	}

}
