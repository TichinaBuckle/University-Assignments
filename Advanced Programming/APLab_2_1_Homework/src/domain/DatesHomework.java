/*
Author: Tichina Buckle
Date: March 1, 2022
Description: Lab Practical 2.1 – Exception Handling
			Homework
 */
package domain;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.DatesHomework.NotDayOfMonthException;

public class DatesHomework {
	int dayOfMonth = 1;
	
	// a) GetDayOfMonth methods
	public int GetDayOfMonth() throws NotDayOfMonthException {
			
			// prompts and accepts month of the month integer from user
			System.out.println("Enter day of the month integer: ");
			Scanner in = new Scanner(System.in);
				
			dayOfMonth = in.nextInt();
			
			if (dayOfMonth < 1 || dayOfMonth > 31) {
				throw new NotDayOfMonthException("Integer doesn't corresponse to day of month");
			}
		
		return dayOfMonth;
	}
	
	// b) ProcessDay method
	public void ProcessDay() throws NotDayOfMonthException {
		 int day;
	
		 try {
		 
			 day = GetDayOfMonth(); 
			 System.out.println("The day of the month processed was " + day);
		 
		 } catch (NullPointerException npx) {
			 System.err.println("Null Object Reference");
		 } catch (NotDayOfMonthException cs) {
			if (dayOfMonth < 1 || dayOfMonth > 31) {
				System.err.println("Integer doesn't corresponse to day of month");
			}
		 } catch (InputMismatchException ime) {
			System.err.println("An integer is needed for operation to occur");
		 }
		 
	}
	
	// Custom Exception Class - NotDayOfMonthException
	public class NotDayOfMonthException extends Exception {
		private String message; 
		
		public NotDayOfMonthException(String message) { 
			super(message); 
			this.message = message;
		}
		
		public String getMessage(){
			return this.message;
		} 
	}
	
}
