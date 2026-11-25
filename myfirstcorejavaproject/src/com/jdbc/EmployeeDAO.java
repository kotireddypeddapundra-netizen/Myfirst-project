
package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements EmployeeInterface {

	@Override
	public boolean InsertEmployee(Employee e) {

		boolean status = false;

		try {
			Connection con = DBConnection.getDBConnection();

			PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?)");

			ps.setInt(1, e.getEmpNo());
			ps.setString(2, e.geteName());
			ps.setDouble(3, e.getSalary());
			ps.setInt(4, e.getDeptno());

			int n = ps.executeUpdate();

			if (n > 0) {
				status = true;
			}

			con.close();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return status;
	}

	@Override
	public List<Employee> RetriveAllEmployees() {

		List<Employee> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getDBConnection();

			PreparedStatement ps = con.prepareStatement("select * from Employee");

			ResultSet set = ps.executeQuery();

			while (set.next()) {

				list.add(new Employee(set.getInt(1), set.getString(2), set.getDouble(3), set.getInt(4)));
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Employee RetriveEmplyeeById(int empId) {

		Employee emp = null;

		try {
			Connection con = DBConnection.getDBConnection();

			PreparedStatement ps = con.prepareStatement("select * from Employee where empNo=?");

			ps.setInt(1, empId);

			ResultSet set = ps.executeQuery();

			if (set.next()) {

				emp = new Employee(set.getInt(1), set.getString(2), set.getDouble(3), set.getInt(4));
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public boolean UpdateEmployeeById(Employee e, int id) {

		boolean status = false;

		try {
			Connection con = DBConnection.getDBConnection();

			PreparedStatement ps = con
					.prepareStatement("update Employee set eName=?, salary=?, deptno=? where empNo=?");

			ps.setString(1, e.geteName());
			ps.setDouble(2, e.getSalary());
			ps.setInt(3, e.getDeptno());
			ps.setInt(4, id);

			int n = ps.executeUpdate();

			if (n > 0) {
				status = true;
			}

			con.close();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return status;
	}

	@Override
	public boolean deleteEmployeeById(int id) {

		boolean status = false;

		try {
			Connection con = DBConnection.getDBConnection();

			PreparedStatement ps = con.prepareStatement("delete from Employee where empNo=?");

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n > 0) {
				status = true;
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return status;
	}
}
