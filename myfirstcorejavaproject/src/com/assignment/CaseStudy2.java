package com.assignment;

public class CaseStudy2 {

	public static void main(String[] args) {

		String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };
		int[] quantity = { 2, 1, 5, 3, 2 };
		double[] price = { 60.5, 150.0, 25.0, 40.0, 85.0 };

		calculateTotal(products, quantity, price);
		calculateAverageItemPrice(products, price);
		purchaseAmount(products, quantity, price);

	}

	static void calculateTotal(String[] products, int[] quantity, double[] price) {

		System.out.println("Total Bill Amount For All The Products : ");
		double total = 0;
		for (int i = 0; i < products.length; i++) {
			total = total + quantity[i] * price[i];
		}
		System.out.println(total);
	}

	static void calculateAverageItemPrice(String[] products, double[] price) {

		System.out.println("Average Item Price : ");
		double totalPrice = 0;
		for (int i = 0; i < products.length; i++) {
			totalPrice = totalPrice + price[i];
		}
		double average = totalPrice / products.length;
		System.out.println(average);
	}

	static void purchaseAmount(String[] products, int[] quantity, double[] price) {

		double highestAmount = 0;
		double lowestAmount = Double.MAX_VALUE;
		String highestProduct = "";
		String lowestProduct = "";

		for (int i = 0; i < products.length; i++) {
			double amount = price[i] * quantity[i];

			if (amount > highestAmount) {
				highestAmount = amount;
				highestProduct = products[i];
			}
			if (amount < lowestAmount) {
				lowestAmount = amount;
				lowestProduct = products[i];
			}

		}
		System.out.println("Highest Total Purchase Amount = " + highestAmount + " Belongs To " + highestProduct);
		System.out.println("Lowest Total Purchase Amount = " + lowestAmount + " Belongs To " + lowestProduct);

	}

}
