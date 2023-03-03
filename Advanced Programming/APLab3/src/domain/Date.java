package domain;

import java.io.Serializable;

public class Date implements Serializable {

	private int day;
	private int month;
	private int year;
	
	// primary constructor
	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//accessors and mutators
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	//toString
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
