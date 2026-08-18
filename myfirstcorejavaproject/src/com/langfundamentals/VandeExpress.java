package com.langfundamentals;

public class VandeExpress {

	String passengerName;
	int age;
	String source;
	String destination;
	int numberOfTickets;
	int ticketAmount;

	static int totalTicketsBought;
	static int totalAmount;
	static int price = 500;

	{
		System.out.println("Welcome to VANDE EXPRESS Thank You For Choosing Us");
	}

//	void bookTicket() {
//
//		totalAmount = totalTicketsBought * price;
//		System.out.println("Ticket Booked Successfully");
//
//	}

	void displayBookingDetails() {

		totalTicketsBought += numberOfTickets;
		totalAmount += numberOfTickets * price;

		System.out.println("Name of the Passenger :" + passengerName);
		System.out.println("Age of the Passenger :" + age);
		System.out.println("Journey Starting Station :" + source);
		System.out.println("Journey Ending Station :" + destination);
		System.out.println("Price of Each Ticket :" + price);
		System.out.println("Number of Tickets Bought :" + numberOfTickets);
		System.out.println("Booked Ticket Amount :" + (ticketAmount = numberOfTickets * price));
		System.out.println("Tickets Booked Successfully");

	}

	static void ticketCounter() {
		System.out.println("Total Tickets Booked By All Passengers :" + totalTicketsBought);
		System.out.println("Total Amount Collected :" + totalAmount);
	}

	public static void main(String[] args) {

		VandeExpress v = new VandeExpress();

		v.passengerName = "RAMESH";
		v.age = 23;
		v.source = "SECUNDERABAD JUNCTION";
		v.destination = "BHIMAVARAM";
		v.numberOfTickets = 5;
		v.displayBookingDetails();
		System.out.println("**************************************************************");
		VandeExpress v1 = new VandeExpress();

		v1.passengerName = "KOTI REDDY";
		v1.age = 22;
		v1.source = "SECUNDERABAD JUNCTION";
		v1.destination = "DELHI";
		v1.numberOfTickets = 8;
		v1.displayBookingDetails();

		System.out.println("**************************************************************");
		VandeExpress.ticketCounter();
	}

}
