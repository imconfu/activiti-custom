package org.activiti.custom.dao;

import java.util.List;

import org.activiti.custom.security.domain.GroupProfile;
import org.activiti.custom.spring.CustomUserEntityManager;

public interface GroupDao {

	List<GroupProfile> findAll();

	GroupProfile findUserByLoginName(String id);

}
