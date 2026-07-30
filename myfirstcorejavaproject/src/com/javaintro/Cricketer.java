package com.javaintro;

public class Cricketer {
	int jerseyNo;
	String cricketerName;
	static int countryId;
	static String countryName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team Info");
		countryId=91;
		countryName="India";
		
		System.out.println("*********object1 info***********");
		Cricketer c1 = new Cricketer();
		c1.jerseyNo = 45;
		c1.cricketerName = "Rohit Sharma";
		System.out.println("countryId :" + countryId);
		System.out.println("countryName :" + countryName);
		System.out.println("jerseyNo :" + c1.jerseyNo);
		System.out.println("cricketerName :" + c1.cricketerName);
		System.out.println("**********************************");
		
		System.out.println("*********object2 info***********");
		Cricketer c2 = new Cricketer();
		c2.jerseyNo = 18;
		c2.cricketerName = "Virat Kohli";
		System.out.println("countryId :" + countryId);
		System.out.println("countryName :" + countryName);
		System.out.println("jerseyNo :" + c2.jerseyNo);
		System.out.println("cricketerName :" + c2.cricketerName);
		System.out.println("**********************************");

		System.out.println("*********object3 info***********");
		Cricketer c3 = new Cricketer();
		c3.jerseyNo = 01;
		c3.cricketerName = "KL Rahul";
		System.out.println("countryId :" + countryId);
		System.out.println("countryName :" + countryName);
		System.out.println("jerseyNo :" + c3.jerseyNo);
		System.out.println("cricketerName :" + c3.cricketerName);
		System.out.println("**********************************");

		System.out.println("*********object1 info***********");
		Cricketer c4 = new Cricketer();
		c4.jerseyNo = 07;
		c4.cricketerName = "MS Dhoni";
		System.out.println("countryId :" + countryId);
		System.out.println("countryName :" + countryName);
		System.out.println("jerseyNo :" + c4.jerseyNo);
		System.out.println("cricketerName :" + c4.cricketerName);
		System.out.println("**********************************");

		System.out.println("*********object5 info***********");
		Cricketer c5 = new Cricketer();
		c5.jerseyNo = 32;
		c5.cricketerName = "Ishan Kishan";
		System.out.println("countryId :" + countryId);
		System.out.println("countryName :" + countryName);
		System.out.println("jerseyNo :" + c5.jerseyNo);
		System.out.println("cricketerName :" + c5.cricketerName);
		System.out.println("**********************************");


		
	}

}
