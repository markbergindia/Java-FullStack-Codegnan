package com.oop.abstraction.paymentsystem;

public abstract class Payment {

    private String paymentId;
    private double amount;
    private String status;


    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "PENDING";
    }
    
	abstract boolean validatePayment();
    abstract boolean processPayment();

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount must be positive");
        }
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public void displayPaymentInfo() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
    }

    public void initiatePayment() {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
            status = "FAILED";
        } else {
            if (validatePayment()) {
                if (processPayment()) {
                    status = "SUCCESS";
                    System.out.println("Payment is successful");
                } else {
                    status = "FAILED";
                    System.out.println("Payment processing failed");
                }
            } else {
                status = "FAILED";
                System.out.println("Payment validation failed");
            }
        }
    }
}