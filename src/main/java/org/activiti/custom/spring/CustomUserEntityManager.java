package org.activiti.custom.spring;

import java.util.List;
import java.util.Map;

import org.activiti.custom.dao.UserDao;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.AbstractManager;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;
import org.activiti.engine.impl.persistence.entity.UserEntityManagerImpl;
import org.activiti.engine.impl.persistence.entity.data.UserDataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomUserEntityManager extends AbstractManager implements UserEntityManager {

	public CustomUserEntityManager(ProcessEngineConfigurationImpl processEngineConfiguration) {
		super(processEngineConfiguration);
	}

	public static Logger LOG = LoggerFactory
			.getLogger(CustomUserEntityManager.class);
	
	public UserEntity create() {
		throw new UnsupportedOperationException();
	}

	public void delete(String arg0) {
		throw new UnsupportedOperationException();
	}

	public void delete(UserEntity arg0) {
		throw new UnsupportedOperationException();
	}

	public void delete(UserEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();
	}

	public UserEntity findById(String arg0) {
		throw new UnsupportedOperationException();
	}

	public void insert(UserEntity arg0) {
		throw new UnsupportedOperationException();
	}

	public void insert(UserEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();
	}

	public UserEntity update(UserEntity arg0) {
		throw new UnsupportedOperationException();
	}

	public UserEntity update(UserEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();
	}

	public void deletePicture(User arg0) {
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupsByUser(String arg0) {
		throw new UnsupportedOperationException();
	}

	public long findUserCountByNativeQuery(Map<String, Object> arg0) {
		throw new UnsupportedOperationException();
	}

	public List<User> findUsersByNativeQuery(Map<String, Object> arg0, int arg1, int arg2) {
		throw new UnsupportedOperationException();
	}

	public Picture getUserPicture(String arg0) {
		throw new UnsupportedOperationException();
	}

	public boolean isNewUser(User arg0) {
		throw new UnsupportedOperationException();
	}

	public void setUserPicture(String arg0, Picture arg1) {
		throw new UnsupportedOperationException();
		
	}

	public void updateUser(User arg0) {
		throw new UnsupportedOperationException();
	}

	public Boolean checkPassword(String arg0, String arg1) {
		System.out.println("Check password with username: " + arg0);
		System.out.println("Check password with password: " + arg1);
		return true;
	}

	public User createNewUser(String arg0) {
		throw new UnsupportedOperationException();
	}

	public UserQuery createNewUserQuery() {
		throw new UnsupportedOperationException();
	}

	public List<User> findUserByQueryCriteria(UserQueryImpl arg0, Page arg1) {
		throw new UnsupportedOperationException();
	}

	public long findUserCountByQueryCriteria(UserQueryImpl arg0) {
		throw new UnsupportedOperationException();
	}

}
