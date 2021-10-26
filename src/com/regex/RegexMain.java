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
		validate.validateFirstName(firstName);

		System.out.println("Enter Last name: ");
		String lastName = scan.nextLine();
		System.out.println(lastName);
		// method call to validate user last name
		validate.validateFirstName(lastName);

		System.out.println("Enter Email Id: ");
		String emailId = scan.nextLine();
		System.out.println(emailId);
		// method call to validate user email id
		validate.validateFirstName(emailId);

		System.out.println("Enter mobile number: ");
		String mobNumber = scan.nextLine();
		System.out.println(mobNumber);
		// method call to validate user mobile number
		validate.validaeMobileNum(mobNumber);

		System.out.println("Enter password with minimum 8 character: ");
		String password = scan.nextLine();
		System.out.println(password);
		// method call to validate user password
		validate.validaeMobileNum(password);

	}

}
