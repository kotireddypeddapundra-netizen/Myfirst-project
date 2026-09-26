package com.javaintro;
//ctrl + shift + o
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second NUmber : ");
		int num2 = sc.nextInt();
		
		int reuslt=num1+num2;
		//ctrl + space
		System.out.println("The Sum Of Two Numbers Is : "+reuslt);
		
		System.out.println("Hello World.....");
		System.out.println("Hi Kirri ");
		
	}

}
