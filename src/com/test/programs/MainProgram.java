package com.test.programs;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank account = new Bank(5000);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            double remainingBalance = account.withdraw(amount);
            System.out.println("Withdrawal successful.");
            System.out.println("Current Balance: INR " + remainingBalance);

        } catch (InsufficientBalanceException | MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}