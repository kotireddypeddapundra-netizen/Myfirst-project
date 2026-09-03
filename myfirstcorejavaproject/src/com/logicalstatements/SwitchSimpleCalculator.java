package com.logicalstatements;

import java.util.Scanner;

public class SwitchSimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String yesN0;

		do {
			System.out.println("Enter First Number : ");
			double num1 = sc.nextDouble();

			System.out.println("Enter Second Number : ");
			double num2 = sc.nextDouble();

			System.out.println("Enter Any Symbol (+,-,*,/,%) : ");
			String sym = sc.next();

			double result = 0;

			switch (sym) {

			case "+" -> {
				System.out.println("The Addition Of Two Numbers Is : ");
				result = num1 + num2;
			}
			case "-" -> {
				System.out.println("The Subtraction Of Two Numbers Is : ");
				result = num1 - num2;
			}
			case "*" -> {
				System.out.println("The Multiplication Of Two Numbers Is : ");
				result = num1 * num2;
			}
			case "/" -> {
				System.out.println("The Division Of Two Numbers Is : ");
				result = num1 / num2;
			}
			case "%" -> {
				System.out.println("The Modulus Of Two Numbers Is : ");
				result = num1 % num2;
			}
			default -> System.out.println("Entered Symbol Is Invalid");
			}

			System.out.println(result);
			System.out.println("Do You Want To Continue?Type y for Yes Or n For No");
			yesN0 = sc.next();

		} while (yesN0.equalsIgnoreCase("y"));
		
		System.out.println("Thanks For Using Calculator");

		sc.close();

	}

}
