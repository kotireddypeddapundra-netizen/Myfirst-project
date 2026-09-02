package com.assignment;

public class ObjectCount {
	
	static int count;

	ObjectCount(){
		count++;
	}
	ObjectCount(int ID){
		count++;
	}
	ObjectCount(String name){
		count++;
	}
	ObjectCount(int ID,String name){
		count++;
	}
	static int objectCount(int count) {
		return count;
	}
	
	public static void main(String[] args) {
		
		String name="RAMESH";
		int ID=1;
		

		ObjectCount c1 = new ObjectCount();
		ObjectCount c2 = new ObjectCount();
		ObjectCount c3 = new ObjectCount();
		ObjectCount c4 = new ObjectCount();
		ObjectCount c5 = new ObjectCount();
		ObjectCount c6 = new ObjectCount(ID);
		ObjectCount c7 = new ObjectCount(name);
		ObjectCount c8 = new ObjectCount(ID,name);
		
		int totalCount = objectCount(count);
		System.out.println("The Total Objects Count is : "+count);		
	}

}
