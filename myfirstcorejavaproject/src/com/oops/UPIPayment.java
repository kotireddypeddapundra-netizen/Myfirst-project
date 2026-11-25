package com.oops;

import java.util.Scanner;

class UPIPayment implements Payment {

	public String uPIId;
	public int pin;
	
	public UPIPayment(String uPIId, int pin) {
		super();
		this.uPIId = uPIId;
		this.pin = pin;
	}
	Scanner sc = new Scanner(System.in);

	@Override
	public void makePayment() {
		System.out.println("Enter UPI Id : ");
		String upi = sc.next();
		System.out.println("Enter Pin : ");
		int pinNumber = sc.nextInt();
		
		if(pin==pinNumber && uPIId==upi) {
			Payment.displayMessage();
		}else {
			System.out.println("Invalid");
		}
	}
}