package com.ojas.jira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.ojas.jira.model.IssueCreateRequest;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@RestController
public class TicketController {

	@Autowired
	private JiraRestClient jiraRestClient;

	@PostMapping("/issue")
	public String createIssue(@RequestBody IssueCreateRequest request) {
		System.out.println("siva sankar jira rest api conncet");
		//using jirarestClient getIssueClient() create object to a IssueRestClient
		
		IssueRestClient issueClient = jiraRestClient.getIssueClient();
		
		//set issues is a keyid and description ,
		IssueInputBuilder issueBuilder = new IssueInputBuilder();
		issueBuilder.setProjectKey(request.getProjectKey());
		issueBuilder.setIssueTypeId(request.getIssueType());
		issueBuilder.setSummary(request.getSummary());
		issueBuilder.setDescription(request.getDescription());
		
		
		
		issueClient.createIssue(issueBuilder.build()).claim();
		return "dfhkjdfh";
	}

}
