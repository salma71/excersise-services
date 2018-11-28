package com.pluralsight;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

import com.pluralsight.repository.*;
import com.pluralsight.model.*;

@Path("activities")
public class ActivityResource {
	private ActivityRepository activityRepository = new ActivityRepositoryStub();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Activity> getAllActivities(){
		return activityRepository.findAllActivities();
	}
	

}
