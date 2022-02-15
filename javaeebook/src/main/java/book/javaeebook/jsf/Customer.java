package book.javaeebook.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="customer")
@RequestScoped
public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
