package com.revature.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import com.revature.exceptions.IncorrectCredentialsException;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.models.User;

public class UserServiceTest {

	private UserService userServ;
	
	@Test
	public void exampleTest() {
		assertTrue(true);
	}
	
	@Test
	public void logInSuccessfully() throws IncorrectCredentialsException {
	// setup (args, expected result, etc. ) 
		String firstName = "Jeremiah";
		String lastName = "Lizarraga";
	
		// call the method we are testing
		Employee result = (Employee) userServ.logIn(firstName, lastName);
		
	// have an assertion
		assertEquals(firstName, result.getFirstName());
		assertEquals(lastName, result.getLastName());
	}
	@Test
	public void logInWrongUsername() {
		
		String firstName = "Jeremiah";
		String lastname = "L";
		
		assertThrows(IncorrectCredentialsException.class, () -> {
			userServ.logIn(firstName, lastname);
		});
	}
	

	
	
}
