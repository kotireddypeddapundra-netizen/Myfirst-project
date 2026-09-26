package com.recursion;

import java.util.Scanner;

public class printNumbers {

	static void print1toN(int num) {

		if (num == 0) {
			return;
		}
		print1toN(num - 1);
		System.out.print(num + " ");

	}

	static void printNto1(int num) {

		if (num == 0) {
			return;
		}

		System.out.print(num + " ");
		print1toN(num - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter To How Many Numbers You Wanna Print : ");
		int num = sc.nextInt();
		
		System.out.println("1 To "+num+" Are : ");
		print1toN(num);
		System.out.println("\n"+num+" To 1 Are : ");
		printNto1(num);
	}

}
