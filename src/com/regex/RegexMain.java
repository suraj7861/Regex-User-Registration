package com.regex;

import java.util.Scanner;

public class RegexMain {

	public static void main(String[] args) {
		System.out.println("Welcome message to user registration program");
		// take input from user
		Scanner scan = new Scanner(System.in);
		// create object
		ValidateUserRegistration validate = new ValidateUserRegistration();
		System.out.println("Enter First name: ");
		String firstName = scan.nextLine();
		System.out.println(firstName);
		// method call to validate user first name
		try {
			validate.validateFirstName(firstName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter Last name: ");
		String lastName = scan.nextLine();
		System.out.println(lastName);
		// method call to validate user last name
		try {
			validate.validateFirstName(lastName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter Email Id: ");
		String emailId = scan.nextLine();
		System.out.println(emailId);
		// method call to validate user email id
		try {
			validate.validateEmail(emailId);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter mobile number: ");
		String mobNumber = scan.nextLine();
		System.out.println(mobNumber);
		// method call to validate user mobile number
		try {
			validate.validaeMobileNum(mobNumber);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

		System.out.println("Enter password minimum 8 character having at least one upper case , one numeric number and one special character: ");
		String password = scan.nextLine();
		System.out.println(password);
		// method call to validate user password
		try {
			validate.validatePassword(password);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}

	}

}
