/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 1 Abstract Classes, Interface, Inheritance, Polymorphism & Cast
				Exercise 3
 */

package domain;

public class PartTimeEmployee extends Employee implements Payable {

	// attributes
	private double overTimePay = 0;
	private final double basicPayRate = 3575.65;
	
	// constructors
	
	// primary 1
	public PartTimeEmployee(String id, String name, String phone, double salary, double hoursWorked) {
		super(id, name, phone, salary, hoursWorked);
	}
	
	// primary 2
	public PartTimeEmployee(String id, String name, String phone, double hoursWorked) {
		super(id, name, phone, hoursWorked);
	}
		
	// override methods
	// made no longer abstract
	@Override
	public double calculateOverTime() {
		overTimePay = (basicPayRate * (getHoursWorked() - 6) * overTimePay);
		return overTimePay;
	}

	@Override
	public double calculatePay() {
		if (hoursWorked <= 6) {
			return salary = basicPayRate * hoursWorked;
		}
		return salary = basicPayRate * 6 + calculateOverTime();
	}
	
}
