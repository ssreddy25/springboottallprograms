package com.ojas.jira.config;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.RestClientException;
import com.atlassian.jira.rest.client.auth.BasicHttpAuthenticationHandler;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

@Configuration
public class JiraConfig {

	@Value("${jira.server.url}")
	private URI jiraServerUrl;

	@Value("${jira.username}")
	private String jiraUsername;

	@Value("${jira.password}")
	private String jiraPassword;

	@Bean
	public JiraRestClient jiraRestClient() throws RestClientException {
		JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
		AuthenticationHandler authHandler = new BasicHttpAuthenticationHandler(jiraUsername, jiraPassword);
		return factory.createWithAuthenticationHandler(jiraServerUrl, authHandler);
	}

}
