package com.javaintro;

public class StudentInfo {
	
	static String collegeName="CHRISTU JYOTHI INSTITUTE OF TECHNOLOGY AND SCIENCE";
	int studentID;
	String studentName;
	int teluguMarks;
	int englishMarks;
	int hindiMarks;
	
	void calculateTotal(){
		int sum = teluguMarks+englishMarks+hindiMarks;
		System.out.println("Total Marks : "+sum);
	}
	void calculatePercentage() {
		int sum = teluguMarks+englishMarks+hindiMarks;
		double percentage = ((double)sum/300)*100;
		System.out.println("Percentage : "+percentage);
	}
	void display() {
		System.out.println("College Name : "+collegeName);
		System.out.println("Student ID : "+studentID);
		System.out.println("Student Name : "+studentName);
		
	}

	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo();
		s1.studentID=6648001;
		s1.studentName="PEDDAPUNDRA KOTI REDDY";
		s1.teluguMarks=95;
		s1.hindiMarks=90;
		s1.englishMarks=85;
		s1.display();
		s1.calculateTotal();
		s1.calculatePercentage();
		
	}

}
