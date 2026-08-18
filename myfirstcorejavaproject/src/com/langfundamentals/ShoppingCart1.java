package com.langfundamentals;

public class ShoppingCart1 {

	static String storeName = "A2Z Store";
	String customerName;
	String productName;
	double price;
	int quantity;
	double totalprice;
	double discount;
	
	void addProduct(String productName,double price,int quantity) {
		productName=this.productName;
		price=this.price;
		quantity=this.quantity;
		System.out.println("Product Name : "+productName);
		System.out.println("Price : "+price);
		System.out.println("Quantity : "+quantity);
		calculateTotal(totalprice);
		System.out.println("Product Added Successfully");
		
	}
	void calculateTotal(double totalprice) {
		totalprice=this.totalprice;
		discount=(price*discount)/100;
		totalprice=(price-discount)*quantity;
		System.out.println("Total Price : "+totalprice);
	}
	void displayCart() {
		System.out.println("StoreName : "+storeName);
		System.out.println("Customer Name : "+customerName);
		addProduct(productName, price, quantity);
	}
	
	public static void main(String[] args) {

		ShoppingCart1 s1 = new ShoppingCart1();
		
		s1.customerName="Koti Reddy";
		s1.productName="Laptop";
		s1.price=50000;
		s1.quantity=1;
		s1.discount=10;
		s1.displayCart();
		System.out.println("*************************************************");
		
	ShoppingCart1 s2 = new ShoppingCart1();
		
		s2.customerName="Ramesh";
		s2.productName="Spectacles";
		s2.price=750;
		s2.quantity=2;
		s2.discount=15;
		s2.displayCart();
	}

}
