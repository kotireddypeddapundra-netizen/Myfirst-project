package com.oops;

class Employee {

	int eId;
	String eName;
	Department department;
	
	Employee(int eId,String eName,Department department){
		this.eId=eId;
		this.eName=eName;
		this.department=department;
	}

	public Employee(Employee e1) {
		this.eId=e1.eId;
		this.eName=e1.eName;
		this.department=new Department(e1.department);
	}

}

class Department {

	String name;
	
	Department(String name){
		this.name = name;
	}

	public Department(Department department) {
		this.name=department.name;
	}

	
}

public class DeepCopy1 {

	public static void main(String[] args) {

		Department d = new Department("Electronics & Communications Engineering");
		Employee e1 = new Employee(445,"KOTI REDDY",d);
		
		System.out.println("Employee Id : "+e1.eId);
		System.out.println("Employee Name : "+e1.eName);
		System.out.println("Department Name : "+e1.department.name);
		System.out.println("********************************************************");
		
		Employee e2 = new Employee(e1);
		System.out.println("Employee Id : "+e2.eId);
		System.out.println("Employee Name : "+e2.eName);
		System.out.println("Department Name : "+e2.department.name);
		System.out.println("********************************************************");
		
		e2.eId=45;
		e2.eName="ROHIT SHARMA";
		e2.department.name="WORLD CUP";
		
		System.out.println("Employee Id : "+e2.eId);
		System.out.println("Employee Name : "+e2.eName);
		System.out.println("Department Name : "+e2.department.name);
		System.out.println("********************************************************");
		System.out.println("Employee Id : "+e1.eId);
		System.out.println("Employee Name : "+e1.eName);
		System.out.println("Department Name : "+e1.department.name);
		System.out.println("********************************************************");
		
		
	}

}
