package com.revature.data;

public class DAOFactory {
	//initalizar are PitchDAO to be null 
	// keep static instances of our DAO
	private static PitchDAO pitchDAO = null;
	private static EmployeeDAO employeeDAO = null;
	
	private DAOFactory() {
		
		
	}
	
	public static PitchDAO getPitchDAO() throws ClassNotFoundException {
	// make sure we are not recreating the DAO if it already exist	
		if(pitchDAO == null) {
			pitchDAO = new PitchDAOImp();
		}
		return pitchDAO;
	}
	public static EmployeeDAO getEmployeeDAO() throws ClassNotFoundException {
		if(employeeDAO == null) {
			employeeDAO = new EmployeeDAOImp();
		}
		return employeeDAO;
	}

	public static EmployeeDAOImp getEmployeeDAOImp() {
		// TODO Auto-generated method stub
		return null;
	}

}

	