package org.activiti.custom.security.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.custom.dao.GroupDao;
import org.activiti.custom.security.domain.GroupProfile;;

public class GroupStaticDao implements GroupDao{

	Map<String, GroupProfile> groupMap = new HashMap<String, GroupProfile>();
	
	public GroupStaticDao() {
		GroupProfile aGroup = new GroupProfile();
		aGroup.setGroupId("aa");
		aGroup.setGroupName("Group Name A");
		groupMap.put(aGroup.getGroupName(), aGroup);
	}
	
	public List<GroupProfile> findAll() {
		return new ArrayList<GroupProfile>(groupMap.values());
	}

	public GroupProfile findUserByLoginName(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
