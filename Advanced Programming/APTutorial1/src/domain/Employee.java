/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Tutorial 1 Abstract Classes, Interface, Inheritance, Polymorphism & Cast
				Exercise 1
 */


package domain;

public abstract class Employee {
	//attributes
	protected String id;
	protected String name;
	protected String phone;
	protected double salary;
	protected double hoursWorked;
	
	//constructors
	
	//default 1
	public Employee(String id, String name, String phone, double salary, double hoursWorked) 
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}
	
	// default 2
	public Employee(String id, String name, String phone, double hoursWorked) 
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.hoursWorked = hoursWorked;
	}
	
	//primary
	public Employee() 
	{
		this.id = "0";
		this.name = "?";
		this.phone = "?";
		this.salary = 0;
		this.hoursWorked = 0;
	}
	
	//copy
	public Employee(Employee e) 
	{
		this.id = e.id;
		this.name = e.name;
		this.phone = e.phone;
		this.salary = e.salary;
		this.hoursWorked = e.hoursWorked;
	}

	//accessor and mutators
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	//toString Method
	@Override
	public String toString() {
		return "Employee" 
				+ "ID=" + id 
				+ "\nName=" + name 
				+ "\nPhone=" + phone 
				+ "\nSalary=" + salary 
				+ "\nHours Worked=" + hoursWorked + "\n";
	}
	
	//Method Calculate Pay
	public abstract double calculatePay();
	
}
