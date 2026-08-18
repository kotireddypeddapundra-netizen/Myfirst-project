package com.langfundamentals;

public class ShoppingCart {
	
	String item;
	double totalAmount;
	boolean orderPlaced;
	
	static String websiteName = "PIZZAHUT";
	
	void addItem() {
		System.out.println("Order is Added to Cart");
	}
	void placeOrder() {
		if(orderPlaced==true) {
			System.out.println("Order Placed Successfully");
		}
	}
	void displayCart() {
		System.out.println("Website Name : " +websiteName);
		System.out.println("Item : " +item);
		System.out.println("Total Amount : " +totalAmount);
	}
	static void displayWebsiteName() {
		websiteName="Dominos";
	}
	public static void main(String[] args) {
		
		ShoppingCart s = new ShoppingCart();
		s.item="Chicken Pizza";
		s.totalAmount=150;
		s.orderPlaced=true;
		
		s.displayCart();
		s.addItem();
		s.placeOrder();
		
		System.out.println("******************************");
		ShoppingCart s1 = new ShoppingCart();
		s1.item="veg Pizza";
		s1.totalAmount=120;
		s1.orderPlaced=true;
		
		s1.displayWebsiteName();
		s1.displayCart();
		s1.addItem();
		s1.placeOrder();
	}

}
