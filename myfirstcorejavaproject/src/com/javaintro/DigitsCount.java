package com.javaintro;
import java.util.Scanner;
public class DigitsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int count=0;
		if(num==0) {
			count=1;
		}
		else {
			while (num!=0) {
				count++;
				num=num/10;
				
			}
		}
		System.out.println("number of digits= "+count);
		sc.close();

	}

}

