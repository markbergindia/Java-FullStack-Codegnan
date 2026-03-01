package com.Bankingsystem;
public class CreateBankAccount {
	private static final double MINIMUM_BALANCE = 0.0;
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private String accountType;
	
	public CreateBankAccount(String accountHolderName, String accountNumber,double balance,String accountType) {
		
		setAccountHolderName(accountHolderName);
		this.accountNumber = accountNumber;
		setaccountType(accountType);
		
		if(balance < MINIMUM_BALANCE) {
			System.out.println("Intitial balance is less than ₹0. Setting to mimimum balance ₹100");
			
			this.balance = MINIMUM_BALANCE;
		}else {
			this.balance = balance;
		}
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountType() {
		return accountType;
		
	}
	
	private void setaccountType(String accountType) {
		if(accountType.equalsIgnoreCase("Savings")  ||
				accountType.equalsIgnoreCase("Current")) {
			this.accountType = accountType;
		} else {
			System.out.println("Invalid AccountType! Must be Savings or Currrent.");
		}
	}

	private void setAccountHolderName(String accountHolderName) {
		if(accountHolderName == null || accountHolderName.trim().isEmpty()) {
			System.out.println("Invalid Name! Name cannot be empty.");
		}else {
			this.accountHolderName = accountHolderName;
		}
	}
	// deposit
	public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount!");
            return;
        }
        balance += amount;
        System.out.println("Deposit Successful. Updated Balance: ₹" + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        if ((balance - amount) < MINIMUM_BALANCE) {
            System.out.println("Cannot withdraw. Minimum balance of ₹1000 must be maintained.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal Successful. Remaining Balance: ₹" + balance);
    }

  
    public void calculateInterest() {
        if (accountType.equalsIgnoreCase("Savings")) {
            double interest = balance * 0.05;
            balance += interest;
            System.out.println("Interest Added: ₹" + interest);
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Current Account does not earn interest.");
        }
    }

    
    public void displayAccountInfo() {
        System.out.println("\n------ Account Details ------");
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Type        : " + accountType);
        System.out.println("Balance             : ₹" + balance);
        System.out.println("Account Active?     : " + isActive());
        System.out.println("-----------------------------\n");
    }

    
    public boolean isActive() {
        return balance >= MINIMUM_BALANCE;
    }
}
	
	


