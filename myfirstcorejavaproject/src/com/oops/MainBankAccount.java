package com.oops;

public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();
		b1.setAccNo(264L);
		b1.setAccHolderName("ROHIT");
		b1.setBalance(2500000.50);
		
		System.out.println(b1.getAccNo());
		System.out.println(b1.getAccHolderName());
		System.out.println(b1.getBalance());
		
	}

}


