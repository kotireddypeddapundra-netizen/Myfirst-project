package com.javaintro;

public class StateBank {
	static long AccNo=62310100120L;
	String AccountHolderName;
	int BankBalance;
	static String IFSCcode="SBIHYD";
	static String BranchName="Pragathi Nagar";
	
	void method(){
		AccNo++;
		AccountHolderName="Ramesh Sunugula";
		BankBalance=150000;
		System.out.println("AccNo : " +AccNo);
		System.out.println("AccountHolderName : " +AccountHolderName);
		System.out.println("BankBalance : " +BankBalance);
		System.out.println("IFSCcode : " +IFSCcode);
		System.out.println("BranchName : " +BranchName);
	}

	public static void main(String[] args) {
		StateBank obj2=new StateBank();
		obj2.method();
		{
			StateBank obj1=new StateBank();
			AccNo++;
			obj1.AccountHolderName="Peddapundra Koti Reddy";
			obj1.BankBalance=250000;
			System.out.println("AccNo : " +obj1.AccNo);
			System.out.println("AccountHolderName : " +obj1.AccountHolderName);
			System.out.println("BankBalance : " +obj1.BankBalance);
			System.out.println("IFSCcode : " +IFSCcode);
			System.out.println("BranchName : " +BranchName);
		}
		


	}

}
