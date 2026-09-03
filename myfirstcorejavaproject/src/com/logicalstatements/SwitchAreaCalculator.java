package com.logicalstatements;

import java.util.Scanner;

public class SwitchAreaCalculator {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("*****Welcome To Area Calculator*****");
		
		String yesno;
				
		do {
			System.out.println("Enter The Shape To Calculate Area");
			String shape = sc.next().toUpperCase();
			
			double result = 0;
			
			switch(shape) {
			
			case "SQUARE" ->{
				System.out.println("Enter The Side Of The Square : ");
				double side = sc.nextDouble();
				result = side*side;
				System.out.println("The Area Of The Square Is : ");
			}
			case "RECTANGLE" ->{
				System.out.println("Enter The Length Of The Rectangle : ");
				double length = sc.nextDouble();
				System.out.println("Enter The Breadth Of The Rectangle : ");
				double breadth = sc.nextDouble();
				result = length*breadth;
				System.out.println("The Area Of The Rectangle Is : ");
			}
			case "TRIANGLE" ->{
				System.out.println("Enter The Base Of The Triangle : ");
				double base = sc.nextDouble();
				System.out.println("Enter The Height Of The Triangle : ");
				double height = sc.nextDouble();
				result = base*height;
				System.out.println("The Area Of The Triangle Is : ");
			}
			case "CIRCLE" ->{
				System.out.println("Enter The Radius Of The Circle : ");
				double radius = sc.nextDouble();
				result = (double)22/7*radius*radius;
				System.out.println("The Area Of The Circle Is : ");
			}
			default ->{
				System.out.println("Invalid Shape Entered");
			}
			
			}
			System.out.println(result);
			
			System.out.println("Do You Want To Continue Click Yes Else No");
			yesno=sc.next();
			
		}while(yesno.equalsIgnoreCase("yes"));
		System.out.println("Completed Area Measurement");
		
		sc.close();
	}

}
