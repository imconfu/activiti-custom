package org.activiti.custom.security.domain;

public class GroupProfile {

	private String groupId;
	private String groupName;
	
	public GroupProfile() {
		super();
	}
	
	public GroupProfile(String groupId, String groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	

}
