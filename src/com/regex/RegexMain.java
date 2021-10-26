package com.regex;

import java.util.Scanner;

public class RegexMain {

	public static void main(String[] args) {
		System.out.println("Welcome message to user registration program");
		//take input from user
		Scanner scan = new Scanner(System.in);
		//create object 
		ValidateUserRegistration validate = new ValidateUserRegistration();
		System.out.println("Enter First name: ");
		String firstName = scan.nextLine();
		System.out.println(firstName);
		//method call to validate user first name
		validate.validateFirstName(firstName);

	}

}
