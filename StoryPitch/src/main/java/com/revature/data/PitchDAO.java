package com.revature.data;

import com.revature.app.Pitch;
import com.revature.models.Status;

public interface PitchDAO extends GenericDAO<Pitch>{

	Status getByUsername(String firstName);

}
