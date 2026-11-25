
package com.jdbc;

public class Employee {

	private int empNo;
	private String eName;
	private double salary;
	private int deptno;

	public Employee() {

	}

	public Employee(int empNo, String eName, double salary, int deptno) {
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
		this.deptno = deptno;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
}
