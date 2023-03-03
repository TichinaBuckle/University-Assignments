package domain;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContainersNeeded {

	public void Demonstrate() throws IOException, Exception {
		int WholesaleSize; // size of ws container
		int RetailSize; // size of rt container
		int NumberRetailNeeded; // num of containers needed
		char ANS; // single char needed to store 'y' or 'n'
		
		System.out.println("Now in Demonstrate()");
		
		try {
			while (true) {
				WholesaleSize = EnterSizeOfWholesaleContainer();
				RetailSize = EnterSizeOfRetailContainer();
				NumberRetailNeeded = CalculateRetailContainerNeeded(WholesaleSize, RetailSize);
								
				System.out.println("Back in Demonstrate()");
		
				System.out.println("The number of retail container" + "needed is " + NumberRetailNeeded);
				
				System.out.println("Perform another calculation?" + "[y/n]");
				ANS = ' ';
			
				while (ANS != 'y' && ANS != 'Y' && ANS != 'n' && ANS != 'N')
					ANS = (char) System.in.read();
				System.out.println(" ");
				if (ANS == 'n' || ANS == 'N')
					break;
				}
			} catch (ArithmeticException ax) {
				System.err.println("An Arithmetic Exception has occurred");
			} catch (InputMismatchException ime) {
				System.err.println("An Input Mismatch Exception has occurred");
		}
	}
	
	// enters the size of the wholesale container
	public int EnterSizeOfWholesaleContainer() 
	{
		Scanner in = new Scanner(System.in);
		int size;
		
		System.out.println("Now in EnterSizeOfWholesaleContainer()");
		System.out.println("Enter the size of the wholesale" + " container - ");
		
		size = in.nextInt();
		System.out.println(" ");
		return size;
	}
	
	// enters the size of the retail container
		public int EnterSizeOfRetailContainer() 
		{
			Scanner in = new Scanner(System.in);
			int size;
			
			System.out.println("Now in EnterSizeOfRetailContainer()");
			System.out.println("Enter the size of the retail" + " container - ");
			
			size = in.nextInt();
			System.out.println(" ");
			return size;
		}
	
	// calculates the number of retail containers needed
	// and returns the result
		public int CalculateRetailContainerNeeded(int wcSize, int rcSize) throws MyException
		{
			/*
			// Exercise 2 - Exception handling in method
			try {
				System.out.println("Now in CalculateRetailContainerNeeded()");
				return wcSize / rcSize;
				} catch (ArithmeticException ax) {
					System.err.println("Division by zero is illegal");
				}
			return 0;
			*/
			
			System.out.println("Now in calculateRetailContainersNeeded()");

		    if (rcSize == 0) {
		        throw new MyException("The custom exception MyException has been thrown");
		    }

		    return wcSize / rcSize;
		}
		
	// custom exception
		public class MyException extends Exception{
			
			private String message; 
			
			public MyException(String message) { 
				super(message); 
				this.message = message;
			}
			
			public String getMessage(){
				return this.message;
			} 
			} 
		
}
