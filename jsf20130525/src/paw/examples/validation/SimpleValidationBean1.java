package paw.examples.validation;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SimpleValidationBean1 {
	private String firstName;
	private String lastName;
	private String email;
	private String postalCode;
	private Integer age;
	
	public SimpleValidationBean1() {
		Logger.getLogger("paw.examples").info("SimpleValidationBean1 created...");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String register() {
		
		return "success";
	}
}
