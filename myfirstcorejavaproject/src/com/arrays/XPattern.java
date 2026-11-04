//package com.arrays;
//import java.util.Scanner;
//public class XPattern {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number of Rows : ");
//		int n = sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j||j==n-i+1) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		sc.close();
//	}
//
//}

package com.arrays;

import java.util.Scanner;

public class XPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name You Wanna Print : ");
		String name = sc.nextLine();
		
		int n = name.length();
		int nameIndex=0;
		char gap='a';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i==j || j==n-i+1) {
					System.out.print(name.charAt(nameIndex)+" ");
				}else {
					System.out.print(gap+" ");
					gap++;
					
					if(gap>'z') {
						gap='a';
					}
				}
				
			}
			nameIndex++;
			System.out.println();
		}
		sc.close();
		
	}

}



















