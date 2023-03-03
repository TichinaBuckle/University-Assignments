package factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConnectorFactory {

	// 7
	private static Connection dbConn = null;
	
	// 8
	public static Connection getDatabaseConnection() {
		
		// 9 - check connection is null and establishes / returns connection
		if (dbConn == null) {
			String url = "jdbc:mysql://localhost:3306/aplab6";
			try {
				dbConn = DriverManager.getConnection(url, "root", "");
				JOptionPane.showMessageDialog(null, "Connection Established", "JBDC Connection Status", JOptionPane.INFORMATION_MESSAGE);
			} catch (SQLException e) {
				System.err.println("SQL Exception: " + e.getMessage());
			} catch (Exception e) {
				System.err.println("Unexpected Error: " + e.getMessage());
			}
		}
		
		return dbConn;
	}
	
}
