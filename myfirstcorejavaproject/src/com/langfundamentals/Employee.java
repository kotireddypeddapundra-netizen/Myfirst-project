package com.langfundamentals;

public class Employee {
	
	static String employeeName = "James";
	double monthlySalary;
	double monthlyGST;
	double monthlyPF;
	double netMonthlySalary;
	
	double annualGST;
	double annualPF;
	double annualNetSalary;
	
	void monthlyPF() {
		monthlyPF = (monthlySalary)*0.02;
		System.out.println("Monthly Provident Fund : " +monthlyPF);
	}
	void monthlyGST() {
		monthlyGST =(monthlySalary)*0.03;
		System.out.println("Monthly Goods & Service Tax : " +monthlyGST);
	}
	void netMonthlySalary() {
		netMonthlySalary = monthlySalary-monthlyPF-monthlyGST;
		System.out.println("Monthly Net Salary : " +netMonthlySalary);
	}
	void annualGST() {
		annualGST = monthlyGST*12;
		System.out.println("Annual Goods & Service Tax : " +annualGST);
	}
	void annualPF() {
		annualPF = monthlyPF*12;
		System.out.println("Annual Provident Fund : "+annualPF);
	}
	void annualNetSalary() {
		annualNetSalary = netMonthlySalary*12;
		System.out.println("Annual Net Salary : " +annualNetSalary);
	}
	void displayEmployeeDetails() {
		System.out.println("Employee Name : " +employeeName);
		monthlyPF();
		monthlyGST();
		netMonthlySalary();
		annualPF();
		annualGST();
		annualNetSalary();
	}
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.monthlySalary = 50000;
		e.displayEmployeeDetails();
	}

}
