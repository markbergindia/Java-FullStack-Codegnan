package com.codegnan.ExceptionHandling;

public class InsufficientBalanceException extends Exception{
	private double balance;
	private double withdrawAmount;
	public InsufficientBalanceException (double balance , double withdrawAmount) {
		super("Insufficient balance available: " + balance + "But you have Requested: " + withdrawAmount);
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
		
	}
}
