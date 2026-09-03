package com.logicalstatements;

import java.util.Scanner;

public class SwitchDayFinder {

	public static void main(String[] args) {
		System.out.println("Know The Day Using Number");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers From 1 To 7");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 :
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wednesday");
			break;
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturady");
			break;
		default :
			System.out.println("Invalid Entry");
		}
		
		System.out.println("That's It For The Day...");
		sc.close();
	}

}
