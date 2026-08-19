package com.javaintro;

import java.util.Scanner;

public class RectangleArea {

	static Scanner sc = new Scanner(System.in);

	float length() {
		System.out.println("Enter Length of Rectangle : ");
		float length = sc.nextFloat();
		return length;

	}
	float breadth() {
		System.out.println("Enter Breadth of Rectangle : ");
		int breadth = sc.nextInt();
		return breadth;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started.....");
		RectangleArea r1 = new RectangleArea();

		double length = r1.length();
		double breadth = r1.breadth();
		double area = length*breadth;
		System.out.println("Area of Rectangle is "+area+" m^2");
		System.out.println("Main Method Ended.....");
	}

}
