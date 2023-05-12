package com.ojas.mango.services;

import java.util.List;
import java.util.Optional;

import com.ojas.mango.model.Task;

public interface TaskService {
	
	
	public String createTask(Task task);
	
	public void deleteTask(String id);
	
	public String updateTask(Task task);
	
	public Optional<Task> getTaskbyId(String id);
	
	public List<Task> getAllTask();
	
	
	

}
