package com.assignment;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double rentPerHour = 50;
		double totalCompanyIncome = 0;

		System.out.println("Enter Number Of Customers : ");
		int customers = sc.nextInt();

		for (int i = 1; i <= customers; i++) {

			System.out.println("Enter Number Of Bikes Rented By Customer " + i + " : ");
			int numberOfBikes = sc.nextInt();
			double customerBill = 0;
			int bike = 1;

			while (bike <= numberOfBikes) {
				System.out.println("Enter Rental Hours For Bike " + bike + " : ");
				double hours = sc.nextDouble();
				double charge = hours * rentPerHour;

				if (hours > 5) {
					charge = charge - (charge * 10 / 100);
				}
				System.out.println("Charge For Bike " + bike + " : " + charge);
				customerBill = customerBill + charge;
				bike++;
			}
			System.out.println("Bill Of Customer " + i + " : " + customerBill);
			totalCompanyIncome = totalCompanyIncome + customerBill;

		}
		System.out.println("Total Income For The Day : " + totalCompanyIncome);
		sc.close();

	}

}
