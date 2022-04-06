package com.revature.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.app.Pitch;
import com.revature.models.Status;
import com.revature.services.ConnectionFactory;

public class PitchDAOImp implements PitchDAO {
	//Connection 
	Connection connection;
	
	//Connection retrieve the connection from the Connection Factory with new  method
	public PitchDAOImp() throws ClassNotFoundException {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public int create(Pitch newObj) throws SQLException {
		// TODO Auto-generated method stub
		String sql ="insert into pitch (pitchID, employeeName, employeeID, genre, status, title, completionDate, description)" + 
		"values(default, ?, ?, ?, ?, ?, ?)";
		// prepared statement
		PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		
		preparedStatement.setString(1, newObj.getEmployeeName());
		preparedStatement.setInt(2, newObj.getEmployeeID());
		preparedStatement.setString(3, newObj.getGenre());
		preparedStatement.setString(4, newObj.getStatus());
		preparedStatement.setString(5, newObj.getTitle());
		preparedStatement.setString(6, newObj.getCompletionDate());
		preparedStatement.setString(7, newObj.getDescription());
		//execute the command
		boolean count = preparedStatement.execute();
		ResultSet resultSet = preparedStatement.getGeneratedKeys();
		if(count == true) {
			System.out.println("Employee Added Successful");
			resultSet.next();
			int id = resultSet.getInt(1);
			return id;
			}else {
				System.out.println("Something went wrong adding the value");
				return -1;
			}
		}

	@Override
	public Pitch getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pitch updatedObj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pitch objToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Status getByUsername(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
