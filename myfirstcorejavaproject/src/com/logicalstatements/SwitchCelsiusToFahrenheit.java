package com.logicalstatements;

import java.util.Scanner;

public class SwitchCelsiusToFahrenheit {

	public static void main(String[] args) {
		System.out.println("*****Convert From One Temperature Scale To Another*****");
		Scanner sc = new Scanner(System.in);

		String yesno;

		do {
			System.out.println("Click 1 --> Convert From Fahrenheit To Celsius");
			System.out.println("Click 2 --> Convert From Celsius to Fahrenheit");
			System.out.println("Click 3 --> Convert From Celsius to Kelvin");
			System.out.println("Click 4 --> Convert From Kelvin to Celsius");

			System.out.println("Enter The Number (1 To 4) To Select Temperature Scale");
			int tempScale = sc.nextInt();

			double result = 0;

			switch (tempScale) {

			case 1 -> {
				System.out.println("Enter The Fahrenheit Temperature");
				double fahrenheit = sc.nextDouble();
				System.out.println("The Temperature In Celsius Is : ");
				result = (fahrenheit - 32) * 5 / 9;
			}
			case 2 -> {
				System.out.println("Enter The Celsius Temperature");
				double celsius = sc.nextDouble();
				System.out.println("The Temperature In Fahrenheit Is : ");
				result = (celsius * 9 / 5) + 32;
			}
			case 3 -> {
				System.out.println("Enter The Celsius Temperature");
				double celsius = sc.nextDouble();
				System.out.println("The Temperature In Kelvin Is : ");
				result = celsius + 273.15;
			}
			case 4 -> {
				System.out.println("Enter The Kelvin Temperature");
				double kelvin = sc.nextDouble();
				System.out.println("The Temperature In Celsius Is : ");
				result = kelvin - 273.15;
			}
			default -> System.out.println("Invalid Temperature Scale");

			}
			System.out.println(result);
			System.out.println("Type Yes To Continue Else Type No");
			yesno = sc.next();

		} while (yesno.equalsIgnoreCase("yes"));
		System.out.println("Temperature Conversion Completed");

		sc.close();

	}

}
