package com.langfundamentals;

public class Employeee {

	String employeeName;
	int employeeID;
	String designation;
	String department;
	double salary;
	String remoteLocation;

	static String companyName="Suntech Solutions";
	static String companyLocation="Hi-Tech-City";

	static {
		System.out.println("Welcome to SunTe=ech Solutions! Employee HRMS Portal");
	}
	void displayEmployeeDetails() {
		System.out.println("Company Name :"+companyName);
		System.out.println("Company Location :"+companyLocation);
		System.out.println("Employee ID :"+employeeID);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Department :"+department);
		System.out.println("Designation :"+designation);
		System.out.println("Salary :"+salary);
		System.out.println("Remote Location :"+remoteLocation);
	}
	void promoteEmployee() {
		designation="Team Lead";
		System.out.println("Promoted to :"+designation);
	}
	void updateSalary() {
		salary=salary+50000;
		System.out.println("Updated Salary :"+salary);
	}
	void updateEmployeeLocation() {
		remoteLocation="Warangal";
		System.out.println("Updated Location :"+remoteLocation);
	}


	public static void main(String[] args) {

		Employeee e1 = new Employeee();

		e1.employeeID=101;
		e1.employeeName="Koti Reddy";
		e1.department="Research";
		e1.designation="Java Developer";
		e1.salary=150000;
		e1.remoteLocation="JNTUH";
		e1.displayEmployeeDetails();
		e1.promoteEmployee();
		e1.updateSalary();
		e1.updateEmployeeLocation();
		
		System.out.println("******************************************************************************");

		Employeee e2 = new Employeee();

		e2.employeeID=102;
		e2.employeeName="Ramesh";
		e2.department="Sales";
		e2.designation="Executive";
		e2.salary=100000;
		e2.remoteLocation="KPHB";
		e2.displayEmployeeDetails();
		e2.updateSalary();
	}

}
