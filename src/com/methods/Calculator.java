package com.methods;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean continueCalculating = true;
		while (continueCalculating) {
			displayMenu();
			int choice = getUserChoice(scanner);
			if(choice == 6) {
				displayExitMessage();
				continueCalculating = false;				
			}else {
				if(choice >= 1 && choice <= 5) {
					performCalculation(scanner, choice);
					continueCalculating = askToContinue(scanner);
					
				}else {
					System.out.println("Invalid choice ! . Select between 1-6 ");
				}
			}
		}
		scanner.close();
		
	}
	
	private static void displayMenu() {
		System.out.println("=====================================================");
		System.out.println(" CALCULATOR REFACTORED ");
		System.out.println("=====================================================");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Exit");
		
	}
	
	private static int getUserChoice(Scanner scanner) {
		System.out.println("Enter Choice: ");
		return scanner.nextInt();
	}
	
	
	private static double[] getNumbers(Scanner scanner) {
		double [] numbers= new double[2];
		System.out.println("Enter First Number: ");
		numbers[0]= scanner.nextDouble();
		System.out.println("Enter Second Number: ");
		numbers[1] = scanner.nextDouble();
		return numbers;
		
	}
	
	
	private static void performCalculation(Scanner scanner, int choice) {
		double [] numbers = getNumbers(scanner);
		double num1 = numbers[0];
		double num2 = numbers[1];
		double result = 0;
		String operation ="";
		boolean valid  = true;
		
		if (choice == 1) 
		{
			result =add(num1,num2);
			operation= "+";
		}else {
			if(choice == 2) {
				result = subtract(num1,num2);
				operation = "-";
				
			}else {
				if(choice == 3) {
					result = multiply(num1,num2);
					operation = "*";
				}else {
					if(choice == 4) {
						if(num2 !=0) {
							result = divide(num1,num2);
							operation="/";
						}else {
							System.out.println("Error : division by zero ");
							valid = false;
						}
					}else {
						if(choice == 5) {
							if(num2 != 0) {
								result = modulus(num1,num2);
								operation="%";
							}else {
								System.out.println("Error : modulus by zero ");
								valid = false;
							}
						}
						
					}
				}
			}
		}
		
		if(valid) 
		{
			displayResult(num1,num2,operation,result);
			
		}	
	}
	
	
	
	private static double add(double a , double b)
	{
		return a+b;
	}
	
	private static double subtract(double a , double b)
	{
		return a-b;
		
	}
	private static double multiply(double a , double b)
	{
		return a * b;
	}
	private static double divide(double a , double b)
	{
		return a / b;
	}
	private static double modulus(double a , double b)
	{
		return a % b;
	}
	
	
	private static void displayResult(double num1, double num2, String operation, double result) {
		System.out.println("\n===================================");
		System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
		System.out.println("=====================================");
	}
	
	private static boolean askToContinue(Scanner scanner) {
        System.out.print("\nContinue? (yes/no): ");
        String response = scanner.next().toLowerCase();
        return response.equals("yes") || response.equals("y");
        
    }
	
	
	private static void displayExitMessage() {
        System.out.println("\nThank you for using Calculator!");
    }


	

}
