package com.oops;

public class BankAccount {

	private long accNo;
	private String accHolderName;
	private double balance;
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getAccNo() {
		return accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
