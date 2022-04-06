package com.revature.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Repeatable;

import org.junit.jupiter.api.Test;

import com.revature.models.Employee;
import com.revature.models.User;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.revature.models.Employee;

public class EmployeeDAOTest {
	
private EmployeeDAOTest employeeDAO = new EmployeeDAOTest();

@Test
public void getValidPersonById(){
	String expectedUsername = "Jeremiah";
	Employee actual = employeeDAO.getUserById(1);
	assertEquals(expectedUsername, actual.getUsername());
}
//@Test
//public void testUpdate() {
//	Person personUp = EmployeeDAOImp.getUserById(6);
//	personUp.setFirst_name("Jeremiah");
//	personDAO.update(personUp);
//	Person person=EmployeeDAOImp.getUserById(6);
//	System.out.println(person);
//	assertEquals("Jeremiah",person.getFirst_name());	
//}
//@Test
//public void testGetIDNoID() {
//	Person personOutput= EmployeeDAOImp.getUserById(10000);
//	assertNull(personOutput);
//}
//@Disabled
//public void createTest() {
//	Person create = new Person();
//	create.setUsername("my_username");
//	assertNotEquals(0, EmployeeDAOImp.create(create));
//}
//@Test
//public void getByUsernameWhenUsernameExists() {
//	// setup
//	String usernameInput = "Jeremiah";
//	// call the method we're testing
//	Person personOutput = EmployeeDAOImp.getByUsername(usernameInput);
//	// assert that it did what we expected
//	assertEquals("Jeremiah", personOutput.getUsername());
//}
//@Test
//public void getByUsernameButUsernameDoesNotExist() {
//	String usernameInput = "pro";
//	Person personOutput = EmployeeDAOImp.getByUsername(usernameInput);
//	assertNull(personOutput); // assertEquals(null, personOutput)

private Employee getUserById(int i) {
	// TODO Auto-generated method stub
	return null;
}
}