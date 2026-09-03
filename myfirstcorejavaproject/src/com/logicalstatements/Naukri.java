package com.logicalstatements;

import java.util.Scanner;

public class Naukri {

	public static void main(String[] args) {
		System.out.println("Welcome TO Naukri Job Portal");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + " Nice To Meet You...");

		System.out.println("Enter Your Qualification : ");
		String qualification = sc.nextLine().toUpperCase();
		if (qualification.equals("DEGREE") || qualification.equals("B.TECH")) {
			System.out.println("Your Educational Qualification Matched");

			System.out.println("Enter Your Graduation Percentage : ");
			double graduationPercentage = sc.nextDouble();
			if (graduationPercentage >= 60 && graduationPercentage <= 100) {
				System.out.println("Great...Your Academic Percentage Is Good. Let's Continue The Application Process");

				System.out.println("Enter Your Experience (If Fresher Keep 0) : ");
				double experience = sc.nextDouble();
				if (experience >= 0) {
					System.out.println("Your Experience Match This Job");

					System.out.println("Enter Your Skills : ");

					System.out.println("Do You Know Java True Or False : ");
					boolean java = sc.nextBoolean();

					System.out.println("Do You Know MySQL True Or False : ");
					boolean mysql = sc.nextBoolean();

					System.out.println("Do You Know HTML True Or False : ");
					boolean html = sc.nextBoolean();

					System.out.println("Do You Know CSS True Or False : ");
					boolean css = sc.nextBoolean();

					if (java && mysql && html && css) {
						System.out.println("Your Skills Matches This Profile");

						System.out.println("Enter Your Age : ");
						int age = sc.nextInt();
						System.out.println("Are You Willing To Relocate True Or False : ");
						boolean relocate=sc.nextBoolean();
						
						if ((age >= 22 && age <= 27)&&relocate){
							System.out.println("You Are Eligible For This Job Application");
						} else {
							System.out.println("Sorry!! Your Age Or Location Permeability Doesn't Suit For This Application. Better Luck Next Time");
						}

					} else {
						System.out.println("You Need Some More Skills To Apply This Job");
					}

				} else {
					System.out.println("You Need More Experience To Apply For This Job");
				}
			} else {
				System.out.println("Sorry!! Your Academic Percentage Doesn't Suit This Job");
			}
		} else {
			System.out.println("Sorry!! Your Educationa Qualification Doesn't Suit For This Job");
		}
		sc.close();
	}

}
