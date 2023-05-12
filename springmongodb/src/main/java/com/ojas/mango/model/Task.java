package com.ojas.mango.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task")
public class Task {
	
	private String _id;
	private String issuetype;
	private String projectName;
	
	public Task(String _id, String issuetype, String projectName) {
		super();
		this._id = _id;
		this.issuetype = issuetype;
		this.projectName = projectName;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(String issuetype) {
		this.issuetype = issuetype;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Task [_id=" + _id + ", issuetype=" + issuetype + ", projectName=" + projectName + "]";
	}
	
	
	
	
	
	
	

}
