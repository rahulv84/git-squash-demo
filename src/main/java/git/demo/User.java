package git.demo;

/**
 * This is User pojo. This contains user details.
 * 
 */
public class User {
	String firstName;
	String lastName;
	String email;

	public User() {

	}

	public User(final String firstName, final String lastName,
			final String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Override
	public boolean equals(final Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuilder().append(this.firstName).append(" ")
				.append(this.lastName).append(" ").append(this.email)
				.toString();
	}
}