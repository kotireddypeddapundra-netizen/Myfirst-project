package com.langfundamentals;

public class Student {
	
	Integer studentID;
	String studentName;
	String gender;
	String branchName;
	static String collegeName = "CHRISTU JYOTHI INSTITUTE OF TECHNOLOGY AND SCIENCE";
	
	void studentDetails() {
		System.out.println("College Name : "+collegeName);
		System.out.println("Student ID : "+studentID);
		System.out.println("Student Name : "+studentName);
		System.out.println("Gender : "+gender);
		System.out.println("Branch Name : "+branchName); 
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		 s1.studentID=6648;
		 s1.studentName="Koti Reddy";
		 s1.gender="Male";
		 s1.branchName="ECE";
		 s1.studentDetails();
		 
		 System.out.println("***************************************************");
		 
		 Student s2 = new Student();
		 s1.studentID=6730;
		 s1.studentName="Ramesh";
		 s1.gender="Male";
		 s1.branchName="ECE";
		 s2.studentDetails();
	}

}
