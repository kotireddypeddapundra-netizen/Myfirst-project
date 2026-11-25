package com.oops;

import java.util.Scanner;

class CreditCardPayment implements Payment {

	public String cardNo;
	public int pin;
	
	public CreditCardPayment(String cardNo, int pin) {
		this.cardNo = cardNo;
		this.pin = pin;
	}
	Scanner sc = new Scanner(System.in);

	@Override
	public void makePayment() {
		System.out.println("Enter Card Number : ");
		String card = sc.next();
		System.out.println("Enter Pin : ");
		int pinNumber = sc.nextInt();
		
		if(pin==pinNumber && cardNo==card) {
			Payment.displayMessage();
		}else {
			System.out.println("Invalid");
		}
	}
}