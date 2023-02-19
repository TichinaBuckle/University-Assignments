/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Lab 1 COLLECTIONS & GENERICS
				Exercise 1
 */

package domain;

public class Vehicles {

	// attributes
	private String make;
	private String model;
	private String color;
	private int year;
	private boolean fourWD;
	
	// constructors
	
	// default
	public Vehicles() {
		make = "?";
		model = "?";
		color = "?";
		year = 0000;
		fourWD = false;
	}
	
	//primary
	public Vehicles(String make, String model, String color, int year, boolean fourWD) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.fourWD = fourWD;
	}
	
	// copy
	public Vehicles(Vehicles v) {
		this.make = v.make;
		this.model = v.model;
		this.color = v.color;
		this.year = v.year;
		this.fourWD = v.fourWD;
	}

	// accessors and mutators
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isFourWD() {
		return fourWD;
	}

	public void setFourWD(boolean fourWD) {
		this.fourWD = fourWD;
	}
	
	// toString
	@Override
	public String toString() {
		return "Vehicle" + 
				"\nMake: " + make + 
				"\nModel: " + model + 
				"\nColor: " + color + 
				"\nYear: " + year + 
				"\nFour Wheel Drive: " + fourWD + "\n";
	}
		
}
