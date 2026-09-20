package com.whileloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit To Stop");
		int num = sc.nextInt();
		System.out.println("Enter Which Position You Wanna Print");
		int position=sc.nextInt();
		
		fibonacci(num,position);
		
		sc.close();

	}

	static void fibonacci(int num,int position) {

		int first = 0;
		int second = 1;
		int i = 3;

		if(position==1) {
		System.out.print(first+" ");
		}else if(position==2){
			System.out.print(second+" ");
		}
		else {
			while (i <= num) {
				int next = first + second;
//				System.out.print(next + " ");
				first = second;
				second = next;
				if(position==i) {
					System.out.println(next);
				}
				i++;

			}
			
		}
		

	}
	

}
