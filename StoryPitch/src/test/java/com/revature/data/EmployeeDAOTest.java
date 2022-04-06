
	package com.revature.data;
	import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.Test;
	import com.revature.data.EmployeeDAOImp;
	import com.revature.models.Employee;
	
	public class EmployeeDAOTest {
		
	private static EmployeeDAOTest employeeDAO = new EmployeeDAOTest();
	
	@Test
	public void getValidEmployeeById()
	{
		String expectedUsername = "Jeremiah";
		Employee actual = EmployeeDAO.getUserById();
		assertEquals(expectedUsername, actual.getFirstName());
	}

@Test
	public void testUpdate() {
		Employee employeeTest = EmployeeDAO.getUserById();
		employeeTest.setFirstName("Jeremiah");
		Employee employee = EmployeeDAO.getUserById();
		System.out.println(employee);
		assertEquals("wil",employee.getFirstName());	
	}
	@Test
	public void testGetIDNoID() {
		Employee employeeOutput = EmployeeDAOImp.getUserById();
		assertNull(employeeOutput);
	}
//	@Disabled
//	public void createTest() throws SQLException {
//		Employee create = new Employee();
//		create.setUsername("my_username");
//		assertNotEquals(0, EmployeeDAOImp.create(create));
//	}
//	@Test
//	public void getByUsernameWhenUsernameExists() {
//		// setup
//		String usernameInput = "dro";
//		// call the method we're testing
//		Employee employeeOutput = employeeDAO.getByUsername(usernameInput);
//		// assert that it did what we expected
//		assertEquals("dro", employeeOutput.getUsername());
//	}
//	@Test
//	public void getByUsernameButUsernameDoesNotExist() {
//		String usernameInput = "pro";
//		Employee employeeOutput = employeeDAO.getByUsername(usernameInput);
//		assertNull(employeeOutput); // assertEquals(null, EmployeeOutput)
//		}
//	
	    }
//	}











