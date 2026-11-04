package com.oops;

public class TestEmployee {
	
	String name;
	int id;
	double salary;
	
	void display() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Salary : "+salary);
	}
	
	void calculateSalary(){
		System.out.println("Salary From Test Employee Parent Class");
	}

}
