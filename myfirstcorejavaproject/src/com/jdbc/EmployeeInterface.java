package com.jdbc;

import java.util.List;

public interface EmployeeInterface {
	
	boolean InsertEmployee(Employee e);
	
	List<Employee> RetriveAllEmployees();
	
	Employee RetriveEmplyeeById(int empId);
	
	boolean UpdateEmployeeById(Employee e, int id);
	
	boolean deleteEmployeeById(int id);

}
