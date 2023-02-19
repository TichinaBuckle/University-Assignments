/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 1 Abstract Classes, Interface, Inheritance, Polymorphism & Cast
				Exercise 4
 */

package driver;

import domain.PartTimeEmployee;
import domain.Payable;
import domain.Employee;

public class Driver {	
	
	// main methods
	public static void main(String[] args) {
		
		// variable
		double overTime;
		double salary;
		
		// create objects
		Payable employee1 = new PartTimeEmployee("0001", "Sally May", "876-578-6775", 170.99, 10); 
		Employee employee2 = (Employee)employee1;		
		
		// call methods
		overTime = employee1.calculateOverTime();
		System.out.println(overTime);
		
		salary = employee2.calculatePay();
		System.out.println(salary);
		
		System.out.println(employee1);
		
	} 
	
}
