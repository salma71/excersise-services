package com.pluralsight.repository;

import java.util.*;

import com.pluralsight.model.Activity;

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
		
		Activity act_2 = new Activity();
		
		act_2.setDescription("walking");
		act_2.setDuration(55);
		
		activities.add(act_2);
		
		return activities;
	}
}
