package com.javaintro;
import java.util.Scanner;
public class PrintArmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		System.out.println("armstrong numbers from 1 to" + n + "are");
		for(int num=1;num<=n;num++) {
			int original=num;
			int sum=0;
			int temp=num;
			
			while(temp!=0) {
				int digit=temp%10;
				sum=sum+(digit*digit*digit);
				temp=temp/10;
			}
			if(sum==original) {
				System.out.println(original+"");
			}
		}
		
		
		sc.close();
	}

}
