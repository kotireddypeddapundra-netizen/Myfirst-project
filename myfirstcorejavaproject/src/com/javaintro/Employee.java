package com.javaintro;

public class Employee {
	int eid;
	String ename;
	static int orgId = 555;
	static String orgName = "Vcube";
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.eid = 45;
		e.ename= "Koti Reddy";
		System.out.println(orgId);
		System.out.println(orgName);
		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);
		System.out.println(e.orgId);
		System.out.println(e.orgName);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(e.eid);
		System.out.println(e.ename);
		
	}

}



