package com.langfundamentals;

public class Courier {

	int customerID;
	String customerName;
	String source;
	String destination;
	double weight;
	double deliveryAmount;
	
	static int totalCouriers;
	static double totalWeight;
	static double totalAmountCollected;
	static int pricePerKG = 100;
	
	static {
		System.out.println("Welcome to QUICKSHIP Courier");
	}
	void bookCourier() {
		totalCouriers++;
		totalWeight+=weight;
		totalAmountCollected=totalWeight*pricePerKG;
		System.out.println("Your Courier Booked Successfully");
	}
	void displayCourierDetails() {
		
		System.out.println("Customer ID :"+customerID);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Deviver From :"+source);
		System.out.println("Deliver To :"+destination);
		System.out.println("Weight of the Courier in KGs :"+weight);
		System.out.println("Delivery Amount to be Paid :"+weight*pricePerKG);
		
	}
	static void displayTodaysCollection(){
		System.out.println("Total Couriers Booked Today Are :"+totalCouriers);
		System.out.println("Total Weight Shipped Today :"+totalWeight);
		System.out.println("Total Amount Collected Today is :"+totalAmountCollected);
	}
	
	public static void main(String[] args) {
		
		Courier c = new Courier();
		c.customerID=101;
		c.customerName="RAMESH";
		c.source="KPHB";
		c.destination="JNTUH";
		c.weight=65;
		c.displayCourierDetails();
		c.bookCourier();
		
		
		System.out.println("**************************************************************");
		Courier c1 = new Courier();
		c1.customerID=102;
		c1.customerName="KOTI REDDY";
		c1.source="GHANPUR";
		c1.destination="HYDERABAD";
		c1.weight=50;
		c1.displayCourierDetails();
		c1.bookCourier();
		
		System.out.println("**********************************************************");
		Courier t = new Courier();
		t.displayTodaysCollection();
	}

}
