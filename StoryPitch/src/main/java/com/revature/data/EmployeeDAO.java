package com.revature.data;

import com.revature.models.Employee;
import com.revature.models.Status;

public interface EmployeeDAO extends GenericDAO<Employee>{

	Employee getUserById(int i);

	Employee getByUsername(String usernameInput);



	static Employee getUserById() {
		// TODO Auto-generated method stub
		return null;
	}




	
}
