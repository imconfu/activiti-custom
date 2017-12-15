package org.activiti.custom.identity;

import org.activiti.custom.security.domain.UserProfile;
import org.activiti.engine.identity.User;

public class CustomUser implements User {

	private static final long serialVersionUID = 2649609221604480100L;
	private UserProfile userProfile;

	public CustomUser(UserProfile userProfile) {
		this.userProfile =  userProfile;
	}
	
	
	public String getId() {
		return userProfile.getLoginName();
	}

	
	public void setId(String id) {
	}

	
	public String getFirstName() {
		return userProfile.getFirstName();
	}

	
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub

	}

	
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub

	}

	
	public String getLastName() {
		return userProfile.getLastName();
	}

	
	public void setEmail(String email) {
		// TODO Auto-generated method stub

	}

	
	public String getEmail() {
		return userProfile.getEmailAddress();
	}

	
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setPassword(String string) {
		// TODO Auto-generated method stub

	}


	public boolean isPictureSet() {
		// TODO Auto-generated method stub
		return false;
	}

}
