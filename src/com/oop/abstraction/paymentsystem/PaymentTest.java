package com.oop.abstraction.paymentsystem;

public class PaymentTest {
	public static void main(String[] args) {
		System.out.println("Credit card Payment");
		
		CreditCardPayment creditcard =new CreditCardPayment("cc001",20000,"3517010000002816","Sriram Ramanaboina","491","12/42");
		creditcard.initiatePayment();
		creditcard.displayPaymentInfo();
		
		System.out.println();
		UpiPayment upipayment = new UpiPayment("UPI001",20000,"sriram@upi","000000");
		upipayment.initiatePayment();
		upipayment.displayPaymentInfo();
		
		System.out.println();
		DebitCardPayment debitcard = new DebitCardPayment ("DC0001",28000,"2517010000002816","Sriram Ramanaboina","490",4000);
		debitcard.initiatePayment();
		debitcard.displayPaymentInfo();
		
	}
	

}









