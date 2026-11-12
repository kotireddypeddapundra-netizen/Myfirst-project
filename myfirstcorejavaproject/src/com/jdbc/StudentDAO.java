package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDAO {

	public static void main(String[] args) {

		try {
			// Loading The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating Connection Object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// Creating Statement Object
			Statement st = con.createStatement();

			// Result
			int n = st.executeUpdate("insert into student values(1,'KL RAHUL',100)");

			if (n > 0) {
				System.out.println(n + " Rows Affected");
			} else {
				System.out.println("Something Went Wrong");
			}
			// Connection Close

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
