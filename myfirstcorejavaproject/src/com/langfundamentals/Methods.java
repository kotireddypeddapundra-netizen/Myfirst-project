package com.langfundamentals;
import java.util.Scanner;
public class Methods {
	
	public static void student(String name,int marks) {
		System.out.println("Student Name :"+name);
		System.out.println("Student Marks :"+marks);
	}
	void employee(int ID,String name,double salary) {
		System.out.println("Employee ID :"+ID);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name :");
		String sName = sc.nextLine();
		
		System.out.println("Student Marks :");
		int sMarks = sc.nextInt();
		student(sName, sMarks);
		
		System.out.println("****************************************************************");
		
		Methods m1 = new Methods();
		
		System.out.println("Enter Employee ID :");
		int eID = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Employee Name :");
		String eName = sc.nextLine();
		
		System.out.println("Enter Employee Salary :");
		double esal = sc.nextDouble();
		m1.employee(eID, eName, esal);
		
		System.out.println("****************************************************************");
		sc.close();
	}

}
