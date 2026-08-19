package com.langfundamentals;
import java.util.Scanner;
public class DiscountedPrice {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		DiscountedPrice d = new DiscountedPrice();
		System.out.println("Enter Price of an Article : ");
		double price = sc.nextDouble();
		
		System.out.println("Enter Discount Percentage : ");
		double discountPercentage = sc.nextDouble();
		
		double sp = d.discount(price, discountPercentage);
		System.out.print("The Price to be Paid is : "+sp);
		
	}
	double discount(double price,double discountPercentage) {
		double discount = (price*discountPercentage)/100;
		double sellingPrice = price-discount;
		return sellingPrice;
	}
}
