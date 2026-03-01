package com.Bankingsystem;
import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateBankAccount account1 =
                new CreateBankAccount("Sriram", "ACC101", 10000, "Savings");

        CreateBankAccount account2 =
                new CreateBankAccount("Pranathi", "ACC102", 5000, "Current");

        int choice;

        do {
            System.out.println("===== Banking Menu =====");
            System.out.println("1. Display Account 1");
            System.out.println("2. Display Account 2");
            System.out.println("3. Deposit to Account 1");
            System.out.println("4. Withdraw from Account 1");
            System.out.println("5. Calculate Interest for Account 1");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account1.displayAccountInfo();
                    break;

                case 2:
                    account2.displayAccountInfo();
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account1.deposit(depositAmount);
                    break;

                case 4:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;

                case 5:
                    account1.calculateInterest();
                    break;

                case 6:
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}