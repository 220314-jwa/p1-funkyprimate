package com.revature.services;

import java.util.List;

import org.eclipse.jetty.server.Authentication.User;

import com.revature.app.Pitch;
import com.revature.exceptions.IncorrectCredentialsException;
import com.revature.models.Employee;


public interface UserService{
	
	public User logIn(String firstname, String lastName) throws IncorrectCredentialsException;


	public List<Pitch> viewAvailableTitles();


	public com.revature.models.User register(Employee newUser);
}
