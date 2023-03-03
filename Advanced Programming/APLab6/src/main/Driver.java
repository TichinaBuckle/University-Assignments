package main;

import models.Student;

public class Driver {

	public static void main(String[] args) {
		Student std = new Student();
		//std.create("1010", "James", "Christy", "james.christy@gmail.com");
		//std.create("1011", "Maxine", "Browm", "maxine.brown@gmail.com");
		//std.update("1010", "Jamie");
		std.delete("1011");
		std.readAll();
		
	}

}
