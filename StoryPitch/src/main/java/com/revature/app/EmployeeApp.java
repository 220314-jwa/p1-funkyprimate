package com.revature.app;
import com.revature.data.EmployeeDAOImp;
import com.revature.models.Employee;
import io.javalin.Javalin;
public class EmployeeApp {

	
	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin app = Javalin.create().start(8081);
		app.get("/employee", ctx ->{
			ctx.result("Employee");
		});
		
		app.post("/employee", ctx ->{
			try {
				
				Employee employee = ctx.bodyAsClass(com.revature.models.Employee.class);
				ctx.result("You have successfully added Employee data::   " + employee);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		//	EmployeeDAOImp employeeDAO = new EmployeeDAOImp();
		});
		

	}

}
