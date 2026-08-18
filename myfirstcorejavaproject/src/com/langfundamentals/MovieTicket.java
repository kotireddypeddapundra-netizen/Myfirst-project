package com.langfundamentals;

public class MovieTicket {
	
	String movieName;
	int seatNumber;
	boolean booked;
	static String theatreName="ASIAN";
	
	void bookTicket() {
		booked=true;
		System.out.println("Booking Status : Ticket for " +movieName+" Booked Successfully");
	}
	void cancelTicket() {
		booked=false;
		System.out.println("Booking Status : Ticket for " +movieName+" Cancelled Successfully");
	}
	void displayMovieDetails() {
		System.out.println("Theatre Name :" +theatreName);
		System.out.println("Movie Name : " +movieName);
		System.out.println("Seat Number : " +seatNumber);
		bookTicket();
		cancelTicket();
	}
	static void changeTheatreName() {
		theatreName="ASIAN MULTIPLEX";
	}
	public static void main(String[] args) {
		
		//changeTheatreName();
		MovieTicket m = new MovieTicket();
		m.movieName="CLS";
		m.seatNumber=6730;
		m.displayMovieDetails();
		
		System.out.println();
		
		MovieTicket m1 = new MovieTicket();
		m1.movieName="Spider Man";
		m1.seatNumber=6731;
		changeTheatreName();
		m1.displayMovieDetails();
		
	}

}
