package com.langfundamentals;

public class ArithmeticOperators {

	void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of Numbers :" + sum);
		subtraction(sum,5);

	}

	void subtraction(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println("Subtraction of Numbers :" + difference);
		Multiplication(difference,4);
	}

	void Multiplication(int num1, int num2) {
		int product = num1 * num2;
		System.out.println("Product of Numbers :" + product);
		Division(product, 2);
	}

	void Division(int num1, int num2) {
		int quotient = num1 / num2;
		System.out.println("Division of Numbers :" + quotient);
	}

	//*********************************************************************************
	int add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of Numbers :" + sum);
		return sum;

	}

	int sub(int num1, int num2) {
		int difference = num1 - num2;
		System.out.println("Subtraction of Numbers :" + difference);
		return difference;
	}

	int mul(int num1, int num2) {
		int product = num1 * num2;
		System.out.println("Product of Numbers :" + product);
		return product;
	}

	int div(int num1, int num2) {
		int quotient = num1 / num2;
		System.out.println("Division of Numbers :" + quotient);
		return quotient;



	}

	public static void main(String[] args) {

		ArithmeticOperators a = new ArithmeticOperators();

		a.addition(10, 20);
		
		System.out.println("***************************************************");
		
		int result1 = a.add(50, 70);
		int result2 = a.sub(result1, 30);
		int result3 = a.mul(result2, 3);
		int result4 = a.div(result3, 5);



	}

}
