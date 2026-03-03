//	Write a Java program with the following specifications:
//		• InsufficientBalanceException class – Generates the message:
//  		“Your account does not have sufficient funds for this withdrawal transaction.”
//		• MinimumBalanceException class – Generates the message:
//			“Minimum balance of INR 1000 will not be maintained after this withdrawal transaction.”
//		• Bank class – withdraw() method:
//     		- If withdrawal amount > current balance → generate InsufficientBalanceException.
//    		- If balance after deduction < 1000 → generate MinimumBalanceException.
//     		- If no exception occurs, perform withdrawal and return the current balance.
//		• MainProgram class:
//     		- Accept withdrawal amount as input.
//			- Perform the withdrawal transaction.

     
package com.test.programs;

public class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount)
            throws InsufficientBalanceException, MinimumBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException();
        }

        if ((balance - amount) < 1000) {
            throw new MinimumBalanceException();
        }

        balance = balance - amount;
        return balance;
    }
}

