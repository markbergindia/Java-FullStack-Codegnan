package com.oop.inheritance.overriding.rules.returntype;

public class BankAccount {
	int getNumber() {
		return 50;
	}
	String getName() {
		return "IOB3517";
	}
	
//	BankAccount createAccount(){
//		System.out.println("Creating a generic account");
//		BankAccount account = new BankAccount();
//		return account;        
	
	BankAccount createBankAccount() {
		System.out.println("Creating a Bank Account");
		return new BankAccount();
		
		
	}

}
