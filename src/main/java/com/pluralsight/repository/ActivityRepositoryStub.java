package com.pluralsight.repository;

import java.util.*;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepasitory#findAllActivity()
	 */
	
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		Activity act_1 = new Activity();
		
		act_1.setDescription("Swimming");
		act_1.setDuration(30);
		
		activities.add(act_1);

		User user = new User();
		user.setId("65743");
		user.setName("Salma");
		act_1.getUser(user);
		
		Activity act_2 = new Activity();
		
		act_2.setDescription("walking");
		act_2.setDuration(55);
		
		activities.add(act_2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		return null;
	}
}
