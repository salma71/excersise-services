package com.pluralsight;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.util.*;

import com.pluralsight.repository.*;
import com.pluralsight.model.*;

@Path("activities")
public class ActivityResource {
	private ActivityRepository activityRepository = new ActivityRepositoryStub();

	@POST
	@Path("activity")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Activity createActivityParams(MultivaluedMap<String, String> formParams){

		//debug info
		System.out.println(formParams.getFirst("description"));
		System.out.println(formParams.getFirst("duration"));

		Activity activity = new Activity();
		activity.setDescription(formParams.getFirst("description"));
		activity.setDuration(Integer.parseInt(formParams.getFirst("duration")));

		activityRepository.create(activity);
		return activity;
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Activity> getAllActivities(){
		return activityRepository.findAllActivities();
	}


	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{activityId}/user")
	public User getActivity(@PathParam("activityId") String activityId){
		Activity act = activityRepository.findActivity(activityId);
		User user = act.getUser();
		return user;
//		return activityRepository.findActivity(activityId).getUser();
	}

}
