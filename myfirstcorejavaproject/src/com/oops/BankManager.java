package com.oops;

public class BankManager {

	public static void main(String[] args) {

		Payment u = new UPIPayment("KOTI@ybl",1234);
		u.makePayment();
		
		Payment c = new CreditCardPayment("KOTI@ybl",1234);
		c.makePayment();
		
	}

}
