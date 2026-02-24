package com.oop.abstraction.paymentsystem;

public class UpiPayment extends Payment {

    private String upiId;
    private String upiPin;

    public UpiPayment(String paymentId, double amount,
                      String upiId, String upiPin) {

        super(paymentId, amount);

        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    boolean validatePayment() {

        if (upiId == null || 
            !upiId.contains("@") ||
            upiId.startsWith("@") ||
            upiId.endsWith("@")) {

            System.out.println("Invalid UPI ID format");
            return false;
        }

        if (upiPin == null || upiPin.length() != 6) {
            System.out.println("Invalid UPI PIN");
            return false;
        }

        System.out.println("UPI validation successful");
        return true;
    }

    @Override
    boolean processPayment() {

        if (getAmount() > 50000) {
            System.out.println("UPI transaction limit exceeded");
            return false;
        }

        System.out.println("Processing UPI Payment...");
        return true;
    }
}