package com.javaintro;
import java.util.HashSet;
public class CommonElements {

	public static void main(String[] args) {
		
		int[][] arr1 = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		int[][] arr2 = {
				{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{8,3}
		};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("   ");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("   ");
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> commonElements = new HashSet<Integer>();
			
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				set1.add(arr1[i][j]);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				if(set1.contains(arr2[i][j])) {
					commonElements.add(arr2[i][j]);
				}
			}
			
	}
		System.out.println("common elements : "+ commonElements);

}
}
