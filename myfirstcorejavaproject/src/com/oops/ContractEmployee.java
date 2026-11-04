package com.oops;

public class ContractEmployee extends TestEmployee {

	int hours;

	@Override
	void display() {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Wage Per Hour : " + salary);
	}

	@Override
	void calculateSalary() {
		salary = hours * salary;
		System.out.println("Wage Per " + hours + " In A Day : " + salary);
	}

	ContractEmployee(int id, String name, double salary, int hours) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hours = hours;
	}

}
