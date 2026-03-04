package com.collectionsframework;

public class Main {
	public static void main(String[] args) {
		Printer<Integer> prt = new Printer<>(45);
		prt.print();
		System.out.println();
		Printer<String> prnt = new Printer<>("Captain America");
		prnt.print();
		System.out.println();
		Printer<Double> print = new Printer<>(29.000);
		print.print();
	}
}
