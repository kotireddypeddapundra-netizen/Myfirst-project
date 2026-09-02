package com.langfundamentals;

public class BankAccount {
	
	int accountNumber;
	String customerName;
	double balance;
	
	double deposit(double amount) {
		balance=balance+amount;
		return balance;
	}
	double withdraw(double amount) {
		balance=balance-amount;
		return balance;
	}
	void transfer(double amount,BankAccount anotherAccount) {
		if(balance>=amount) {
			balance=balance-amount;
			anotherAccount.balance=anotherAccount.balance+amount;
			System.out.println(amount +" Transferred Successfully");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	double calculateInterest(double interestRate) {
		return (balance*interestRate)/100;
	}
	void display(){
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Balance : "+balance);
	}

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		
		b1.accountNumber=101;
		b1.customerName="ROHIT SHARMA";
		b1.balance=10000;
		
		b2.accountNumber=102;
		b2.customerName="VIRAT KOHLI";
		b2.balance=25000;
		
		System.out.println("Balance : "+b1.balance);
		double dBalance=b1.deposit(2000);
		System.out.println("The Current Balance After Depositing is : "+dBalance);
		double wBalance=b1.withdraw(5000);
		System.out.println("The Current Balance After Withdrawl is : "+wBalance);
		b1.transfer(3000, b2);
		System.out.println("Customer 1 :");
		b1.display();
		System.out.println("The Calculated Interest is : "+b1.calculateInterest(10));
		
		System.out.println("********************************************************");
		
		System.out.println("Customer 2 :");
		b2.display();
		System.out.println("The Calculated Interest is : "+b2.calculateInterest(10));

	}

}
