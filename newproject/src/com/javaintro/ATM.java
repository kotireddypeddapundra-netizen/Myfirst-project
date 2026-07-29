package com.javaintro;

public class ATM {
	
	static String bankName="State Bank of India";
	long accNo=1234568765l;
	int balance;
	
	void deposit() {
		balance=balance+50000;
		System.out.println("After Depositted Current Balance is"+balance);
	}
	void withdrawl() {
		balance=balance-10000;
		System.out.println("After Withdrawl Current Balance is"+balance);
	}
	void checkBalance() {
		balance=balance;
		System.out.println("Your Current Balance is"+balance);
	}
	public static void main(String[] args) {
		
		ATM obj1=new ATM();
		ATM obj2=new ATM();
		
		obj1.accNo++;
		obj1.balance=150000;
		System.out.println("Bank Name :"+bankName);
		System.out.println("Account Number :"+obj1.accNo);
		System.out.println("Balance :"+obj1.balance);
		obj1.deposit();
		obj1.withdrawl();
		obj1.checkBalance();
		
		obj2.accNo++;
		obj2.balance=250000;
		System.out.println("Bank Name :"+bankName);
		System.out.println("Account Number :"+obj2.accNo);
		System.out.println("Balance :"+obj2.balance);
		obj2.deposit();
		obj2.withdrawl();
		obj2.checkBalance();;
		
		
	}

}
