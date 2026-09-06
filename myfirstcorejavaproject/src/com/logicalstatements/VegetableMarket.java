package com.logicalstatements;

import java.util.Scanner;

public class VegetableMarket {
	static Scanner sc = new Scanner(System.in);

	double totalVegetablesCost;
	double totalFruitsCost;
	double totalItemsCost;

	void main(String[] args) {

		System.out.println("*****Welcome To Market*****");

//		double totalItemsCost = 0;
		String categoryYesNo = "";
		do {
			System.out.println("Enter Category (Fruits/Vegetables) You Want To Buy...");
			String category = sc.next().toLowerCase();

//			double totalCost = 0;

			switch (category) {
			case "vegetables" -> {

//				double totalVegetablesCost = 0;

				String vegetablesYesNo;
				do {
					System.out.println("Enter Vegetables You Wanna Buy");
					String choice = sc.next().toLowerCase();

					switch (choice) {

					case "tomato" -> {
						System.out.println("The Price Of Tomato Per Kg Is 35 Rupees");
						double tomatoCost = 35;
						String name = "Tomato";
						vegetables(name, tomatoCost);
					}
					case "potato" -> {
						System.out.println("The Price Of Potato Per Kg Is 40 Rupees");
						double potatoCost = 40;
						String name = "Potato";
						vegetables(name, potatoCost);

					}
					case "onion" -> {
						System.out.println("The Price Of Onion Per Kg Is 50 Rupees");
						double onionCost = 50;
						String name = "Onion";
						vegetables(name, onionCost);
					}
					case "carrot" -> {
						System.out.println("The Price Of Carrot Per Kg Is 45 Rupees");
						double carrotCost = 45;
						String name = "Carrot";
						vegetables(name, carrotCost);
					}
					case "bitterguard" -> {
						System.out.println("The Price Of Bitter Guard Per Kg Is 55 Rupees");
						double bitterguardCost = 55;
						String name = "Bitter Guard";
						vegetables(name, bitterguardCost);
					}
					case "cabbage" -> {
						System.out.println("The Price Of Cabbage Per Kg Is 40 Rupees");
						double cabbageCost = 40;
						String name = "Cabbage";
						vegetables(name, cabbageCost);
					}
					default -> System.out.println("The Entered Item Is Unavailable");
					}
					System.out.println("If You Want To Continue With Vegetables Type Yes Else Type No");
					vegetablesYesNo = sc.next();

				} while (vegetablesYesNo.equalsIgnoreCase("yes"));
				System.out.println("The Total Cost Of Your Purchased Vegetables Is : " + totalVegetablesCost);
				totalItemsCost = totalItemsCost + totalVegetablesCost;
				System.out.println("***Exit From Vegetables Category***");

			}
			case "fruits" -> {

//				double totalFruitsCost = 0;
				String fruitsYesNo;

				do {
					System.out.println("Enter Fruits You Wanna Buy");
					String choice = sc.next().toLowerCase();

					switch (choice) {

					case "banana" -> {
						System.out.println("The Cost Of Dozen Banana Is 60 Rupees");
						double bananaCost = 60;
						String name = "Banana";
						fruits(name, bananaCost);
					}
					case "apple" -> {
						System.out.println("The Cost Of Apple Per Kg Is 160 Rupees");
						double appleCost = 160;
						String name = "Apple";
						fruits(name, appleCost);
					}
					case "grapes" -> {
						System.out.println("The Cost Of Grapes Per Kg Is 90 Rupees");
						double grapesCost = 90;
						String name = "Grapes";
						fruits(name, grapesCost);
					}
					case "orange" -> {
						System.out.println("The Cost Of Orange Per Kg Is 80 Rupees");
						double orangeCost = 80;
						String name = "Orange";
						fruits(name, orangeCost);
					}
					case "pomegranate" -> {
						System.out.println("The Cost Of Pomegranate Per Kg Is 140 Rupees");
						double pomegranateCost = 140;
						String name = "Pomegranate";
						fruits(name, pomegranateCost);
					}
					case "guava" -> {
						System.out.println("The Cost Of Guava Per Kg Is 70 Rupees");
						double guavaCost = 70;
						String name = "Guava";
						fruits(name, guavaCost);
					}
					default -> {
						System.out.println("The Entered Fruits Are Not Available");
					}

					}
					System.out.println("If You Want To Continue With Fruits Click Yes Else Click No");
					fruitsYesNo = sc.next();

				} while (fruitsYesNo.equalsIgnoreCase("yes"));
				System.out.println("The Total Cost Of Your Purchased Fruits Is : " + totalFruitsCost);
				totalItemsCost = totalItemsCost + totalFruitsCost;
				System.out.println("***Exit From Fruits Category***");

			}
			default -> {
				System.out.println("Inavalid Category");
			}

			}

			System.out.println("If You Want To Continue With Category Click Yes Else Click No");
			categoryYesNo = sc.next();

		} while (categoryYesNo.equalsIgnoreCase("yes"));
		System.out.println("The Total Cost Of Your Purchased Items Is : " + totalItemsCost);
		System.out.println("***Exit From All Categories***");

	}

	void vegetables(String name, double cost) {
		System.out.println("Enter Quantity You Wanna Buy : ");
		double quantity = sc.nextDouble();

		if (quantity > 0 && quantity <= 4) {
			cost = cost * quantity;
			totalVegetablesCost = totalVegetablesCost + cost;
			System.out.println("The Cost Of " + quantity + " Kg " + name + " is " + cost + " Rupees");

		} else {
			System.out.println("Invalid Quantity *Quantity Must Be Greater Than Zero And Less Tha Or Equal To 4");
		}
	}

	void fruits(String name, double cost) {
		System.out.println("Enter Quantity You Wanna Buy : ");
		double quantity = sc.nextDouble();

		if (quantity > 0 && quantity <= 4) {
			cost = cost * quantity;
			totalFruitsCost = totalFruitsCost + cost;
			System.out.println("The Cost of " + quantity + " Kg " + name + " Is " + cost + " Rupees");
		} else {
			System.out.println("Invalid Quantity *Quantity Must Be Greater Than Zero And Less Tha Or Equal To 4");
		}
	}

}
