package com.regex;

import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// method: validate user first name
	public String validateFirstName(String firstName) {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(firstName);
		return validation(firstNamePattern, firstName);
	}

	// method: validate user last name
	public static String validateLastName(String lastName) {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(lastName);
		return validation(lastNamePattern, lastName);
	}

	// method: validate user Email Id
	public static String validateEmail(String emailId) {
		// email validation pattern
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		Pattern pattern = Pattern.compile(emailPattern);
		return validation(emailPattern, emailId);
	}

	// method: validate user mobile number
	public String validaeMobileNum(String mobNumber) {
		// pattern
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		return validation(mobNumberPattern, mobNumber);
	}

	// method:  validate user password
	public String validatePassword(String password) {
		// password pattern
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$"; 
		return validation(passwordPattern, password);
	}
	

	public static String validation(String pattern, String UserInput) {
		if (UserInput.matches(pattern)) { // check Input and Pattern
			return "Happy";
		} else {
			return "Sad";
		}	
	}

}
