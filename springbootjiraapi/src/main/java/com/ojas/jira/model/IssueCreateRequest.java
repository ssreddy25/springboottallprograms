package com.ojas.jira.model;



import org.springframework.stereotype.Component;

@Component
public class IssueCreateRequest {
	
	private String projectKey;
    private Long issueType;
    private String summary;
    private String description;
   
    
    public IssueCreateRequest() {
    	
    }

	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}

	public Long getIssueType() {
		return issueType;
	}

	public void setIssueType(Long issueType) {
		this.issueType = issueType;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
    

}
