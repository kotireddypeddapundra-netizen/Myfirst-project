package com.oops.poc;

public interface Loan {
	
	public abstract boolean validateAadhar(String aadhar);
	
	public abstract boolean validatePhone(String phone);
	
	public abstract boolean validatePAN(String pan);
	
	public abstract double getCustomerSalary();
	
	public abstract int getCustomerAge();
	
	public abstract int getCibilScore();
	
	public abstract double getROI();
	
}
