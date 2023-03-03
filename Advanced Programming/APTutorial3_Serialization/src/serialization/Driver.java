package serialization;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Employee> employeesList = new ArrayList<>();
		
		employeesList.add(new Employee(1001, "John Brown", "1-876-435-7896", new Date(2, 2, 1990)));
		employeesList.add(new Employee(1002, "Mary Smith", "1-876-675-2385", new Date(25, 12, 2000)));
		employeesList.add(new Employee(1003, "John Brown", "1-876-527-3496", new Date(14, 7, 1975)));
		
		Employee.writeToEmployeesFile(employeesList);
	}

}
