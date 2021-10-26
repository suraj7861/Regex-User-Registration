package com.regex;

import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// method: validate user first name
	public void validateFirstName(String firstName) {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(firstName);
		validation(firstNamePattern, firstName);
	}

	// method: validate user last name
	public static void validateLastName(String lastName) {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(lastName);
		validation(lastNamePattern, lastName);
	}

	// method: validate user Email Id
	public static void validateEmail(String emailId) {
		// email validation pattern
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		Pattern pattern = Pattern.compile(emailPattern);
		validation(emailPattern, emailId);
	}

	// method: validate user mobile number
	public void validaeMobileNum(String mobNumber) {
		// pattern
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		validation(mobNumberPattern, mobNumber);
	}

	public static void validation(String pattern, String UserInput) {
		if (UserInput.matches(pattern)) { // check Input and Pattern
			System.out.println("'" + UserInput + "'" + " validation success !");
		} else {
			System.out.println("'" + UserInput + "'" + " validation success !");
		}
	}

}
