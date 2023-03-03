/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 2 Exception Handling
				Exercise 1
 */

package domain;

import java.util.Scanner;

public class ExceptionExample {
	
	// findQuotient() Method
	public static double findQuotient() {
		int firstNumber;
		int secondNumber;
		double quotient = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		firstNumber = input.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = input.nextInt();
		
		// exception handling
		try {
		quotient = firstNumber / secondNumber;
		} catch (ArithmeticException ax) {
			System.err.println("Division by zero is illegal");
		}
		
		return quotient;
	}
	
	//analyze() method
	public static double analyze() {
		double quotient = 0;
		
		try {
			quotient = findQuotient();
		} catch (ArithmeticException ex) {
			throw ex;
		}
		
		return quotient;
	}
	
	/*
	// findQuotient() Method second version
		public static double findQuotient2() throws ArithmeticException {
			int firstNumber;
			int secondNumber;
			double quotient = 0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter first number: ");
			firstNumber = input.nextInt();
			
			System.out.println("Enter second number: ");
			secondNumber = input.nextInt();
			
			quotient = firstNumber / secondNumber;
			
			return quotient;
		}
	*/
}
