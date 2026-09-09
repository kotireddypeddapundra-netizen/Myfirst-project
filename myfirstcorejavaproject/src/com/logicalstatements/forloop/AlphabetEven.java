package com.logicalstatements.forloop;

public class AlphabetEven {

	public static void main(String[] args) {		
		
//		for(char c='A';c<('A'+26);c++) {
//			if(c%2==0) {
//				System.out.println(c);
//			}
//		}
		
		for(int i=65;i<(65+26);i++) {
			if(i%2==0) {
				char ch = (char)i;
				System.out.println(ch);
			}
		}
		
	}

}
