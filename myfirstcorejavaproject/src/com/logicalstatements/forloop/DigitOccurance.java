package com.logicalstatements.forloop;

import java.util.Scanner;

public class DigitOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		digitOccurance(num);
		
		sc.close();
	}
	public static void digitOccurance(int num) {
		
		for(int digit=0;digit<=9;digit++) {
			
			int count=0;
			
			for(int temp=num;temp!=0;temp=temp/10) {
				int currentDigit=temp%10;
				if(currentDigit==digit) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("The Count Of "+digit+" Is "+count);
			}
		}
		
		
	}

}
