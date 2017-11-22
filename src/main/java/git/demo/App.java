package git.demo;

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
	}
}
