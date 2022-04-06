package com.revature.app;
import com.revature.data.DAOFactory;
import com.revature.data.PitchDAO;
import com.revature.data.PitchDAOImp;

import io.javalin.Javalin;

public class PitchApp {
	
	
	public static void main(String[] args) throws Exception {
		
		Javalin app = Javalin.create().start(8082);
		
		
		
		app.get("/pitch", ctx -> {
			ctx.result("Pitch");
		});
	
	
		app.post("/pitch", ctx -> {
	// create a Pitch obj. We get this data from the body of the HTTP request	
	// connect to AWS RDS :
	// String url= "jbdc:postgres:// copy the RDS address here and configure a new Database in DBBeaver
			try {
				Pitch pitch = ctx.bodyAsClass(com.revature.app.Pitch.class);
				ctx.result("You have successfully added Pitch data::   " + pitch);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
	// get PitchDAO from the DAOFactory by anchoring it with getPitchDAO method		
		//	 PitchDAOImp pitchDAO = new PitchDAOImp();
			 
			
		});
		
	}
	
}