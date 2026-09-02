package com.assignment;

public class BankAccount {

	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	BankAccount(int accountNumber,String accountHolderName,double balance,String branch){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;
	}
	
	public BankAccount(BankAccount b,String branch,int balance) {
		
		this.accountNumber=b.accountNumber;
		this.accountHolderName=b.accountHolderName;
		this.balance=balance;
		this.branch=branch;
		System.out.println("************************************************");
		System.out.println("Copy Constructor Called");
	}
	void displayAccountDetails() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account_Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance);
		System.out.println("Branch : "+branch);

	}

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount(123456789, "ROHIT SHARMA", 450000, "MUMBAI");
		b1.displayAccountDetails();
		
		BankAccount b2 = new BankAccount(b1,"hyd",5000000);
		b2.displayAccountDetails();
		
		
	}

}
