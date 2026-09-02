package com.oops.poc;

public class HomeLoan extends LoanImpl{

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube banking Home Loan Department");

		HomeLoan hl = new HomeLoan();

		double salary = hl.getCustomerSalary();
		int cibil = hl.getCibilScore();
		int age = hl.getCustomerAge();

		System.out.println("Enter Aadhar Details : ");
		String aadhar = sc.next();

		System.out.println("Enter PAN number ");
		String pan = sc.next();

		System.out.println("Enter Phone number: ");
		String phone = sc.next();

		if (salary >= 600000.00 && (cibil >= 300 && cibil <= 900) && age >= 24 && hl.validateAadhar(aadhar)
				&& hl.validatePAN(pan) && hl.validatePhone(phone)) {
			System.out.println("Congratulations !!!! ");
			System.out.println("You are Eligible for Home Loan !");
			System.out.println("Your Loan ROI is  :" + hl.getROI());
			System.out.println("Enter Address Details ");

			hl.getHomeLoanDocmentInfo();

		} else {
			System.out.println("You are not Eligible for Home Loan Try after sometime !");
		}

	}

	void getHomeLoanDocmentInfo() {
		System.out.println("All Home Loan documents have been Verified  ");
	}


}
