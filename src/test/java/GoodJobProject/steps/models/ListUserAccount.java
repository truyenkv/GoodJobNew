package GoodJobProject.steps.models;

public class ListUserAccount {
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String role;
	
	public ListUserAccount(String firstName,String lastName, String email, String role)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}
}
