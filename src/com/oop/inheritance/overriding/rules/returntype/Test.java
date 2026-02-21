package com.oop.inheritance.overriding.rules.returntype;

public class Test {

    public static void main(String[] args) {

        BankAccount account = new SavingsAccount();   

        BankAccount createdAccount = account.createBankAccount();

        System.out.println("Account Name: " + createdAccount.getName());
        System.out.println("Account Number: " + createdAccount.getNumber());
    }
}