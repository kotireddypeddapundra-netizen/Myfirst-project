package com.assignment;

import java.util.Scanner;

public class Pizza {

	static Scanner sc = new Scanner(System.in);

	double getPizzaPrice(char size) {

		double price = 0;
		if (size == 's') {
			price = 70;
		}
		if (size == 'm') {
			price = 100;
		}
		if (size == 'l') {
			price = 150;
		}

		return price;
	}

	double calculatePizzaCost(double price, int quantity) {
		double cost = price * quantity;
		return cost;
	}

	double calculateDeliveryCharge(double distance) {

		double deliveryCharge = 0;
		if (distance >= 0 && distance <= 10) {
			deliveryCharge = 70;
		}
		if (distance >= 11 && distance <= 20) {
			deliveryCharge = 100;
		}
		if (distance > 20) {
			deliveryCharge = 150;
		}
		return deliveryCharge;

	}

	double finalBill(double cost, double deliveryCharge) {
		double finalbill = cost + deliveryCharge;
		return finalbill;
	}

	void main(String[] args) {

		System.out.println("Welcome To Dominoz");

		System.out.println("Please Select Pizza Size : ");
		char size = sc.next().charAt(0);

		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();

		System.out.println("Enter Distance : ");
		double distance = sc.nextDouble();

		double price = getPizzaPrice(size);
		System.out.println("The Price of " + size + " pizza is : " + price);

		double pizzaCost = calculatePizzaCost(price, quantity);
		System.out.println("The Cost of " + size + " Sized " + quantity + " Pizza's is " + pizzaCost);

		double deliveryCharge = calculateDeliveryCharge(distance);
		System.out.println("The Delivery Charge For Your Location is : " + deliveryCharge);

		double finalCost = finalBill(pizzaCost, deliveryCharge);
		System.out.println("The Final Amount To Be Paid Is : " + finalCost);

		sc.close();
	}
}
