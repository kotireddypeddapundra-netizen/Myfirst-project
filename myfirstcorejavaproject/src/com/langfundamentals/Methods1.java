package com.langfundamentals;
import java.util.Scanner;
public class Methods1 {

	public static void productDetails(int productID,String productName,double price) {
		System.out.println("Product ID :"+productID);
		System.out.println("Product Name :"+productName);
		System.out.println("Price :"+price);
	}
	void bookDetails(int bookID,String bookName,String author,double price) {
		System.out.println("Book ID :"+bookID);
		System.out.println("Book Name :"+bookName);
		System.out.println("Author : "+author);
		System.out.println("Price :"+price);
		
	}
	void simpleInterest(double principal,double rate,double time) {
		double simpleInterest = (principal*rate*time)/100;
		double amount = simpleInterest+principal;
		System.out.println("The Interest is : "+simpleInterest);
		System.out.println("The Total Amount to be Paid is : "+amount);
	}


	public static void main(String[] args) {
		productDetails(10, "LAPTOP", 45000);
		System.out.println("**************************************************");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product ID : ");
		int pID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name : ");
		String pName = sc.nextLine();
		
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		productDetails(pID, pName, price);
		System.out.println("*********************************************************");
		
		Methods1 m1 = new Methods1();
		System.out.println("Enter Book ID : ");
		int bID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Book Name : ");
		String bName = sc.nextLine();
		System.out.println("Enter Author : ");
		String author = sc.nextLine();
		
//		sc.nextLine();
		System.out.println("Enter Price : ");
		double bprice = sc.nextDouble();
		m1.bookDetails(bID, bName, author, bprice);
		System.out.println("**********************************************************");
		
		System.out.println("Enter Principal Amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter Time Period : ");
		double t = sc.nextDouble();
		System.out.println("Enter Rate of Interest : ");
		double r = sc.nextDouble();
		m1.simpleInterest(p, r, t);
		
		sc.close();
		
	}

}
