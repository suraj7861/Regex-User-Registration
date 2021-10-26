package com.regex;

public class ValidateUserRegistration {
	
	//method: validate user first name
	public boolean validateFirstName(String name) {
		String pattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
		if (name.matches(pattern)) {
			System.out.println("'" + name + "'" + " validation success !");
			return true;
		} else {
			System.out.println("'" + name + "'" + " validation unsuccessful ! ");
			return false;
		}
	}

}
