package com.oop.inheritance.overriding.rules.returntype;

public class SavingsAccount extends BankAccount{
	
//	covariant return types
	
	@Override
	SavingsAccount createBankAccount() {
		System.out.println("Creating a SavingsBank Account");
		return new SavingsAccount();
		
		
	}

}
