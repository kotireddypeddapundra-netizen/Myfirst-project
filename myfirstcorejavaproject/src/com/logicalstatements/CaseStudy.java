package com.logicalstatements;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;

		do {
			
			System.out.println("Select Movie,Seat Type,Exit By Clicking 1,2,3 Respectively");
			select = sc.nextInt();
			switch (select) {

			case 1 -> {
				System.out.println("Select Movie From Below List By Clicking Respective Number");
				System.out.println("1.Avengers Endgame");
				System.out.println("2.Inception");
				System.out.println("3.Interstellar");
				int movieNumber = sc.nextInt();

				switch (movieNumber) {

				case 1 -> System.out.println("Selected Movie : Avengers Endgame");
				case 2 -> System.out.println("Selected Movie : Inception");
				case 3 -> System.out.println("Selected Movie : Interstellar");
				default -> System.out.println("Invalid Movie Entered");

				}
			}
			case 2 -> {
				System.out.println("Select Seat Type By Clicking Respective Number");
				System.out.println("1.Regular");
				System.out.println("2.Premium");
				System.out.println("3.Recliner");
				int seatType = sc.nextInt();

				switch (seatType) {

				case 1 -> System.out.println("Selected Seat Type : Regular");
				case 2 -> System.out.println("Selected Seat Type : Premium");
				case 3 -> System.out.println("Selected Seat Type : Recliner");
				default -> System.out.println("Invalid Seat Type Entered");

				}

			}
			case 3 -> System.out.println("Thank You For Booking!!!");

			default -> System.out.println("Invalid Option Entered.Please Enter Option Between 1,2,3");
			}

		} while (select != 3);
		sc.close();
	}
}
