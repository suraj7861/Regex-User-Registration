package com.regex;

import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// method: validate user first name
	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(firstName);
		if (firstNamePattern.matches(firstName)) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid firstName", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
		}
	}

	// method: validate user last name
	public static boolean validateLastName(String lastName) throws UserRegistrationException {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		Pattern pattern = Pattern.compile(lastName);
		if (lastNamePattern.matches(lastName)) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid lastName", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
		}
	}

	// method: validate user Email Id
	public static boolean validateEmail(String emailId) throws UserRegistrationException{
		// email validation pattern
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		Pattern pattern = Pattern.compile(emailId);
		if (emailPattern.matches(emailId)) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid emailId", UserRegistrationException.ExceptionType.INVALID_EMAIL);
		}
	}

	// method: validate user mobile number
	public boolean validaeMobileNum(String mobNumber) throws UserRegistrationException {
		// pattern
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		Pattern pattern = Pattern.compile(mobNumber);
		if (mobNumberPattern.matches(mobNumber)) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid mobNumber", UserRegistrationException.ExceptionType.INVALID_MOBILE);
		}
	}

	// method: validate user password
	public boolean validatePassword(String password) throws UserRegistrationException {
		// password pattern
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		Pattern pattern = Pattern.compile(password);
		if (passwordPattern.matches(password)) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid password", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}

}