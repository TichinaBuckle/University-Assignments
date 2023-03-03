package serialization;

/*
Author: Tichina Buckle
Date: March 1, 2023
Description: Tutorial 3 - File Streams and Object Serialization

Employee Class 
*/

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import serialization.Date;

public class Employee implements Serializable {
	
	private int employeeId;
	private String name;
	private String phone;
	private Date dob;
	
	// constructors
	
	// default
	public Employee() {
		this.employeeId = 0;
		this.name = "";
		this.phone = "0(000)-000-0000";
		this.dob = new Date (1, 1, 1700);
	}
	
	// primary
		public Employee(int employeeId, String name, String phone, Date dob) {
			this.employeeId = employeeId;
			this.name = name;
			this.phone = phone;
			this.dob = dob;
		}

		//accessors and mutators
		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
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

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		//toString
		@Override
		public String toString() {
			return "EmployeeId: " + employeeId + 
					"\nName: " + name + 
					"\nPhone: " + phone + 
					"\nD.O.B: " + dob + "\n";
		}
		
		// writeToEmployeesFile method - 7
		public static void writeToEmployeesFile(ArrayList<Employee> employeesList) {
			
			FileOutputStream fileOut = null;
			ObjectOutputStream out = null;
			
			try {
				fileOut = new FileOutputStream("./src/EmployeesDB.ser");
				out = new ObjectOutputStream(fileOut);
				
				for(Employee employee : employeesList) {
					out.writeObject(employee);
				}
				out.flush();
				out.close();
				System.out.println("Serialized employees data is saved\n");
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
		
		//readFromEmployeesFile - 8
		public static ArrayList<Employee> readFromEmployeesFile() {
			ArrayList<Employee> employeesList = new ArrayList<>();
			FileInputStream fileIn = null;
			ObjectInputStream in = null;
			Employee employee;
			
			try {
				fileIn = new FileInputStream("./src/EmployeesDB.ser");
				in = new ObjectInputStream(fileIn);
				
				while(true) {
					try {
						employee = (Employee) in.readObject();
						if(employee != null) {
							// Add employee to the list of employees
							employeesList.add(employee);
						} else if (employee == null) {
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
			return employeesList;
		}
		
}
