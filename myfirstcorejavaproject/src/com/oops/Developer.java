package com.oops;

public class Developer extends Employeee{

	String programmingLanguage = "JAVA";
	
	void display() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Programming Language : "+programmingLanguage);
	}
	
	public static void main(String[] args) {

		Developer d1 = new Developer();
		d1.display();
		
	}

}
