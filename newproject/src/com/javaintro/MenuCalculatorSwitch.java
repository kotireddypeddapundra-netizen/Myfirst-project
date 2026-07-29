package com.javaintro;
import java.util.Scanner;
public class MenuCalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		Double num1 = sc.nextDouble();
		System.out.println("Enter second number");
		Double num2 = sc.nextDouble();
		
		System.out.println("***** MENU *****");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		
		System.out.println("Enter operator (1,2,3,4,5)");
		int operator = sc.nextInt();
		
		switch(operator) {
		
		case 1:
			System.out.println("Output = "+(num1+num2));
			break;
		case 2:
			System.out.println("Output = "+(num1-num2));
			break;
		case 3:
			System.out.println("Output = "+(num1*num2));
			break;
		case 4:
			if(num2!=0) {
				System.out.println("Output = "+(num1/num2));
			}
			else {
				System.out.println("Number can't be divided by zero");
			}
			
			break;
		case 5:
			System.out.println("Output = "+(num1%num2));
			break;
			default:
				System.out.println("Invalid operator");
				break;
		}
		sc.close();
		
	}

}
