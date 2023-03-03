/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 2 Exception Handling
				Exercise 1, Question 4
 */

package Driver;

import domain.ExceptionExample;

public class Driver {

	public static void main(String[] args) {
		try {
			double quotient = analyze();
			System.out.println("The quotient of the two number is: " + quotient);
		} catch (ArithmeticException ax) {
			System.err.println("Division by zero is illegal");
		}

	}

}
