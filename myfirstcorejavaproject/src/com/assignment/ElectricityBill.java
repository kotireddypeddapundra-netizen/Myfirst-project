package com.assignment;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Connection Type");
		String connectionType = sc.next().toUpperCase();

		switch (connectionType) {

		case "DOMESTIC" -> {
			System.out.println("Enter Number Of Units Consumed");
			double units = sc.nextDouble();
			double bill = 0;
			if (units < 0) {
				System.out.println("Invalid Units Entered");
			} else if (units >= 0 && units <= 100) {
				bill = units * 2;
			} else if (units > 100 && units <= 300) {
				bill = units * 3;
			} else {
				bill = units * 4;
			}
			System.out.println("The Total Electricity Bill To Be Paid Is : " + bill);

		}
		case "COMMERCIAL" -> {
			System.out.println("Enter Number Of Units Consumed");
			double units = sc.nextDouble();
			double bill = 0;
			if (units < 0) {
				System.out.println("Invalid Units Entered");
			} else if (units >= 0 && units <= 100) {
				bill = units * 4;
			} else if (units > 100 && units <= 300) {
				bill = units * 6;
			} else {
				bill = units * 8;
			}

			System.out.println("The Total Electricity Bill To Be Paid Is : " + bill);

		}

		default -> System.out.println("Invalid Connection Type Entered");

		}

	}
}
