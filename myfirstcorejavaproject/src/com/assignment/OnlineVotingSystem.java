package com.assignment;

import java.util.Scanner;

public class OnlineVotingSystem {

	static Scanner sc = new Scanner(System.in);
	
	int age;
	String gender;
	int voterID;
	
	void main(String[] args) {
		
		System.out.println("Enter Age");
		age=sc.nextInt();
		sc.nextLine();
		
		if(age>18) {
			System.out.println("Your Age Passed Eligibility Criteria");
			
			System.out.println("Enter Gender");
			gender=sc.next().toUpperCase();
			if(gender.equals("M") || gender.equals("F")) {
				System.out.println("Your Gender Is Suitable To Vote");
				
				System.out.println("Enter Voter ID Number");
				voterID=sc.nextInt();
				
				System.out.println("45 -> ROHIT SHARMA");
				System.out.println("18 -> VIRAT KOHLI");
				System.out.println("1 -> KL RAHUL");
				System.out.println("7 -> MS DHONI");
				
				System.out.println("Cast Your Vote Based On Number");
				int vote=sc.nextInt();
				
				switch (vote) {
				
				case 45 ->{
				System.out.println("Voted For Rohit Sharma");
				System.out.println("Thanks For Voting");
				}
				case 18 -> {
					System.out.println("Voted For Virat Kohli");
					System.out.println("Thanks For Voting");
				}
				case 1  -> {
					System.out.println("Voted For KL Rahul");
					System.out.println("Thanks For Voting");
				}
				case 7  -> {
					System.out.println("Voted For MS Dhoni");
					System.out.println("Thanks For Voting");
				}
				default -> {
					System.out.println("Voted For NOTA");
					System.out.println("Thanks For Voting");
				}
				
				}
				
				
			}else {
				System.out.println("Not Eligible To Vote");
			}
			
		}else {
			System.out.println("Not Eligible To Vote");
		}
		sc.close();
	}

}
