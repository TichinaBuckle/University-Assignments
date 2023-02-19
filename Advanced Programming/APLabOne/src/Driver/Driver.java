/*
 Author: Tichina Buckle
 Date: February 18 2023
 Description: Advance Programming Lab 1 COLLECTIONS & GENERICS
				Exercise 1
 */


package Driver;

// imported packages and libraries
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import domain.Vehicles;

public class Driver {

	public static void main(String[] args) {
		
		// create vehicle list
		List<Vehicles> VehicleList = new ArrayList<Vehicles>();
		
		// add vehicle to list
		VehicleList.add(new Vehicles("Honda", "Civic", "Red", 2015, true));
		VehicleList.add(new Vehicles("Toyota", "Tida", "White", 2009, true));
		VehicleList.add(new Vehicles("Jeep", "Annoying", "Green", 2021, false));
		
		// display foreach loop
		for(Vehicles vehicle : VehicleList) {
			System.out.println(vehicle);
		}
		
		// create vehicle LinkedList
		List<Vehicles> VehicleLinkedList = new LinkedList<Vehicles>();
		
		// add vehicle to list
		VehicleLinkedList.add(new Vehicles("Honda", "Civic", "Red", 2015, true));
		VehicleLinkedList.add(new Vehicles("Toyota", "Tida", "White", 2009, true));
		VehicleLinkedList.add(new Vehicles("Jeep", "Annoying", "Green", 2021, false));
		
		// call the printListElements method with the VehicleLinkedList
	    printListElements(VehicleLinkedList);
	}
	
	// printListElements Method
	public static void printListElements(List<Vehicles> vehicleLinkedList) {
	    for (Vehicles vehicle : vehicleLinkedList) {
	        System.out.println(vehicle);
	    }
	}
}
