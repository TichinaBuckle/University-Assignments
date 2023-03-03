package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Date;
import domain.User;

public class WriteDriver {

	public static void main(String[] args) {

		//Write To Test
		ArrayList<User> usersList = new ArrayList<>();
		
		usersList.add(new User("Mary", "Lowes", 18 , new Date(2, 2, 2022)));
		usersList.add(new User("Margette", "Francis", 87 , new Date(12, 2, 2020)));
		usersList.add(new User("James", "Clarke", 37 , new Date(25, 12, 2012)));
		usersList.add(new User("Mark", "Black", 28 , new Date(1, 5, 2011)));
		usersList.add(new User("Alex", "Jones", 21 , new Date(2, 2, 2018)));
		
		User.writeToUsersFile(usersList);
		
	}

}
