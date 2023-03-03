/*
Author: Tichina Buckle
Date: March 1, 2023
Description:  Lab 4 - File & Object Serialization
*/

package domain;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import domain.Date;

public class User implements Serializable {

	// variable
	public String firstName;
	public String lastName;
	public int age;
	public Date signupDate;
	
	// constructors
	
	// default
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.signupDate = new Date (1, 1, 1700);
	}
	
	// primary
	public User(String firstName, String lastName, int age, Date signupDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.signupDate = signupDate;
	}
	
	// copy
	public User(User user) {
		firstName = user.firstName;
		lastName = user.lastName;
		age = user.age;
		signupDate = user.signupDate;
	}

	// accessors and mutators
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}
	
	//toString
	@Override
	public String toString() {
		return "FirstName: " + firstName + 
				"\nLastName: " + lastName + 
				"\nAge: " + age + 
				"\nSignupDate: " + signupDate + "\n";
	}
	
	// Write to file function
	public static void writeToUsersFile(ArrayList<User> usersList) {
		
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		
		try {
			fileOut = new FileOutputStream("./src/UsersDB.ser");
			out = new ObjectOutputStream(fileOut);
			
			for(User user : usersList) {
				out.writeObject(user);
			}
			out.flush();
			out.close();
			System.out.println("Serialized users data is saved\n");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	// Read from file function
	public static ArrayList<User> readFromUsersFile() {
		ArrayList<User> usersList = new ArrayList<>();
		FileInputStream fileIn = null;
		ObjectInputStream in = null;
		User user;
		
		try {
			fileIn = new FileInputStream("./src/UsersDB.ser");
			in = new ObjectInputStream(fileIn);
			
			while(true) {
				try {
					user = (User) in.readObject();
					if(user != null) {
						// Add employee to the list of employees
						usersList.add(user);
					} else if (user == null) {
						break; // Leave the while loop
					}
				}catch (ClassNotFoundException e) {
					System.out.println("Object could not be converted to a user");
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException i) {
			i.printStackTrace();
		}
		return usersList;
	}
	
}
