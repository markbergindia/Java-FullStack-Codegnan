package com.oop.abstraction.paymentsystem;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String paymentId, double amount,
                             String cardNumber, String cardHolderName,
                             String cvv, String expiryDate) {

        super(paymentId, amount);

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    boolean validatePayment() {

        if (cardNumber.length() != 16) {
            System.out.println("Invalid Card Number");
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

        System.out.println("Credit card validation successful");
        return true;
    }

    @Override
    boolean processPayment() {

        if (getAmount() > 40000) {
            System.out.println("Amount exceeds credit limit");
            return false;
        }

        System.out.println("Processing Credit Card Payment...");
        return true;
    }
}