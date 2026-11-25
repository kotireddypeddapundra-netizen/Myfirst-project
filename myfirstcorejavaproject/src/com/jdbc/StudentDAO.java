//package com.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class StudentDAO {
//
//	public static void main(String[] args) {
//
//		try {
//			// Loading The Driver Class
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			// Creating Connection Object -------> Connection Establishment
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
//
//			// Creating Statement Object 
//			Statement st = con.createStatement();
//
//			// Result
//			int n = st.executeUpdate("insert into student values(1,'KL RAHUL',100)");
//
//			if (n > 0) {
//				System.out.println(n + " Rows Affected");
//			} else {
//				System.out.println("Something Went Wrong");
//			}
//			// Connection Close
//			con.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}

// Using Prepared Statement To Avoid SQL Injection

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

	public static void main(String[] args) {

		try {
			// Loading The Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating Connection Object -------> Connection Establishment
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			// Creating Statement Object 
			PreparedStatement ps = con.prepareStatement("select * from student where stno=? and stname=?");
			ps.setInt(1, 1);
			ps.setString(2, "kl rahul");

			// Result
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" ----- "+rs.getString(2)+" ----- "+rs.getInt(3));
			}
			// Connection Close
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

