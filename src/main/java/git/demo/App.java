package git.demo;

import java.util.LinkedHashSet;

/**
 * This is starting point of the application.
 * 
 */
public class App {
	public static void main(final String[] args) {
		System.out.println("Starting the app!");

		final User user1 = new User("Rahul", "Verma", "rahul@gmail.com");
		System.out.println(user1);

		final User user2 = new User("Rahul", "Sharma", "sharmaji@gmail.com");
		System.out.println(user2);

		final LinkedHashSet<User> users = new LinkedHashSet<User>();
		users.add(user1);
		users.add(user2);

		System.out.println("Users added: " + users);

		System.out.println("Removing users....");
		users.remove(user1);

		System.out.println("User removed: " + users);
	}
}
