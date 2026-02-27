package com.codegnan.ExceptionHandling;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws invalidAmountexceptionHandling {
        if (amount <= 0) {
            throw new invalidAmountexceptionHandling("Deposit amount must be positive");
        }
        balance += amount;
        System.out.printf("Deposited: Rs. %.2f%n", amount);
    }

    public void withdraw(double amount) 
            throws invalidAmountexceptionHandling, InsufficientBalanceException {
        
        if (amount <= 0) {
            throw new invalidAmountexceptionHandling("Withdraw amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.printf("Withdrawn: Rs. %.2f%n", amount);
    }

    // Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}