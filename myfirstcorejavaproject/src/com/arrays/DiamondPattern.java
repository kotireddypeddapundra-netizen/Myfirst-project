package com.arrays;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * (n - i) + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		System.out.println("      * ");
//		System.out.println("    * * * ");
//		System.out.println("  * * * * * ");
//		System.out.println("* * * * * * * ");
//		System.out.println("  * * * * * ");
//		System.out.println("    * * * ");
//		System.out.println("      * ");
//		
//		System.out.println("        * \r\n"
//				+ "      * * * \r\n"
//				+ "    * * * * * \r\n"
//				+ "  * * * * * * * \r\n"
//				+ "* * * * * * * * * \r\n"
//				+ "  * * * * * * * \r\n"
//				+ "    * * * * * \r\n"
//				+ "      * * * \r\n"
//				+ "        * ");
//		
//		
//		 Scanner sc = new Scanner(System.in);
//
//	        System.out.println("Enter number of rows:");
//	        int n = sc.nextInt();
//
//	        // Upper half
//	        for(int i = 1; i <= n; i++) {
//
//	            // Spaces
//	            for(int j = 1; j <= n - i; j++) {
//	                System.out.print("  ");
//	            }
//
//	            // Stars
//	            for(int j = 1; j <= 2 * i - 1; j++) {
//	                System.out.print("* ");
//	            }
//
//	            System.out.println();
//	        }
//
//	        // Lower half
//	        for(int i = n - 1; i >= 1; i--) {
//
//	            // Spaces
//	            for(int j = 1; j <= n - i; j++) {
//	                System.out.print("  ");
//	            }
//
//	            // Stars
//	            for(int j = 1; j <= 2 * i - 1; j++) {
//	                System.out.print("* ");
//	            }
//
//	            System.out.println();
//	        }
	}

}
