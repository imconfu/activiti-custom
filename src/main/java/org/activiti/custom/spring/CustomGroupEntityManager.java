package org.activiti.custom.spring;

import java.util.List;
import java.util.Map;

import org.activiti.custom.dao.GroupDao;
import org.activiti.custom.dao.UserDao;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.AbstractManager;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.activiti.engine.impl.persistence.entity.GroupEntityManagerImpl;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;
import org.activiti.engine.impl.persistence.entity.data.GroupDataManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomGroupEntityManager extends AbstractManager implements GroupEntityManager {
	
	public CustomGroupEntityManager(ProcessEngineConfigurationImpl processEngineConfiguration) {
		super(processEngineConfiguration);
	}

	public static Logger LOG = LoggerFactory
			.getLogger(CustomUserEntityManager.class);

	public GroupEntity create() {
		throw new UnsupportedOperationException();
	}

	public void delete(String arg0) {
		throw new UnsupportedOperationException();
		
	}

	public void delete(GroupEntity arg0) {
		throw new UnsupportedOperationException();
		
	}

	public void delete(GroupEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();
		
	}

	public GroupEntity findById(String arg0) {
		throw new UnsupportedOperationException();
	}

	public void insert(GroupEntity arg0) {
		throw new UnsupportedOperationException();
	}

	public void insert(GroupEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();	
	}

	public GroupEntity update(GroupEntity arg0) {
		throw new UnsupportedOperationException();
	}

	public GroupEntity update(GroupEntity arg0, boolean arg1) {
		throw new UnsupportedOperationException();
	}

	public long findGroupCountByNativeQuery(Map<String, Object> arg0) {
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupsByNativeQuery(Map<String, Object> arg0, int arg1, int arg2) {
		throw new UnsupportedOperationException();
	}

	public boolean isNewGroup(Group arg0) {
		throw new UnsupportedOperationException();
	}

	public Group createNewGroup(String arg0) {
		throw new UnsupportedOperationException();
	}

	public GroupQuery createNewGroupQuery() {
		throw new UnsupportedOperationException();
	}

	public List<Group> findGroupByQueryCriteria(GroupQueryImpl arg0, Page arg1) {
		throw new UnsupportedOperationException();
	}

	public long findGroupCountByQueryCriteria(GroupQueryImpl arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Group> findGroupsByUser(String arg0) {
		throw new UnsupportedOperationException();
	}  

	public void insert(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void insert(UserEntity entity, boolean fireCreateEvent) {
		// TODO Auto-generated method stub
		
	}

	public UserEntity update(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserEntity update(UserEntity entity, boolean fireUpdateEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(UserEntity entity, boolean fireDeleteEvent) {
		// TODO Auto-generated method stub
		
	}

	public User createNewUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public long findUserCountByQueryCriteria(UserQueryImpl query) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UserQuery createNewUserQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean checkPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public Picture getUserPicture(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserPicture(String userId, Picture picture) {
		// TODO Auto-generated method stub
		
	}

	public void deletePicture(User user) {
		// TODO Auto-generated method stub
		
	}


}
