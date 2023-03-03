package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Date;
import domain.User;

public class ReadDriver {

	public static void main(String[] args) {

		// Read from Test
		List<User> uxList = new ArrayList<User>();
		
		uxList = User.readFromUsersFile();
		
		for(User user : uxList) {
			System.out.println(user);
		}
		
	}

}
