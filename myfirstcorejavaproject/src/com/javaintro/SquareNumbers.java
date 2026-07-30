package com.javaintro;
import java.util.Scanner;
public class SquareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int num = sc.nextInt();

		for(int i=1;i<=num;i++) {
//			int square = i*i;
			System.out.println("Square =" +(i*i));
		}
		sc.close();

	}

}
