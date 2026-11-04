package com.oops;

public class PermanentEmployee extends TestEmployee {

	double hra;

//	@Override
//	void display() {
//		System.out.println("Employee Id : " + id);
//		System.out.println("Employee Name : " + name);
//		System.out.println("Salary : " + salary);
//	}

	@Override
	void calculateSalary() {
		System.out.println("Fixed Salary : " + salary);
		System.out.println("HRA : " + hra);
	}

	PermanentEmployee(int id, String name, double salary, double hra) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hra = hra;
	}

}
