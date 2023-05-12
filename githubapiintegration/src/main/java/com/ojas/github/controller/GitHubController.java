package com.ojas.github.controller;

import java.io.IOException;
import java.util.List;

import org.kohsuke.github.GHRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.ojas.github.GitHubService;

@RestController
public class GitHubController {
	
	@Autowired
    private GitHubService gitHubService;

   

    @GetMapping("/repositories")
    public String getUserRepositories() throws IOException {
    	System.out.println("connected");
    	 List<GHRepository> repositories = gitHubService.getUserRepositories();
        
        return "repositories";
    }

}
