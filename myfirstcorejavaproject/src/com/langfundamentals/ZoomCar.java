package com.langfundamentals;
import java.util.Scanner;
public class ZoomCar {

	String welcome(String message) {
		//		message = "Welcome to Car Rentals";
		return message;
	}
	String companyName(String companyName) {
		//		companyName = "ZOOM CAR RENTALS";
		return companyName;
	}
	int rent(int dailyRent) {
		//		dailyRent = 1500;
		return dailyRent;
	}
	int numberOfDays(int rent,int numberOfDays) {
		int rentedDaysCost = rent*numberOfDays;
		return rentedDaysCost;
	}
	int insuranceFee(int fee) {
		//		fee=500;
		return fee;
	}
	int totalCost(int fee,int rent) {
		int totalCost = fee + rent;
		return totalCost;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ZoomCar z1 = new ZoomCar();

		String message = z1.welcome("Welcome to Car Rentals");
		System.out.println(message);

		String name = z1.companyName("ZOOM CAR RENTALS");
		System.out.println("Company Name : "+name);

		int dailyRent = z1.rent(1500);
		System.out.println("Daily Rent : "+dailyRent);

		System.out.println("Enter Number of Days : ");
		int days = sc.nextInt();
		int numberOfDays = z1.numberOfDays(dailyRent, days);
		System.out.println("The cost for "+days+" days is : "+numberOfDays);

		int insurance = z1.insuranceFee(500);
		System.out.println("The Insurance Fee is "+insurance);

		int total = z1.totalCost(numberOfDays,insurance);
		System.out.println("The Total Cost is "+total);

	}

}
