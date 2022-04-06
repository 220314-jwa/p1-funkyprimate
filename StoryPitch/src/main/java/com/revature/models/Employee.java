package com.revature.models;

import com.revature.app.Pitch;

public class Employee extends Pitch{

	
	private int employeeID;
	private String firstName;
	private String lastName;
	private int roleID = 0;
	
	public String toString() {
		return "Employee [employeeID=" + employeeID +", firstName=" + firstName +", lastName="+lastName + ", roleID="+roleID+" ]";
		
		
	}
	

	
	public Employee() {
		
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getRoleID() {
		return roleID;
	}


	public void setRoleId(int employeeId) {
		this.roleID = employeeId;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public Integer getEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}



	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setFirst_name(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}



	public static Employee getByUsername(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	

}