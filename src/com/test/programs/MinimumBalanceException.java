package com.test.programs;

public class MinimumBalanceException extends Exception {

    public MinimumBalanceException() {
        super("Minimum balance of INR 1000 will not be maintained after this withdrawal transaction.");
    }
}