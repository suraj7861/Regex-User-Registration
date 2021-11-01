package com.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	// ------------Test Cases for First Name Validation--------
	@Test
	public void givenFirstName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String first_name = userValidation.validateFirstName("Suraj");
		Assert.assertEquals(expectedValue, first_name);
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String first_name = userValidation.validateFirstName("suraj1");
		Assert.assertEquals(expectedValue, first_name);
	}

	// ------------Test Cases for Last Name Validation--------
	@Test
	public void givenLastName_WhenProper_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String last_name = userValidation.validateLastName("Khomane");
		Assert.assertEquals(expectedValue, last_name);
	}

	@Test
	public void givenLaststName_WhenWithSpChars_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String last_name = userValidation.validateFirstName("khomane1");
		Assert.assertEquals(expectedValue, last_name);
	}

	// ------------Test Cases for Email Validation--------
	@Test
	public void validateEmailAddress_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String email = userValidation.validateEmail("suraj@gmail.com");
		Assert.assertEquals(expectedValue, email);
	}

	@Test
	public void validateEmailAddress_WhenNotValid_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String email = userValidation.validateEmail("abc#gmail.com");
		Assert.assertEquals(expectedValue, email);
	}

	// ----------Test Cases for Mobile Number Validation------
	@Test
	public void validateMobileNo_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String phoneNo = userValidation.validaeMobileNum("91 8888777744");
		Assert.assertEquals(expectedValue, phoneNo);
	}

	@Test
	public void validateMobileNo_WhenShort_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String phoneNo = userValidation.validaeMobileNum("91 839379");
		Assert.assertEquals(expectedValue, phoneNo);
	}

	// -------- Test Cases for Password Validation --------
	@Test
	public void validatePassword_WhenValid_ShouldReturnHappy() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Happy";
		String password = userValidation.validatePassword("SwS@sff223");
		Assert.assertEquals(expectedValue, password);
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String password = userValidation.validatePassword("wret@sff223");
		Assert.assertEquals(expectedValue, password);
	}

	@Test
	public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnSad() {
		ValidateUserRegistration userValidation = new ValidateUserRegistration();
		String expectedValue = "Sad";
		String password = userValidation.validatePassword("SS@asdf");
		Assert.assertEquals(expectedValue, password);
	}
}
<<<<<<< HEAD


=======
>>>>>>> UC11_Junit_Parameterized_Email_Test
