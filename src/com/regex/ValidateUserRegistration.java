package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUserRegistration {
	IValidateUserDetail validateUser = (userDetails,pattern)->Pattern.matches(userDetails,pattern);

	// method: validate user first name
	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		String firstNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		System.out.println(validateUser.userValidation(firstName,firstNamePattern ));
		if (validateUser.userValidation(firstName,firstNamePattern )) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid firstName", UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
		}
	}

	// method: validate user last name
	public boolean validateLastName(String lastName) throws UserRegistrationException {
		String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		if (validateUser.userValidation(lastName,lastNamePattern )) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid lastName", UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
		}
	}

	// method: validate user Email Id
	public boolean validateEmail(String emailId) throws UserRegistrationException{
		// email validation pattern
		String emailPattern = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
		if (validateUser.userValidation(emailId,emailPattern )) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid emailId", UserRegistrationException.ExceptionType.INVALID_EMAIL);
		}
	}

	// method: validate user mobile number
	public boolean validaeMobileNum(String mobNumber) throws UserRegistrationException {
		// pattern
		String mobNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";
		if (validateUser.userValidation(mobNumber,mobNumberPattern )) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid mobNumber", UserRegistrationException.ExceptionType.INVALID_MOBILE);
		}
	}

	// method: validate user password
	public boolean validatePassword(String password) throws UserRegistrationException {
		// password pattern
		String passwordPattern = "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		if (validateUser.userValidation(password,passwordPattern )) { // check Input and Pattern
			return true;
		} else {
			throw new UserRegistrationException("Enter valid password", UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}

}