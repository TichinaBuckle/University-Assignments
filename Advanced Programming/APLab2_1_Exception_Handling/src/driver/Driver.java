package driver;

import java.util.InputMismatchException;
import domain.ContainersNeeded;
import domain.ContainersNeeded.MyException;

public class Driver {

	public static void main(String[] args) throws Exception, MyException {

		ContainersNeeded shipment = new ContainersNeeded();
		System.out.println("Calling Demonstrate() from main()");
		
		// Exercise 3 - exception handling outside method
		try {
			shipment.Demonstrate();
		} catch (ArithmeticException ax) {
			System.err.println("Division by zero is illegal");
		} catch (InputMismatchException ime) {
			System.err.println("None Integer was inputted");
		} catch (MyException cs) {
			System.err.println("Custom Exception Thrown");
		}
		
		System.out.println("Returned from Demonstrate()," + " now back in main()");

	}

}
