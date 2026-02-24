package com.oop.abstraction.paymentsystem;

public class DebitCardPayment extends Payment {

    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private double accountBalance;

    public DebitCardPayment(String paymentId, double amount,
                             String cardNumber, String cardHolderName,
                             String cvv, double accountBalance) {

        super(paymentId, amount);

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.accountBalance = accountBalance;
    }

    @Override
    boolean validatePayment() {

        if (cardNumber.length() != 16) {
            System.out.println("Invalid DebitCard Number");
            return false;
        }

        if (cvv.length() != 3) {
            System.out.println("Invalid CVV");
            return false;
        }

        if (cardHolderName.isEmpty()) {
            System.out.println("Invalid Card Holder Name");
            return false;
        }

        System.out.println("Debit card validation successful");
        return true;
    }

    @Override
    boolean processPayment() {

        if (getAmount() > accountBalance) {
            System.out.println("Insufficient account Balance");
            return false;
        }
        
        accountBalance = accountBalance - getAmount();
        System.out.println("Processing Debit Card Payment...");
        System.out.println(accountBalance);
        return true;
    }
}