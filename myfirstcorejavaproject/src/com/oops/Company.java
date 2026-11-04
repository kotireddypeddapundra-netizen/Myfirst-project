package com.oops;

public class Company {

	public static void main(String[] args) {

		PermanentEmployee p = new PermanentEmployee(445,"KOTI REDDY",50000,10000);
		ContractEmployee c = new ContractEmployee(207, "MANOHAR", 501,5);
		
		p.display();
		p.calculateSalary();
		System.out.println("**************************************");
		c.display();
		c.calculateSalary();
		
		
	}

}
