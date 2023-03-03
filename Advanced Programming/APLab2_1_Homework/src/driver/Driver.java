package driver;

import java.io.IOException;
import java.util.InputMismatchException;

import domain.DatesHomework;
import domain.DatesHomework.NotDayOfMonthException;

public class Driver {

	public static void main(String[] args) throws NotDayOfMonthException, IOException {

		char menu;
		DatesHomework day = new DatesHomework();
		
		try {

			// quick loop for menu
			while(true) {
				
			// c) Call and Test DatesHomework Methods
				day.ProcessDay();
				
				System.out.println("Perform another calculation?" + "[y/n]");
				menu = ' ';
				while (menu != 'n' && menu != 'N' && menu != 'y' && menu != 'Y')
					menu = (char) System.in.read();
				System.out.println(" ");
				if (menu == 'n' || menu == 'N')
					break;
	
			}
		} catch (NullPointerException npx) {
			 System.err.println("Null Object Reference");
		} catch (NotDayOfMonthException cs) {
			System.err.println("NotDayOfMonthException");
		} catch (InputMismatchException ime) {
			System.err.println("InputMismatchException");
		}

	}
}
