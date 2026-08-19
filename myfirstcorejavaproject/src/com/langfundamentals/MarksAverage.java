package com.langfundamentals;

import java.util.Scanner;

public class MarksAverage {
	static Scanner sc = new Scanner(System.in);
	
	double average() {
		System.out.print("Enter Telugu Marks : ");
		int telugu = sc.nextInt();
		System.out.print("Enter Hindi Marks : ");
		int hindi = sc.nextInt();
		System.out.print("Enter English Marks : ");
		int english = sc.nextInt();
		System.out.print("Enter Maths Marks : ");
		int maths = sc.nextInt();
		System.out.print("Enter Science Marks : ");
		int science = sc.nextInt();
		System.out.print("Enter Social Marks : ");
		int social = sc.nextInt();
		
		int total = telugu+hindi+english+maths+science+social;
		System.out.println("Total Marks are : "+total);
		
		double avg = total/6;
		
		return avg;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Started.....");
		
		MarksAverage m = new MarksAverage();
		
		double avg = m.average();
		System.out.println("The Average Marks are : "+avg);
		
		System.out.println("Main Method Ended.....");
		
	}
}
