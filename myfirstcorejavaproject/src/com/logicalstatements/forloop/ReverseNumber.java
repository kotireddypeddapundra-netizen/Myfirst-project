package com.logicalstatements.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int reverse = 0;
		
		if(num<0) {
			for(;num<0;num=num/10) {
				int digit=num%10;
				reverse=reverse*10+digit;
			}
		}else {
			for(;num>0;num=num/10) {
				int digit=num%10;
				reverse=reverse*10+digit;
			}
		}
		System.out.println("Reverse Number = "+reverse);
	}

}
