package com.revature.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.Employee;
import com.revature.models.Status;
import com.revature.services.ConnectionFactory;

public class EmployeeDAOImp implements EmployeeDAO  {
	
	Connection connection;
	
	public EmployeeDAOImp() throws ClassNotFoundException {
		connection = ConnectionFactory.getConnection();
	}
		@Override
		public int create(Employee newObj) throws SQLException {
			String sql ="insert into employee(employeeID, firstName, lastname, roleID)" + "values(default, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, newObj.getEmployeeID());
			preparedStatement.setString(2, newObj.getFirstName());
			preparedStatement.setString(3, newObj.getLastName());
			preparedStatement.setInt(4, newObj.getRoleID());

			boolean count = preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if(count == true) {
				System.out.println("Employee added successfully");
				resultSet.next();
				int id = resultSet.getInt(1);
				return id;
			}else {
				System.out.println("Something went wrong with the process");
				return -1;
			}
		}

		
		public Employee getByUserId(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Employee> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(Employee updatedObj) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Employee objToDelete) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Employee getByUsername(String username) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Employee getById(int id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Employee getUserById(int i) {
			// TODO Auto-generated method stub
			return null;
		}
		public static Employee getUserById() {
			// TODO Auto-generated method stub
			return null;
		}
	
		
	}

