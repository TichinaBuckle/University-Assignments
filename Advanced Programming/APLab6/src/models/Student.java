package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import factories.DBConnectorFactory;

public class Student {
	
	// 11
	private static Connection dbConn = null;
	
	// 14
	private Statement stmt;
	private ResultSet result;
	
	
	// 12
	public Student() {
		dbConn = DBConnectorFactory.getDatabaseConnection();
	}
	
	// 13
	public void create(String id, String firstName, String lastName, String email) {
		// 14
		String insertSQL = "INSERT INTO aplab6.students (id, firstName, lastName, email)"
				+ "VALUES('"+ id +"','"+ firstName +"','"+ lastName +"','"+ email +"');";
			// 15
			try {
				stmt = dbConn.createStatement();
				int inserted = stmt.executeUpdate(insertSQL);
				//check if insert was successful
				if (inserted == 1) {
					JOptionPane.showMessageDialog(null, "Student record inserted successfully", "Insertion Status", JOptionPane.INFORMATION_MESSAGE);
					return;
				} else {
					JOptionPane.showMessageDialog(null, "Record insertion fail", "Insertion Status", JOptionPane.ERROR_MESSAGE);
				}
			} catch (SQLException e) {
				System.err.println("SQL Exception: " + e.getMessage());
			} catch (Exception e) {
				System.err.println("Unexpected Error: " + e.getMessage());
			}
	}
	
	public void readAll() {
		String readAllSQL = "SELECT id, firstName, lastName, email " + "FROM aplab6.students";
		try {
			stmt = dbConn.createStatement();
			result = stmt.executeQuery(readAllSQL);
			// iterate through results
			while (result.next()) {
				//extract information from result set
				String id = result.getString("id");
				String firstName = result.getString("firstName");
				String lastName = result.getString("lastName");
				String email = result.getString("email");
				System.out.println("ID: " + id +
						"\nName: " + firstName + " " + lastName +
						"\nEmail: " + email + "\n");
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		}
	}
	
	public void update(String id, String lastName) {
		// 16
		String updateSQL = "UPDATE aplab6.students " + "SET lastName = '"+lastName+" '" + "WHERE id = '"+id+"';";
		try {
			stmt = dbConn.createStatement();
			int updated = stmt.executeUpdate(updateSQL);
			//check if insert was successful
			if (updated == 1) {
				JOptionPane.showMessageDialog(null, "Student record updated successfully", "Update Status", JOptionPane.INFORMATION_MESSAGE);
				return;
			} else {
				JOptionPane.showMessageDialog(null, "Record update fail", "Update Status", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		}
	}
	
	public void delete(String id) {
		// 17
		String deleteSQL = "DELETE FROM aplab6.students WHERE id = "+id+";";
		try {
			stmt = dbConn.createStatement();
			int deleted = stmt.executeUpdate(deleteSQL);
			//check if insert was successful
			if (deleted == 1) {
				JOptionPane.showMessageDialog(null, "Student record updated successfully", "Update Status", JOptionPane.INFORMATION_MESSAGE);
				return;
			} else {
				JOptionPane.showMessageDialog(null, "Record update fail", "Update Status", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			System.err.println("SQL Exception: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		}
	}

}
