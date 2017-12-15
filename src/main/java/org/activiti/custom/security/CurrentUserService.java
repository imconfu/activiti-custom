package org.activiti.custom.security;

import org.activiti.custom.security.domain.UserProfile;

public interface CurrentUserService {

	UserProfile getCurrentUser();

}
