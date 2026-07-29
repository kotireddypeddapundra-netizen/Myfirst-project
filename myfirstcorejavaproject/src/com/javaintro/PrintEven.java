package com.javaintro;
import java.util.Scanner;
public class PrintEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	
	}

}
