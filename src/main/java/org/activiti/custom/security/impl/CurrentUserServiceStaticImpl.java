package org.activiti.custom.security.impl;

import org.activiti.custom.security.CurrentUserService;
import org.activiti.custom.security.domain.UserProfile;

public class CurrentUserServiceStaticImpl implements CurrentUserService{

	UserProfile currentUser;
	
	public CurrentUserServiceStaticImpl() {
		currentUser = new UserProfile();
		currentUser.setLoginName("qa");
		currentUser.setFirstName("Qa");
		currentUser.setLastName("Qa");
		currentUser.setEmailAddress("qa@qa.lt");
	}
	
	
	public UserProfile getCurrentUser() {
		return currentUser;
	}

}
