/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 1 Abstract Classes, Interface, Inheritance, Polymorphism & Cast
				Exercise 2
 */

package domain;

public interface Payable {
	//attributes
	public double ovtrate = 1.25; //values assign to keep constant
	
	//Method calculateOverTime
	public abstract double calculateOverTime();
	
}
