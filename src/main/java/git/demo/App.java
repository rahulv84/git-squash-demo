package git.demo;

/**
 * This is starting point of the application.
 * 
 */
public class App {
	public static void main(final String[] args) {
		System.out.println("Starting the app!");

		final User user = new User("Rahul", "Verma", "rahul@gmail.com");
		System.out.println(user);
	}
}
