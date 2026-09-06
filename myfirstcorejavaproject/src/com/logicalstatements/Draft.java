package com.logicalstatements;

import java.util.Scanner;

public class Draft {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("*****Welcome To Market*****");

		double totalItemsCost = 0;
		String categoryYesNo = "";
		do {
			System.out.println("Enter Category (Fruits/Vegetables) You Want To Buy...");
			String category = sc.next().toLowerCase();

//			double totalCost = 0;

			switch (category) {
			case "vegetables" -> {

				double totalVegetablesCost = 0;

				String vegetablesYesNo;
				do {
					System.out.println("Enter Vegetables You Wanna Buy");
					String choice = sc.next().toLowerCase();

					switch (choice) {

//					case "tomato" -> {
//						System.out.println("The Price Of Tomato Per Kg Is 35 Rupees");
//						double tomatoCost = 35;
//						String name = "tomato";
//						method(name, tomatoCost);
//					}
					
					
					case "potato" -> {
						System.out.println("The Price Of Potato Per Kg Is 40 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double potatoCost = 40 * quantity;
						totalVegetablesCost = totalVegetablesCost + potatoCost;
						System.out.println("The Cost of " + quantity + " Kg Potatoes Is " + potatoCost + " Rupees");
					}
					case "onion" -> {
						System.out.println("The Price Of Onion Per Kg Is 50 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double onionCost = 50 * quantity;
						totalVegetablesCost = totalVegetablesCost + onionCost;
						System.out.println("The Cost of " + quantity + " Kg Onions Is " + onionCost + " Rupees");
					}
					case "carrot" -> {
						System.out.println("The Price Of Carrot Per Kg Is 45 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double carrotCost = 45 * quantity;
						totalVegetablesCost = totalVegetablesCost + carrotCost;
						System.out.println("The Cost of " + quantity + " Kg Carrots Is " + carrotCost + " Rupees");
					}
					case "bitterguard" -> {
						System.out.println("The Price Of Bitter Guard Per Kg Is 55 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double bitterguardCost = 55 * quantity;
						totalVegetablesCost = totalVegetablesCost + bitterguardCost;
						System.out.println(
								"The Cost of " + quantity + " Kg Bitter Guard Is " + bitterguardCost + " Rupees");
					}
					case "cabbage" -> {
						System.out.println("The Price Of Cabbage Per Kg Is 40 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double cabbageCost = 40 * quantity;
						totalVegetablesCost = totalVegetablesCost + cabbageCost;
						System.out.println("The Cost of " + quantity + " Kg Cabbage Is " + cabbageCost + " Rupees");
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

				double totalFruitsCost = 0;
				String fruitsYesNo;

				do {
					System.out.println("Enter Fruits You Wanna Buy");
					String choice = sc.next().toLowerCase();

					switch (choice) {

					case "banana" -> {
						System.out.println("The Cost Of Dozen Banana Is 60 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double bananaCost = 60 * quantity;
						totalFruitsCost = totalFruitsCost + bananaCost;
						System.out.println("The Cost of " + quantity + " Dozen Bananas Is " + bananaCost + " Rupees");
					}
					case "apple" -> {
						System.out.println("The Cost Of Apple Per Kg Is 160 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double appleCost = 160 * quantity;
						totalFruitsCost = totalFruitsCost + appleCost;
						System.out.println("The Cost of " + quantity + " Kg Apples Is " + appleCost + " Rupees");
					}
					case "grapes" -> {
						System.out.println("The Cost Of Grapes Per Kg Is 90 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double grapesCost = 90 * quantity;
						totalFruitsCost = totalFruitsCost + grapesCost;
						System.out.println("The Cost of " + quantity + " Kg Grapes Is " + grapesCost + " Rupees");
					}
					case "orange" -> {
						System.out.println("The Cost Of Orange Per Kg Is 80 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double orangeCost = 80 * quantity;
						totalFruitsCost = totalFruitsCost + orangeCost;
						System.out.println("The Cost of " + quantity + " Kg Oranges Is " + orangeCost + " Rupees");
					}
					case "pomegranate" -> {
						System.out.println("The Cost Of Pomegranate Per Kg Is 140 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double pomegranateCost = 140 * quantity;
						totalFruitsCost = totalFruitsCost + pomegranateCost;
						System.out.println(
								"The Cost of " + quantity + " Kg Pomegranate Is " + pomegranateCost + " Rupees");
					}
					case "guava" -> {
						System.out.println("The Cost Of Guava Per Kg Is 70 Rupees");
						System.out.println("Enter Quantity You Wanna Buy : ");
						double quantity = sc.nextDouble();
						double guavaCost = 70 * quantity;
						totalFruitsCost = totalFruitsCost + guavaCost;
						System.out.println("The Cost of " + quantity + " Kg Guava Is " + guavaCost + " Rupees");
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


	}

	