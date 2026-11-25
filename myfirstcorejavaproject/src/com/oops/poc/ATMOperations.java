package com.oops.poc;

public class ATMOperations {

	BankAccount b1 = new BankAccount();

	void checkBalance() {
		System.out.println("Your Current Balance Is : " + b1.getBalance());
	}

	void deposit(double amount, BankAccount account) {
		if (amount > 0) {
			account.setBalance(amount + account.getBalance());
		} else {
			System.out.println("Enter Valid Amount");
		}
		checkBalance();
	}
	
	void withdraw(double amount, BankAccount account) {
		
	}
	

}
