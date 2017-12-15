package org.activiti.custom.identity;

import org.activiti.engine.identity.Group;

public class CustomGroup implements Group{

	private static final long serialVersionUID = 7027363138258964237L;
	private String id;
	private String type;

	public CustomGroup(String id, String type) {
		this.id = id;
		this.type = type;
	}
	
	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	
	public String getName() {
		return id;
	}

	
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	
	public String getType() {
		return this.type;
	}

	
	public void setType(String string) {
		// TODO Auto-generated method stub
		
	}

}
