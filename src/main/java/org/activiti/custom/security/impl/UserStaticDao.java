package org.activiti.custom.security.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.custom.dao.UserDao;
import org.activiti.custom.security.domain.UserProfile;

public class UserStaticDao implements UserDao{

	Map<String, UserProfile> userMap = new HashMap<String, UserProfile>();
	
	public UserStaticDao() {
		UserProfile aUser = new UserProfile();
		aUser.setLoginName("qa");
		aUser.setFirstName("Qa");
		aUser.setLastName("Qa");
		aUser.setEmailAddress("qa@qa.lt");
		userMap.put(aUser.getLoginName(), aUser);
		
		aUser = new UserProfile();
		aUser.setLoginName("dev");
		aUser.setFirstName("dev");
		aUser.setLastName("dev");
		aUser.setEmailAddress("dev@dev.lt");
		userMap.put(aUser.getLoginName(), aUser);
	}
	
	public List<UserProfile> findAll() {
		return new ArrayList<UserProfile>(userMap.values());
	}
	
	public UserProfile findUserByLoginName(String id) {
		return userMap.get(id);
	}

}
