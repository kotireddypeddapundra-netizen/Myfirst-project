package com.javaintro;
//ctrl + shift + o
import java.util.Scanner;

		

public class HelloWorld {
	
	static void show(Integer a) {
		System.out.println("Hello From A");
}
	static void show(String s) {
		System.out.println("Hello From B");
}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter A Number : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("Enter Second NUmber : ");
//		int num2 = sc.nextInt();
//		
//		int reuslt=num1+num2;
//		//ctrl + space
//		System.out.println("The Sum Of Two Numbers Is : "+reuslt);
		
//		System.out.println("Hello World.....");
//		System.err.println("Hi Ajay ");
		
		short s = 10;
		
		char ch = 'a';
		System.out.println(ch++);//97  //a
		System.out.println(ch);
		System.out.println(ch+2);//99  //b
		System.out.println(ch);//c  //99
		System.out.println(++ch);//100  //d
		


		
	}

}
