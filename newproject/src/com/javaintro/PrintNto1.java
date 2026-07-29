package com.javaintro;
import java.util.Scanner;
public class PrintNto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		int i=num;
		while(1<=i) {
			System.out.println(i+"");
			i--;
		}
		sc.close();
	}

}