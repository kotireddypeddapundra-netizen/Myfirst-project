package com.langfundamentals;
import java.util.Scanner;
public class StudentMarks {

	static Scanner sc = new Scanner(System.in);

	int telugu() {
		System.out.println("Enter Telugu Marks : ");
		int telugu = sc.nextInt();
		return telugu;
	}
	int hindi() {
		System.out.println("Enter Hindi Marks : ");
		int hindi = sc.nextInt();
		return hindi;
	}
	int english() {
		System.out.println("Enter English Marks : ");
		int english = sc.nextInt();
		return english;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Main Method Started.....");
		StudentMarks s1 = new StudentMarks();
		
		int marks1 = s1.telugu();
		int marks2 = s1.hindi();
		int marks3 = s1.english();
		
		int totalMarks = marks1+marks2+marks3;
		System.out.println("The Total Marks are : "+totalMarks);
		
		System.out.println("Main Method ended.....");
	}

}
