package com.oops.poc;

import java.util.Scanner;

public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	@Override
	public boolean validateAadhar(String aadhar) {
		return aadhar.matches("[1-9]{1} [0-9]{11}");
	}

	@Override
	public boolean validatePhone(String phone) {
		return phone.matches("[6-9]{1} [0-9]{9}");
	}

	@Override
	public boolean validatePAN(String pan) {
		return pan.matches("[A-Z]{5} [0-9]{4} [A-Z]{1}");
	}

	@Override
	public double getCustomerSalary() {
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCustomerAge() {
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public int getCibilScore() {
		System.out.println("Enter Your Cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public double getROI() {

		double roi = 8.0;
		int cibil = getCibilScore();

		if (cibil >= 300 && cibil <= 599) {
			System.out.println(
					"Poor score; high risk for lenders, loan applications may be rejected or approved at high interest rates ");
			roi=roi+4;
		} else if (cibil >= 600 && cibil <= 699) {
			System.out.println("Fair score; moderate risk, may face stricter loan terms");
			roi=roi+3;
		} else if (cibil >= 700 && cibil <= 900) {
			System.out.println(
					"Excellent score; lowest risk, easier loan approval, and potential for higher loan amounts at lower interest rates ");
			roi=roi+1.5;
		} else {
			System.out.println("Invalid Cibil info ");
		}

		return roi;
	}

}
