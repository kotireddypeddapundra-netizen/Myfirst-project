package com.assignment;

public class Constructors1 {
	
	String employeeName;
	double salary;
	String companyName;
	
	public Constructors1(String employeeName,double salary,String companyName) {

		this.employeeName=employeeName;
		this.salary=salary;
		this.companyName=companyName;
		
	}
	
	public static void main(String[] args) {

		Constructors1 c1 = new Constructors1("ROHIT SHARMA", 2500000, "BCCI");
		c1.display();
	}
	void display() {
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Company Name : "+companyName);
		System.out.println("Salary : "+employeeName);

	}

}
