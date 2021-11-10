package com.regex;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParameterisedTest {

	public String testEmail;
	public String expectedResult;
	public ValidateUserRegistration userRegistration;

	// ----Test Cases for email with Parameterized constructor-----
	public UserRegistrationParameterisedTest(String testEmail, String expectedResult) {
		super();
		this.testEmail = testEmail;
		this.expectedResult = expectedResult;
	}

	// @before annotation runs before with each test run
	@Before
	public void initialize() {
		userRegistration = new ValidateUserRegistration();
	}


    // this is a collection to run will multiple email.
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][]{
				{"abc@yahoo.com", "Happy"}, {"abc-100@yahoo.com", "Sad"},	{"abc.100@yahoo.com", "Happy"},
				{"abc111@abc.com", "Happy"}, {"abc-100@abc.net", "Happy"}, {"abc.100@abc.com.au", "Happy"},
				{"abc@1.com", "Happy"}, {"abc@gmail.com.com", "Happy"}, {"abc+100@gmail.com", "Happy"},
				{"abc", "Sad"}, {"abc@.com.my", "Sad"}, {"abc123@gmail.a", "Sad"}, {"abc123@.com", "Sad"},
				{"abc123@.com.com", "Sad"}, {".abc@abc.com", "Sad"}, {"abc()*@gmail.com", "Sad"},
				{"abc@%*.com", "Sad"}, {"abc..2002@gmail.com", "Sad"}, {"abc.@gmail.com", "Happy"},
				{"abc@abc@gmail.com", "Sad"}, {"abc@gmail.com.1a", "Sad"}, {"abc@gmail.com.aa.au", "Sad"},
			});
	}


    // Test case actually runs from here
	@Test
	public void testUserRegistrationTest() throws UserRegistrationException {
		System.out.println("This is Expected Result " + this.expectedResult);
		boolean message = ValidateUserRegistration.validateEmail(testEmail);
		Assert.assertEquals(this.expectedResult, message);
	}
}
