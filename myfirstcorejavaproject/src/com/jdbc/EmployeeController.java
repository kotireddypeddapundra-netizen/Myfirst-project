
package com.jdbc;

import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {

        EmployeeDAO objDAO = new EmployeeDAO();

        // 1. INSERT EMPLOYEE

        Employee emp = new Employee(3, "ROHIT SHARMA", 45000, 1);

        if (objDAO.InsertEmployee(emp)) {
            System.out.println("Inserted Successfully");
        } else {
            System.out.println("Unable To Insert");
        }


        // 2. RETRIEVE ALL EMPLOYEES

        System.out.println("\n----- ALL EMPLOYEES -----");

        List<Employee> list = objDAO.RetriveAllEmployees();

        for (Employee e : list) {
            System.out.println(e);
        }


        // 3. RETRIEVE EMPLOYEE BY ID

        System.out.println("\n----- EMPLOYEE BY ID -----");

        Employee emp1 = objDAO.RetriveEmplyeeById(1);

        if (emp1 != null) {
            System.out.println(emp1);
        } else {
            System.out.println("Employee Not Found");
        }


        // 4. UPDATE EMPLOYEE BY ID

        System.out.println("\n----- UPDATE EMPLOYEE -----");

        Employee emp2 = new Employee(
            1, "VIRAT KOHLI", 75000, 2
        );

        if (objDAO.UpdateEmployeeById(emp2, 1)) {
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Unable To Update");
        }


        // 5. DELETE EMPLOYEE BY ID

        System.out.println("\n----- DELETE EMPLOYEE -----");

        if (objDAO.deleteEmployeeById(3)) {
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Unable To Delete");
        }

    }
}
