package com.assignment;

import java.util.Scanner;

import com.javaintro.Grade;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Marks : ");
		int marks = sc.nextInt();
		
		String grade = (marks>100 || marks<0)?"Invalid Marks":
			(marks>=91)?"S Grade":
				(marks>=81)?"A Grade":
					(marks>=71)?"B Grade":
						(marks>=51)?"C Grade":
							(marks>=41)?"D Grade":
								(marks>=35)?"E Grade":"Failed";
									
		
		System.out.println("The Grade Is : "+grade);
		
		
		
	}

}
