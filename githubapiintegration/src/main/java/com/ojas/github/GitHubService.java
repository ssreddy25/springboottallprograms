package com.ojas.github;

import java.io.IOException;
import java.util.List;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GitHubService {
	
	private final GitHub github;
    private final String username;

    public GitHubService(@Value("${github.username}") String username) throws IOException {
        this.github = GitHub.connect();
        this.username = username;
    }

    public List<GHRepository> getUserRepositories() throws IOException {
        return github.getUser(username).listRepositories().asList();
    }
	

}
