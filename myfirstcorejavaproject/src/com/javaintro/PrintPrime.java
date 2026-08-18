package com.javaintro;
import java.util.Scanner;
public class PrintPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		System.out.println("prime numbers fom 1 to "+n+" are:");
		int count=0;
		for(int num=2;num<=n;num++) {
		boolean isprime = true;
		
			for(int i=2;i<=num;i++) {
				count++;
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println(num+"");
		}
		
		}
		System.out.println("count : "+count);
		sc.close();
	}

}
