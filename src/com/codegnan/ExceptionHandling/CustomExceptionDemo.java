package com.codegnan.ExceptionHandling;

public class CustomExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC001", 5000);

        // Deposit
        try {
            account.deposit(10);
            System.out.println("Balance Rs. " + account.getBalance());
        } catch (invalidAmountexceptionHandling e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Withdraw
        try {
            account.withdraw(5009); 
            System.out.println("Balance Rs. " + account.getBalance());
        } catch (invalidAmountexceptionHandling e) {
            System.out.println("Invalid Amount: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient Balance: " + e.getMessage());
        }
    }
}