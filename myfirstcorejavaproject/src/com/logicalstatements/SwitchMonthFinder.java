package com.logicalstatements;

import java.util.Scanner;

public class SwitchMonthFinder {

	public static void main(String[] args) {
		System.out.println("Know The Month");

		Scanner sc = new Scanner(System.in);

		String yesno;

		do {
			System.out.println("Enter A Number From 1 To 12");
			int num = sc.nextInt();

			switch (num) {

			case 1 -> System.out.println("January");
			case 2 -> System.out.println("February");
			case 3 -> System.out.println("March");
			case 4 -> System.out.println("April");
			case 5 -> System.out.println("May");
			case 6 -> System.out.println("June");
			case 7 -> System.out.println("July");
			case 8 -> System.out.println("August");
			case 9 -> System.out.println("September");
			case 10 -> System.out.println("October");
			case 11 -> System.out.println("November");
			case 12 -> System.out.println("December");
			default -> System.out.println("Invalid Entry");

			}
			System.out.println("Do You Want To Continue...Click Yes Or No");
			yesno = sc.next();
		}while(yesno.equalsIgnoreCase("yes"));
		
		System.out.println("That's It.....");

		sc.close();

	}

}
