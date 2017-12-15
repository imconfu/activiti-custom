package org.activiti.custom.dao;

import java.util.List;

import org.activiti.custom.security.domain.UserProfile;
import org.activiti.custom.spring.CustomUserEntityManager;

public interface UserDao {

	List<UserProfile> findAll();

	UserProfile findUserByLoginName(String id);

}
