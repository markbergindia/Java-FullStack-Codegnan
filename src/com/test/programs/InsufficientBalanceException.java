package com.test.programs;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("Your account does not have sufficient funds for this withdrawal transaction.");
    }
}