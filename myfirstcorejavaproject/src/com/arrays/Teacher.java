package com.arrays;

import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Students : ");
		int size = sc.nextInt();

		int[] marks = new int[size];
		System.out.println("Enter Student's Marks : ");
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<marks.length;i++) {
			
				int digit = marks[i]%10;
				if(digit>0 && digit<=5) {
					marks[i]=marks[i]-digit;
				}else if(digit>5 && digit<=9) {
					marks[i]=marks[i]+10-digit;
				
			}
			System.out.println(marks[i]);
		}
		

	}

}
