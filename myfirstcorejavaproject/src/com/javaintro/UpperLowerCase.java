package com.javaintro;
import java.util.Scanner;
public class UpperLowerCase {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter a character");
				char ch = sc.next().charAt(0);
				
				if (ch>='A' && ch<='Z'){
					System.out.println(ch+ " is UpperCase");
					
				}
				else if(ch>='a' && ch<='z') {
					System.out.println(ch+ " is LowerCase");
				}
				else {
					System.out.println(ch+ " is not an alphabet");
				}
				sc.close();
			}

		}

